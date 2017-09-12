package be.steformations.it.xml.conjugaisons.handlers;

import be.steformations.it.xml.conjugaisons.beans.VerbeImpl;
import be.steformations.it.xml.conjugaisons.helpers.ModeleSearcher;
import be.steformations.java_data.conjugaison_fr.interfaces.Auxiliaire;
import be.steformations.java_data.conjugaison_fr.interfaces.Verbe;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler;

public class XMLVerbeDomHandlerImpl implements XMLVerbeDOMHandler {

	protected ModeleSearcher modeleSearcher;
	
	public XMLVerbeDomHandlerImpl() {
		super();
		this.modeleSearcher = new ModeleSearcher();
	}
	
	@Override
	public VerbeImpl getVerbe(org.w3c.dom.Document document) {
		VerbeImpl verbe = null;
		if (document != null) {
			verbe = this.createVerbeFromNode(document.getDocumentElement());
		}
		return verbe;
	}
	
	@Override
	public org.w3c.dom.Document getVerbeAsDOMDocument(Verbe verbe) {
		org.w3c.dom.Document doc = null;
		if (verbe != null) {
			try {
				doc = javax.xml.parsers.DocumentBuilderFactory.newInstance()
						.newDocumentBuilder()
							.newDocument();
				org.w3c.dom.Element racine = doc.createElement("verbe");
				doc.appendChild(racine);
				this.createNodeFromVerbe(doc, racine, verbe);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return doc;
	}

	@Override
	public org.w3c.dom.Document getVerbeAsDOMDocument(String infinitif) {
		org.w3c.dom.Document doc = null;
		
		VerbeImpl modele = this.modeleSearcher.searchModele(infinitif);
		if (modele != null) {
			VerbeImpl verbe = new VerbeImpl();
			verbe.setInfinitif(infinitif);
			verbe.setAuxiliaire(modele.getAuxiliaire());
			if (modele.getRadical() != null) {
				verbe.setRadical(
					infinitif.substring(
						0, infinitif.length() - (modele.getInfinitif().length() - modele.getRadical().length()))
				);
				verbe.setParticipe(
					String.format("%s%s", 
						verbe.getRadical(),
						modele.getParticipe().substring(modele.getRadical().length())));
			} else {
				verbe.setParticipe(modele.getParticipe());
			}
			verbe.setModele(modele);
			doc = this.getVerbeAsDOMDocument(verbe);
		}
		
		return doc;
	}
	
	protected void createNodeFromVerbe(org.w3c.dom.Document doc, org.w3c.dom.Element parent, Verbe verbe) {
		org.w3c.dom.Element element = doc.createElement("infinitif");
		element.setTextContent(verbe.getInfinitif());
		parent.appendChild(element);
		
		element = doc.createElement("radical");
		if (verbe.getRadical() != null) {
			element.setTextContent(verbe.getRadical());
		} 
		parent.appendChild(element);
		
		element = doc.createElement("auxiliaire");
		element.setTextContent(verbe.getAuxiliaire() == Auxiliaire.AVOIR ? "avoir" : "être");
		parent.appendChild(element);
		
		element = doc.createElement("participe");
		element.setTextContent(verbe.getParticipe());
		parent.appendChild(element);
		
		if (verbe.getModele() != verbe) {
			element = doc.createElement("modele");
			this.createNodeFromVerbe(doc, element, verbe.getModele());
			parent.appendChild(element);
		}
	}
	
	protected VerbeImpl createVerbeFromNode(org.w3c.dom.Node element) {
		VerbeImpl verbe = new VerbeImpl();
		verbe.setAuxiliaire(Auxiliaire.AVOIR);
		
		org.w3c.dom.NodeList nodes = element.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			org.w3c.dom.Node node = nodes.item(i);
			if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				String valeur = node.getTextContent();
				switch (node.getNodeName()) {
				case "infinitif":
					verbe.setInfinitif(valeur);
					break;
				case "radical":
					verbe.setRadical(valeur.isEmpty() ? null : valeur);
					break;
				case "auxiliaire":
					verbe.setAuxiliaire("avoir".equals(valeur) ? Auxiliaire.AVOIR : Auxiliaire.ETRE);
					break;
				case "participe":
					verbe.setParticipe(valeur);
					break;
				case "modele":
					verbe.setModele(this.createVerbeFromNode(node));
					break;
				default:
					break;
				}
			}
		}
		
		return verbe;
	}
}
