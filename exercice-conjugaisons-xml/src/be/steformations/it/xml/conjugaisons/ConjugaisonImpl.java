package be.steformations.it.xml.conjugaisons;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;
import be.steformations.java_data.conjugaison_fr.interfaces.Verbe;

public class ConjugaisonImpl implements Conjugaison {

	@Override
	public Mode getMode() {
		Mode mode = null;
		return mode;
	}

	@Override
	public Temps getTemps() {
		Temps temps = null;
		return temps;
	}

	@Override
	public Verbe getVerbe() {
		Verbe verbe = null;
		return verbe;
	}

	@Override
	public Personne getPersonne() {
		Personne personne = null;
		return personne;
	}

	@Override
	public String getValeur() {
		String valeur = null;
		return valeur;
	}

}
