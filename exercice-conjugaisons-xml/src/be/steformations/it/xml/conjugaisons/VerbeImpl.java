package be.steformations.it.xml.conjugaisons;

import org.w3c.dom.NodeList;

import be.steformations.java_data.conjugaison_fr.interfaces.Auxiliaire;
import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Verbe;

public class VerbeImpl implements Verbe{

	Verbe modele = null;
	String infinitif = null;
	String radical = null;	
	Auxiliaire auxiliaire = null;	
	String participe = null;	
	/**
	 * Renvoie le {@link Verbe} qui permet de déduire le radical, l'infinitif et les {@link Conjugaison}
	 * 
	 * @return le modèle du verbe
	 */	
	@Override
	public Verbe getModele() {
		return modele;
	}

	/**
	 * Renvoie l'infinitif
	 * @param node 
	 * 
	 * @return l'infinitif du Verbe
	 */	
	@Override
	public String getInfinitif() {		
		return infinitif;
	}

	/**
	 * Renvoie le radical du {@link Verbe}
	 * Exemple: l'infinitif "programmer" a pour radical "programm"
	 * 
	 * @return le radical du Verbe
	 */	
	@Override
	public String getRadical() {
		return radical;
	}

	/**
	 * Renvoie l'{@link Auxiliaire} à utiliser dans les {@link Conjugaison} composées
	 * Exemple: "programmer" se conjugue avec l'auxiliaire "avoir"
	 * 
	 * @return l'auxiliaire du Verbe
	 */	
	@Override
	public Auxiliaire getAuxiliaire() {
		return auxiliaire;
	}

	/**
	 * Renvoie le participe passé à utiliser dans les {@link Conjugaison} composées
	 * Exemple: le participe passé de "programmer" est "programmé"
	 * 
	 * @return le participe passé du Verbe
	 */	
	@Override
	public String getParticipe() {
		return participe;
	}

	public void setModele(Verbe modele) {
		this.modele = modele;
	}

	public void setInfinitif(String infinitif) {
		this.infinitif = infinitif;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	@Override
	public String toString() {
		return "VerbeImpl [modele=" + modele + ", infinitif=" + infinitif + ", radical=" + radical + ", auxiliaire="
				+ auxiliaire + ", participe=" + participe + "]";
	}

	public void setAuxiliaire(Auxiliaire auxiliaire) {
		this.auxiliaire = auxiliaire;
	}

	public void setParticipe(String participe) {
		this.participe = participe;
	}

	
	
}
