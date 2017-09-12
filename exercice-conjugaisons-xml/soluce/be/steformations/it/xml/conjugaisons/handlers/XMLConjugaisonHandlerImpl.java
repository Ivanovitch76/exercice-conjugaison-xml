package be.steformations.it.xml.conjugaisons.handlers;

import be.steformations.it.xml.conjugaisons.helpers.EnumHelper;
import be.steformations.it.xml.conjugaisons.helpers.XMLHelper;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugaisonDOMHandler;

public class XMLConjugaisonHandlerImpl implements XMLConjugaisonDOMHandler {

	protected XMLHelper xmlUtils;
	protected EnumHelper enumUtils;
	
	public XMLConjugaisonHandlerImpl() {
		super();
		this.xmlUtils = new XMLHelper();
		this.enumUtils = new EnumHelper();
	}
	
	@Override
	public String getConjugaisonItem(org.w3c.dom.Document source, Mode mode, Temps temps, Personne personne) {
		String value = null;
		
		if (source != null && mode != null && temps != null && personne != null) {
			String smode = this.enumUtils.modeToString(mode);
			String stemps = this.enumUtils.tempsToString(mode, temps);
			String spersonne = this.enumUtils.personneToString(personne);
			
			// value = this.getConjugaisonItemWithRegex(source, smode, stemps, spersonne);
			// value = this.getConjugaisonItemWithXpath(source, smode, stemps, spersonne);
			// value = this.getConjugaisonItemWithLoop(source, smode, stemps, spersonne);
			value = this.getConjugaisonItemWithGetElementsByTagName(source, smode, stemps, spersonne);
		}
		
		return value;
	}
	
	protected String getConjugaisonItemWithRegex(org.w3c.dom.Document source, String smode, String stemps, String spersonne) {
		String value = null;

		String xml = this.xmlUtils.node2String(source.getDocumentElement());
		String regex = String.format("<%s>.*?<%s>.*?<%s>(.*?)<", smode, stemps, spersonne);
		java.util.regex.Matcher matcher 
			= java.util.regex.Pattern.compile(regex, java.util.regex.Pattern.CASE_INSENSITIVE)
				.matcher(xml);
		if (matcher.find()) {
			value = matcher.group(1);
		}
		
		return value;
	}
	
	protected String getConjugaisonItemWithXpath(org.w3c.dom.Document source, String smode, String stemps, String spersonne) {
		String value = null;
		
		String query = String.format("//%s/%s/%s", smode, stemps, spersonne);
		try {
			org.w3c.dom.Node node 
				= (org.w3c.dom.Node)
					javax.xml.xpath.XPathFactory.newInstance()
						.newXPath()
							.evaluate(query, source, javax.xml.xpath.XPathConstants.NODE);
			if (node != null) {
				value = node.getTextContent();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
	protected String getConjugaisonItemWithLoop(org.w3c.dom.Document source, String smode, String stemps, String spersonne) {
		String value = null;
		
		org.w3c.dom.Node racine = source.getDocumentElement();
		org.w3c.dom.NodeList modes = racine.getChildNodes();
		for (int i = 0; i < modes.getLength() && value == null; i++) {
			if (modes.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				org.w3c.dom.Node mode = modes.item(i);
				if (mode.getNodeName().equals(smode)) {
					org.w3c.dom.NodeList temps = mode.getChildNodes();
					for (int j = 0; j < temps.getLength() && value == null; j++) {
						if (temps.item(j).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
							org.w3c.dom.Node tempsNode = temps.item(j);
							if (tempsNode.getNodeName().equals(stemps)) {
								org.w3c.dom.NodeList personnes = tempsNode.getChildNodes(); 
								for (int k = 0; k < personnes.getLength() && value == null; k++) {
									if (personnes.item(k).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
										org.w3c.dom.Node personne = personnes.item(k);
										if (personne.getNodeName().equals(spersonne)) {
											value = personne.getTextContent();
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		return value;
	}
	
	protected String getConjugaisonItemWithGetElementsByTagName(org.w3c.dom.Document source, String smode, String stemps, String spersonne) {
		String value = null;
		
		org.w3c.dom.NodeList modes = source.getElementsByTagName(smode);
		if (modes.getLength() > 0) {
			org.w3c.dom.Element goodMode = (org.w3c.dom.Element) modes.item(0);
			org.w3c.dom.NodeList temps = goodMode.getElementsByTagName(stemps);
			if (temps.getLength() > 0) {
				org.w3c.dom.Element goodTemps = (org.w3c.dom.Element) temps.item(0);
				org.w3c.dom.NodeList personnes = goodTemps.getElementsByTagName(spersonne);
				if (personnes.getLength() > 0) {
					org.w3c.dom.Node goodPersonne = personnes.item(0);
					value = goodPersonne.getTextContent();
				}
			}
		}
		
		return value;
	}

}


