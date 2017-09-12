package be.steformations.it.xml.conjugaisons;

import org.w3c.dom.Document;

import be.steformations.java_data.conjugaison_fr.interfaces.Auxiliaire;
import be.steformations.java_data.conjugaison_fr.interfaces.Verbe;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler;

public class XMLVerbeDOMHandlerImpl implements XMLVerbeDOMHandler{

	
	
	@Override
	/**
	 * crée une instance de Verbe à partir des informations contenue dans un document XML respectant le schéma "verbe.xsd"
	 * 
	 * @param document un org.w3c.dom.Document respectant le schéma "verbe.xsd"
	 * @return une instance de Verbe
	 */	
	public Verbe getVerbe(Document document) {
//		try {
//		javax.xml.transform.Source source = new javax.xml.transform.dom.DOMSource(document);
//
//		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
//		javax.xml.transform.Result destination = new javax.xml.transform.stream.StreamResult(baos);
//
//		javax.xml.transform.TransformerFactory.newInstance().newTransformer().transform(source, destination);
//
//		String xml = baos.toString();
//		System.out.println(xml);
//		} catch (Exception e) {	
//			e.printStackTrace();
//		}		

		VerbeImpl verbe = null;
		org.w3c.dom.Node racine = document.getDocumentElement();
		org.w3c.dom.NodeList node = racine.getChildNodes();
		if (document != null) {
			verbe = new VerbeImpl();
			for (int i = 0; i < node.getLength(); i++) {
				org.w3c.dom.Node nodes = node.item(i);
				if (nodes.getNodeName().equals("infinitif")) {
					verbe.setInfinitif(nodes.getTextContent());
				}
				if (nodes.getNodeName().equals("radical")) {
					if (nodes.getTextContent().equals("")){
//					if (nodes.getTextContent().isEmpty()){
						verbe.setRadical(null);
					} else {
						verbe.setRadical(nodes.getTextContent());
					}	
				}				
				if (nodes.getNodeName().equals("auxiliaire")) {		
					if (nodes.getTextContent().equals("avoir")){
					verbe.setAuxiliaire(Auxiliaire.AVOIR);
					} else {
					verbe.setAuxiliaire(Auxiliaire.ETRE);
					}
				}				
				if (nodes.getNodeName().equals("participe")) {
					verbe.setParticipe(nodes.getTextContent());
				}				
				if (nodes.getNodeName().equals("modele")) {					
					org.w3c.dom.NodeList modele = nodes.getChildNodes();
					VerbeImpl model = getModel(modele);

					if (model.getAuxiliaire() == null){
						model.setAuxiliaire(Auxiliaire.AVOIR);
					}
					verbe.setModele(model);
				}				
			}	
		}
		if (verbe.getAuxiliaire() == null){
			verbe.setAuxiliaire(Auxiliaire.AVOIR);
		}
		
		if (verbe.getModele() == null){
			VerbeImpl modele = getModel(node);
			verbe.setModele(modele);
		}		
		return verbe;
	}
	
	public VerbeImpl getModel(org.w3c.dom.NodeList modele){
		VerbeImpl model = new VerbeImpl();
		for (int j = 0; j < modele.getLength(); j++) {
			org.w3c.dom.Node mod = modele.item(j);
			if (mod.getNodeName().equals("infinitif")) {
				model.setInfinitif(mod.getTextContent());
			}
			if (mod.getNodeName().equals("radical")) {
				if (mod.getTextContent().equals("")){
					model.setRadical(null);
				} else {
					model.setRadical(mod.getTextContent());
				}	
			}				
			if (mod.getNodeName().equals("auxiliaire")) {		
				if (mod.getTextContent().equals("avoir")){
				model.setAuxiliaire(Auxiliaire.AVOIR);
				} else {
				model.setAuxiliaire(Auxiliaire.ETRE);
				}
			}				
			if (mod.getNodeName().equals("participe")) {
				model.setParticipe(mod.getTextContent());
			}	
		}	
		if (model.getAuxiliaire() == null){
			model.setAuxiliaire(Auxiliaire.AVOIR);
		}
		
		return model;

	}
	
	
	/**
	 * crée un org.w3c.dom.Document respectant le schéma "verbe.xsd" contenant les propriétés d'un Verbe
	 * 
	 * @param verbe le Verbe dont les propriétés sont la source du org.w3c.dom.Document
	 * @return org.w3c.dom.Document respectant le schéma "verbe.xsd"
	 */	
	@Override
	public Document getVerbeAsDOMDocument(Verbe verbe) {

		Document doc = null;
		org.w3c.dom.Node verbeNode = null;
		
		try{
			doc = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			verbeNode = doc.createElement("verbe");
			doc.appendChild(verbeNode);
			
			org.w3c.dom.Node infinitifNode = doc.createElement("infinitif");
			org.w3c.dom.Node infinitifValue = doc.createTextNode(verbe.getInfinitif());
			infinitifNode.appendChild(infinitifValue);
			verbeNode.appendChild(infinitifNode);
			
			org.w3c.dom.Node radicalNode = doc.createElement("radical");
			org.w3c.dom.Node radicalValue = doc.createTextNode(verbe.getRadical());

			radicalNode.appendChild(radicalValue);
			verbeNode.appendChild(radicalNode);		
			
			org.w3c.dom.Node auxiliaireNode = doc.createElement("auxiliaire");
			org.w3c.dom.Node auxiliaireValue = doc.createTextNode("avoir");			
			System.out.println("auxil: " + verbe.getAuxiliaire());
			if (verbe.getAuxiliaire().equals("ETRE")){
				auxiliaireValue = doc.createTextNode("être");
			} 
			auxiliaireNode.appendChild(auxiliaireValue);
			verbeNode.appendChild(auxiliaireNode);
			
			org.w3c.dom.Node participeNode = doc.createElement("participe");
			org.w3c.dom.Node participeValue = doc.createTextNode(verbe.getParticipe());
			participeNode.appendChild(participeValue);
			verbeNode.appendChild(participeNode);	
			
			org.w3c.dom.Node modeleNode = doc.createElement("modele");
			verbeNode.appendChild(modeleNode);	

			org.w3c.dom.Node infModeNode = doc.createElement("infinitif");
			org.w3c.dom.Node infModeValue = doc.createTextNode(verbe.getInfinitif());
			infModeNode.appendChild(infModeValue);
			modeleNode.appendChild(infModeNode);
			
			org.w3c.dom.Node radModeNode = doc.createElement("radical");
			org.w3c.dom.Node radModeValue = doc.createTextNode(verbe.getRadical());
			radModeNode.appendChild(radModeValue);
			modeleNode.appendChild(radModeNode);
			
			org.w3c.dom.Node auxModeNode = doc.createElement("auxiliaire");
			org.w3c.dom.Node auxModeValue = doc.createTextNode("avoir");			
			System.out.println("auxil: " + verbe.getAuxiliaire());
			if (verbe.getAuxiliaire().equals("ETRE")){
				auxiliaireValue = doc.createTextNode("être");
			} 			
			auxModeNode.appendChild(auxModeValue);
			modeleNode.appendChild(auxModeNode);
			
			org.w3c.dom.Node parModeNode = doc.createElement("participe");
			org.w3c.dom.Node parModeValue = doc.createTextNode(verbe.getParticipe());
			parModeNode.appendChild(parModeValue);
			modeleNode.appendChild(parModeNode);
			
		} catch (Exception e){
			e.printStackTrace();
		}
//		try {
//		javax.xml.transform.Source source = new javax.xml.transform.dom.DOMSource(doc);
//
//		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
//		javax.xml.transform.Result destination = new javax.xml.transform.stream.StreamResult(baos);
//
//		javax.xml.transform.TransformerFactory.newInstance().newTransformer().transform(source, destination);
//
//		String xml = baos.toString();
//		System.out.println(xml);
//		} catch (Exception e) {	
//			e.printStackTrace();
//		}			
		return doc;
	}
	
	/**
	 * crée un org.w3c.dom.Document respectant le schéma "verbe.xsd" contenant les propriétés d'un Verbe
	 * 
	 * @param infinitif l'infinitif du Verbe dont les propriétés sont la source du org.w3c.dom.Document
	 * @return Document respectant le schéma "verbe.xsd"
	 */	
	@Override
	public Document getVerbeAsDOMDocument(String infinitif) {
 		return null;
	}

}
