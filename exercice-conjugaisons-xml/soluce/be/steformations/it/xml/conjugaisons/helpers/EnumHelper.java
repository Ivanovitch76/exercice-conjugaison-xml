package be.steformations.it.xml.conjugaisons.helpers;

import be.steformations.java_data.conjugaison_fr.interfaces.Auxiliaire;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;

public class EnumHelper {
	
	public String modeToString(Mode mode) {
		return mode.name().toLowerCase();
	}
	
	public String tempsToString(Mode mode, Temps temps) {
		String tag = null;
		
		if (temps == Temps.PASSE_COMPOSE || temps == Temps.PLUS_QUE_PARFAIT) {
			tag = temps.name().toLowerCase().replace('_', '-');
		} else if (temps == Temps.PASSE && mode == Mode.INDICATIF) {
			tag = "passe-simple";
		} else {
			tag = temps.name().toLowerCase();
		}
		
		return tag;
	}
	
	public String personneToString(Personne personne) {
		return personne.name().toLowerCase();
	}
	
	public Personne stringToPersonne(String s) {
		return Personne.valueOf(s.toUpperCase());
	}
	
	public Auxiliaire stringToAuxiliaire(String value) {
		Auxiliaire auxiliaire = null;
		if ("avoir".equalsIgnoreCase(value)) {
			auxiliaire = Auxiliaire.AVOIR;
		} else if ("être".equalsIgnoreCase(value)) {
			auxiliaire = Auxiliaire.ETRE;
		}
		return auxiliaire;
	}
	
	public String auxiliaireToString(Auxiliaire auxiliaire) {
		String s = null;
		if (auxiliaire == Auxiliaire.ETRE) {
			s = "être";
		} else if (auxiliaire == Auxiliaire.AVOIR) {
			s = "avoir";
		}
		return s;
	}
}
