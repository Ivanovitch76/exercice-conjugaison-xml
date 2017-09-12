package be.steformations.it.xml.conjugaisons;

import java.io.InputStream;
import java.util.List;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugueur;

public class XMLConjugeurImpl implements XMLConjugueur {

	@Override
	public Conjugaison getConjugaison(InputStream in, Mode mode, Temps temps, Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conjugaison> getConjugaisons(InputStream in, Mode mode, Temps temps) {
		// TODO Auto-generated method stub
		return null;
	}

}
