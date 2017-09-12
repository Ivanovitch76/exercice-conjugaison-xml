package be.steformations.java_data.conjugaison_fr.xml.interfaces;

import be.steformations.java_data.conjugaison_fr.interfaces.Verbe;

public interface XMLVerbeDOMHandler {
	
	/**
	 * crée une instance de Verbe à partir des informations contenue dans un document XML respectant le schéma "verbe.xsd"
	 * 
	 * @param document un org.w3c.dom.Document respectant le schéma "verbe.xsd"
	 * @return une instance de Verbe
	 */
	Verbe getVerbe(org.w3c.dom.Document document);
	
	/**
	 * crée un org.w3c.dom.Document respectant le schéma "verbe.xsd" contenant les propriétés d'un Verbe
	 * 
	 * @param verbe le Verbe dont les propriétés sont la source du org.w3c.dom.Document
	 * @return org.w3c.dom.Document respectant le schéma "verbe.xsd"
	 */
	org.w3c.dom.Document getVerbeAsDOMDocument(Verbe verbe);
	
	/**
	 * crée un org.w3c.dom.Document respectant le schéma "verbe.xsd" contenant les propriétés d'un Verbe
	 * 
	 * @param infinitif l'infinitif du Verbe dont les propriétés sont la source du org.w3c.dom.Document
	 * @return Document respectant le schéma "verbe.xsd"
	 */
	org.w3c.dom.Document getVerbeAsDOMDocument(String infinitif);
}
