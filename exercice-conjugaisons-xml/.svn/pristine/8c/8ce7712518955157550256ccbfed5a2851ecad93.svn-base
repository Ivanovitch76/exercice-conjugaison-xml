package be.steformations.java_data.conjugaison_fr.interfaces;

import java.io.Serializable;

public interface Verbe extends Serializable  {

	/**
	 * Renvoie le {@link Verbe} qui permet de déduire le radical, l'infinitif et les {@link Conjugaison}
	 * 
	 * @return le modèle du verbe
	 */
	Verbe  getModele();
	
	/**
	 * Renvoie l'infinitif
	 * 
	 * @return l'infinitif du Verbe
	 */
	String getInfinitif();
	
	/**
	 * Renvoie le radical du {@link Verbe}
	 * Exemple: l'infinitif "programmer" a pour radical "programm"
	 * 
	 * @return le radical du Verbe
	 */
	String getRadical();
	
	/**
	 * Renvoie l'{@link Auxiliaire} à utiliser dans les {@link Conjugaison} composées
	 * Exemple: "programmer" se conjugue avec l'auxiliaire "avoir"
	 * 
	 * @return l'auxiliaire du Verbe
	 */
	Auxiliaire getAuxiliaire();
	
	/**
	 * Renvoie le participe passé à utiliser dans les {@link Conjugaison} composées
	 * Exemple: le participe passé de "programmer" est "programmé"
	 * 
	 * @return le participe passé du Verbe
	 */
	String getParticipe();
}
