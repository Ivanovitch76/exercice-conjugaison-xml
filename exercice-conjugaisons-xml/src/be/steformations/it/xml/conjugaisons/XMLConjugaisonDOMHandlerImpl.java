package be.steformations.it.xml.conjugaisons;

import org.w3c.dom.Document;

import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugaisonDOMHandler;

public class XMLConjugaisonDOMHandlerImpl implements XMLConjugaisonDOMHandler {

	/**
	 * recherche la valeur d'une conjugaison dans un document XML respectant le schÃ©ma "conjugaisons.xsd"
	 * 
	 * @param source org.w3c.dom.Document au format "conjugaisons.xsd"
	 * @param mode le Mode de la Conjugaison recherchÃ©e
	 * @param temps le Temps de la Conjugaison recherchÃ©e
	 * @param personne la Personne de la Conjugaison recherchÃ©e
	 * @return la valeur de la Conjugaison recherchÃ©e
	 */
	
	@Override
	public String getConjugaisonItem(Document doc, Mode mode, Temps temps, Personne personne) {
//		try {
//			javax.xml.transform.Source source = new javax.xml.transform.dom.DOMSource(doc);
//
//			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
//			javax.xml.transform.Result destination = new javax.xml.transform.stream.StreamResult(baos);
//
//			javax.xml.transform.TransformerFactory.newInstance().newTransformer().transform(source, destination);
//
//			String xml = baos.toString();
//			System.out.println(xml);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String conjugaison=null;		
		org.w3c.dom.Node racine = doc.getDocumentElement();
		org.w3c.dom.NodeList modes = racine.getChildNodes();
		for (int i = 0; i < modes.getLength(); i++){
			org.w3c.dom.Node goodMode = modes.item(i);	
			if (goodMode.getNodeName().equals(mode.name().toLowerCase())){
				//System.out.println(goodMode.getNodeName());
				org.w3c.dom.NodeList tempss = goodMode.getChildNodes();
				for (int j = 0; j < tempss.getLength(); j++){
					org.w3c.dom.Node goodTemps = tempss.item(j);
					if (goodTemps.getNodeName().equals(temps.name().toLowerCase().replaceFirst("passe", "passe_simple").replaceAll("_", "-")) &&
					    goodMode.getNodeName().equals("indicatif")){	
						conjugaison=getGoodPersonne(goodTemps, personne);
						//System.out.println(goodTemps.getNodeName());

					} else if (goodTemps.getNodeName().equals(temps.name().toLowerCase().replaceAll("_", "-"))){
						conjugaison=getGoodPersonne(goodTemps, personne);											
					}
				}
			}
			
		}
		
		return conjugaison;  
	}
	
	public String getGoodPersonne(org.w3c.dom.Node goodTemps, Personne personne){
		String conjugaison = null;
		org.w3c.dom.NodeList personnes = goodTemps.getChildNodes();
		for (int k = 0; k < personnes.getLength(); k++){
			org.w3c.dom.Node goodPersonne = personnes.item(k);
			if (goodPersonne.getNodeName().equals(personne.name().toLowerCase().replaceAll("_", "-"))){
				//System.out.println(goodPersonne.getNodeName());
				conjugaison = goodPersonne.getTextContent();
			}
		}		
		
		return conjugaison;		
	}



}
