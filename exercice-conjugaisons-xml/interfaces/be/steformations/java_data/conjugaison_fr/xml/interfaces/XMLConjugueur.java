package be.steformations.java_data.conjugaison_fr.xml.interfaces;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;

public interface XMLConjugueur {	
	
	/**
	 * recherche la Conjugaison d'un Verbe à un Mode, un Temps et une Personne donnés
	 * 
	 * @param in java.io.InputStream sur un document XML respectant le schéma "verbe.xsd"
	 * @param mode le Mode de la Conjugaison recherchée
	 * @param temps le Temps de la Conjugaison recherchée
	 * @param personne la Personne de la Conjugaison recherchée
	 * @return la Conjugaison correspondante
	 */
	Conjugaison getConjugaison(java.io.InputStream in, Mode mode, Temps temps, Personne personne);
	
	/**
	 * recherche les Conjugaison (toutes les personnes) d'un Verbe à un Mode et un Temps donnés
	 * 
	 * @param in java.io.InputStream sur un document XML respectant le schéma "verbe.xsd"
	 * @param mode le Mode des Conjugaison
	 * @param temps le Temps des Conjugaison
	 * @return une java.util.List de Conjugaison ordonnée les Personne
	 */
	java.util.List<Conjugaison> getConjugaisons(java.io.InputStream in, Mode mode, Temps temps);

}
