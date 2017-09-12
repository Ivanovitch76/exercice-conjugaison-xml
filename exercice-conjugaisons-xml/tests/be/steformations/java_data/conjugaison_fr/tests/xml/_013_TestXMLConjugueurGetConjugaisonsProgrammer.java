package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.*;

import org.junit.Test;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;


public class _013_TestXMLConjugueurGetConjugaisonsProgrammer {

	private final String infinitif = "programmer";
	
	@Test
	public void testGetConjugaisonItemIndicatifPresent() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
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
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "programme");
		map.put(Personne.NOUS, "programmons");
		map.put(Personne.VOUS, "programmez");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPasse() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "aie programmé");
		map.put(Personne.NOUS, "ayons programmé");
		map.put(Personne.VOUS, "ayez programmé");
		
		test(map, mode, temps);
	}
	
	private void test(java.util.EnumMap<Personne, String> map, Mode mode, Temps temps) {
		
		java.net.URL xmlSchemaURL = null;
		org.w3c.dom.Document document = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.FabriqueXML fabriqueXML = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler xmlVerbeDOMHandler = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLConjugueur xmlConjugueur = null;
		
		try {
			xmlSchemaURL = getClass().getResource("/xsd/verbe.xsd");
			
			fabriqueXML = FabriqueTestXML.getFabriqueXML();
			assertNotNull("FabriqueTestXML.getFabriqueXML() != null", fabriqueXML);
			
			xmlVerbeDOMHandler  = fabriqueXML.createXmlVerbeDOMHandler();
			assertNotNull("FabriqueTestXML.getFabriqueXML().createVerbeDOMHandler() != null", xmlVerbeDOMHandler);
			
			xmlConjugueur = fabriqueXML.createXmlConjugueur();
			assertNotNull("FabriqueTestXML.getFabriqueXML().createXmlConjugueur() != null", xmlConjugueur);
			
			document = xmlVerbeDOMHandler.getVerbeAsDOMDocument(infinitif);
			assertNotNull("XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\") != null", document);
			assertTrue("XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\") est valide", TestsUtils.isValid(document, xmlSchemaURL));
			
			try (
				java.io.InputStream in = TestsUtils.documentToStream(document);
			){
				java.util.List<Conjugaison> conjugaisons = xmlConjugueur.getConjugaisons(in, mode, temps);
				assertNotNull(String.format("XMLConjugueur.getConjugaisons(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\"), %s, %s) != null", mode, temps), conjugaisons);
				int size = 6;
				if ( mode == Mode.IMPERATIF ) {
					size = 3;
				}
				assertEquals(String.format("XMLConjugueur.getConjugaisons(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\"), %s, %s).size()", mode, temps), size, conjugaisons.size());
				int i = 0;
				for (String valeur : map.values()) {
					assertNotNull(String.format("XMLConjugueur.getConjugaisons(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\"), %s, %s).get(%d) != null", mode, temps, i), conjugaisons.get(i));	
					assertEquals(String.format("XMLConjugueur.getConjugaisons(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\"), %s, %s).get(%d)", mode, temps, i), 
								 valeur, conjugaisons.get(i).getValeur());
					i++;
				}
			} catch(Exception e) {
				e.printStackTrace();
				fail();
			}	
			
		} catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
