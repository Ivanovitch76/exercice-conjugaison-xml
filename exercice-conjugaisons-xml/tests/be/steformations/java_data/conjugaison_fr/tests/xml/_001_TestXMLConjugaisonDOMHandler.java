package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;

public class _001_TestXMLConjugaisonDOMHandler {
	
	private static final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><conjugaisons xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"conjugaisons.xsd\"><verbe><infinitif>programmer</infinitif><radical>programm</radical><participe>programmé</participe><modele><infinitif>aimer</infinitif><radical>aim</radical><participe>aimé</participe></modele></verbe><indicatif><present><je>programme</je><tu>programmes</tu><il>programme</il><nous>programmons</nous><vous>programmez</vous><ils>programment</ils></present><futur><je>programmerai</je><tu>programmeras</tu><il>programmera</il><nous>programmerons</nous><vous>programmerez</vous><ils>programmeront</ils></futur><imparfait><je>programmais</je><tu>programmais</tu><il>programmait</il><nous>programmions</nous><vous>programmiez</vous><ils>programmaient</ils></imparfait><plus-que-parfait><je>avais programmé</je><tu>avais programmé</tu><il>avait programmé</il><nous>avions programmé</nous><vous>aviez programmé</vous><ils>avaient programmé</ils></plus-que-parfait><passe-simple><je>programmai</je><tu>programmas</tu><il>programma</il><nous>programmâmes</nous><vous>programmâtes</vous><ils>programmèrent</ils></passe-simple><passe-compose><je>ai programmé</je><tu>as programmé</tu><il>a programmé</il><nous>avons programmé</nous><vous>avez programmé</vous><ils>ont programmé</ils></passe-compose></indicatif><conditionnel><present><je>programmerais</je><tu>programmerais</tu><il>programmerait</il><nous>programmerions</nous><vous>programmeriez</vous><ils>programmeraient</ils></present><passe><je>aurais programmé</je><tu>aurais programmé</tu><il>aurait programmé</il><nous>aurions programmé</nous><vous>auriez programmé</vous><ils>auraient programmé</ils></passe></conditionnel><subjonctif><present><je>programme</je><tu>programmes</tu><il>programme</il><nous>programmions</nous><vous>programmiez</vous><ils>programment</ils></present><passe><je>aie programmé</je><tu>aies programmé</tu><il>ait programmé</il><nous>ayons programmé</nous><vous>ayez programmé</vous><ils>aient programmé</ils></passe><imparfait><je>programmasse</je><tu>programmasses</tu><il>programmât</il><nous>programmassions</nous><vous>programmassiez</vous><ils>programmassent</ils></imparfait><plus-que-parfait><je>eusse programmé</je><tu>eusses programmé</tu><il>eût programmé</il><nous>eussions programmé</nous><vous>eussiez programmé</vous><ils>eussent programmé</ils></plus-que-parfait></subjonctif><imperatif><present><tu>programme</tu><nous>programmons</nous><vous>programmez</vous></present><passe><tu>aie programmé</tu><nous>ayons programmé</nous><vous>ayez programmé</vous></passe></imperatif></conjugaisons>";
	private be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugaisonDOMHandler xmlConjugaisonDOMHandler;
	private org.w3c.dom.Document source;
	
	@Before
	public void init() {
		try {
			be.steformations.java_data.conjugaison_fr.xml.interfaces.FabriqueXML fabriqueXML 
				= FabriqueTestXML.getFabriqueXML();
			assertNotNull("FabriqueTestXML.getFabriqueXML() != null", fabriqueXML);
			xmlConjugaisonDOMHandler = fabriqueXML.createXmlConjugaisonDOMHandler();
			assertNotNull("FabriqueTestXML.getFabriqueXML().createConjugaisonDOMHandler() != null", xmlConjugaisonDOMHandler);
			source = TestsUtils.stringToDocument(xml);
		} catch(Exception e) {
			e.printStackTrace();
			fail();
		} 
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPresent() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PRESENT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programme");
		map.put(Personne.TU,   "programmes");
		map.put(Personne.IL,   "programme");
		map.put(Personne.NOUS, "programmons");
		map.put(Personne.VOUS, "programmez");
		map.put(Personne.ILS,  "programment");
		
		test(map, mode, temps);
	}

	@Test
	public void testGetConjugaisonItemIndicatifFutur() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.FUTUR;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programmerai");
		map.put(Personne.TU,   "programmeras");
		map.put(Personne.IL,   "programmera");
		map.put(Personne.NOUS, "programmerons");
		map.put(Personne.VOUS, "programmerez");
		map.put(Personne.ILS,  "programmeront");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifImparfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programmais");
		map.put(Personne.TU,   "programmais");
		map.put(Personne.IL,   "programmait");
		map.put(Personne.NOUS, "programmions");
		map.put(Personne.VOUS, "programmiez");
		map.put(Personne.ILS,  "programmaient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPlusQueParfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "avais programmé");
		map.put(Personne.TU,   "avais programmé");
		map.put(Personne.IL,   "avait programmé");
		map.put(Personne.NOUS, "avions programmé");
		map.put(Personne.VOUS, "aviez programmé");
		map.put(Personne.ILS,  "avaient programmé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseSimple() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programmai");
		map.put(Personne.TU,   "programmas");
		map.put(Personne.IL,   "programma");
		map.put(Personne.NOUS, "programmâmes");
		map.put(Personne.VOUS, "programmâtes");
		map.put(Personne.ILS,  "programmèrent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseCompose() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE_COMPOSE;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "ai programmé");
		map.put(Personne.TU,   "as programmé");
		map.put(Personne.IL,   "a programmé");
		map.put(Personne.NOUS, "avons programmé");
		map.put(Personne.VOUS, "avez programmé");
		map.put(Personne.ILS,  "ont programmé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPresent() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PRESENT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programmerais");
		map.put(Personne.TU,   "programmerais");
		map.put(Personne.IL,   "programmerait");
		map.put(Personne.NOUS, "programmerions");
		map.put(Personne.VOUS, "programmeriez");
		map.put(Personne.ILS,  "programmeraient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPasse() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PASSE;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "aurais programmé");
		map.put(Personne.TU,   "aurais programmé");
		map.put(Personne.IL,   "aurait programmé");
		map.put(Personne.NOUS, "aurions programmé");
		map.put(Personne.VOUS, "auriez programmé");
		map.put(Personne.ILS,  "auraient programmé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPresent() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PRESENT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programme");
		map.put(Personne.TU,   "programmes");
		map.put(Personne.IL,   "programme");
		map.put(Personne.NOUS, "programmions");
		map.put(Personne.VOUS, "programmiez");
		map.put(Personne.ILS,  "programment");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPasse() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PASSE;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "aie programmé");
		map.put(Personne.TU,   "aies programmé");
		map.put(Personne.IL,   "ait programmé");
		map.put(Personne.NOUS, "ayons programmé");
		map.put(Personne.VOUS, "ayez programmé");
		map.put(Personne.ILS,  "aient programmé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifImparfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "programmasse");
		map.put(Personne.TU,   "programmasses");
		map.put(Personne.IL,   "programmât");
		map.put(Personne.NOUS, "programmassions");
		map.put(Personne.VOUS, "programmassiez");
		map.put(Personne.ILS,  "programmassent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPlusQueParfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.JE,   "eusse programmé");
		map.put(Personne.TU,   "eusses programmé");
		map.put(Personne.IL,   "eût programmé");
		map.put(Personne.NOUS, "eussions programmé");
		map.put(Personne.VOUS, "eussiez programmé");
		map.put(Personne.ILS,  "eussent programmé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPresent() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PRESENT;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.TU,   "programme");
		map.put(Personne.NOUS, "programmons");
		map.put(Personne.VOUS, "programmez");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPasse() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PASSE;
		java.util.Map<Personne, String> map = new java.util.HashMap<>();
		map.put(Personne.TU,   "aie programmé");
		map.put(Personne.NOUS, "ayons programmé");
		map.put(Personne.VOUS, "ayez programmé");
		
		test(map, mode, temps);
	}
	
	private void test(java.util.Map<Personne, String> map, Mode mode, Temps temps) {
		for (java.util.Map.Entry<Personne, String> entry: map.entrySet()) {
			try {
				String reponse = xmlConjugaisonDOMHandler.getConjugaisonItem(source, mode, temps, entry.getKey());
				assertEquals(String.format("XMLConjugaisonDOMHandler.getConjugaisonItem(\"%s\", %s, %s, %s)", xml, mode, temps, entry.getKey()), entry.getValue(), reponse);
			} catch(Exception e) {
				e.printStackTrace();
				fail();
			}	
		}
	}
}
