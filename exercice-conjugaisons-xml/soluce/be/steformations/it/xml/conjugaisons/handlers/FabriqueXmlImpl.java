package be.steformations.it.xml.conjugaisons.handlers;

import be.steformations.java_data.conjugaison_fr.xml.interfaces.FabriqueXML;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugaisonDOMHandler;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugueur;
import be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler;

public class FabriqueXmlImpl implements FabriqueXML {

	@Override
	public XMLConjugaisonDOMHandler createXmlConjugaisonDOMHandler() {
		return new be.steformations.it.xml.conjugaisons.handlers.XMLConjugaisonHandlerImpl();
	}

	@Override
	public XMLVerbeDOMHandler createXmlVerbeDOMHandler() {
		return new be.steformations.it.xml.conjugaisons.handlers.XMLVerbeDomHandlerImpl();
	}

	@Override
	public XMLConjugueur createXmlConjugueur() {
		// TODO Auto-generated method stub
		return null;
	}

}
