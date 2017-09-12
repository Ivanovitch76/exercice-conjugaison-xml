package be.steformations.java_data.conjugaison_fr.xml.interfaces;

import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;

public interface XMLConjugaisonDOMHandler {
	
	/**
	 * recherche la valeur d'une conjugaison dans un document XML respectant le schéma "conjugaisons.xsd"
	 * 
	 * @param source org.w3c.dom.Document au format "conjugaisons.xsd"
	 * @param mode le Mode de la Conjugaison recherchée
	 * @param temps le Temps de la Conjugaison recherchée
	 * @param personne la Personne de la Conjugaison recherchée
	 * @return la valeur de la Conjugaison recherchée
	 */
	String getConjugaisonItem(org.w3c.dom.Document source, Mode mode, Temps temps, Personne personne);
}
