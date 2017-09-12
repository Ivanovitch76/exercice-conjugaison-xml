package be.steformations.it.xml.conjugaisons;

import be.steformations.java_data.conjugaison_fr.xml.interfaces.FabriqueXML;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugaisonDOMHandler;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugueur;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler;

public class FabriqueXmlImpl implements FabriqueXML {

	@Override
	public XMLConjugaisonDOMHandler createXmlConjugaisonDOMHandler() {
		// TODO Auto-generated method stub
		return new be.steformations.it.xml.conjugaisons.XMLConjugaisonDOMHandlerImpl();
	}

	@Override
	public XMLVerbeDOMHandler createXmlVerbeDOMHandler() {
		// TODO Auto-generated method stub
		return new be.steformations.it.xml.conjugaisons.XMLVerbeDOMHandlerImpl();
	}

	@Override
	public XMLConjugueur createXmlConjugueur() {
		// TODO Auto-generated method stub
		return null;
	}

}
