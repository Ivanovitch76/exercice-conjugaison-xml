package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.*;

import org.junit.Test;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;


public class _015_TestXMLConjugueurGetConjugaisonsAvoir {

	private final String infinitif = "avoir";
	
	@Test
	public void testGetConjugaisonItemIndicatifPresent() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "ai");
		map.put(Personne.TU,   "as");
		map.put(Personne.IL,   "a");
		map.put(Personne.NOUS, "avons");
		map.put(Personne.VOUS, "avez");
		map.put(Personne.ILS,  "ont");

		test(map, mode, temps);
	}

	@Test
	public void testGetConjugaisonItemIndicatifFutur() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.FUTUR;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aurai");
		map.put(Personne.TU,   "auras");
		map.put(Personne.IL,   "aura");
		map.put(Personne.NOUS, "aurons");
		map.put(Personne.VOUS, "aurez");
		map.put(Personne.ILS,  "auront");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifImparfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "avais");
		map.put(Personne.TU,   "avais");
		map.put(Personne.IL,   "avait");
		map.put(Personne.NOUS, "avions");
		map.put(Personne.VOUS, "aviez");
		map.put(Personne.ILS,  "avaient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPlusQueParfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "avais eu");
		map.put(Personne.TU,   "avais eu");
		map.put(Personne.IL,   "avait eu");
		map.put(Personne.NOUS, "avions eu");
		map.put(Personne.VOUS, "aviez eu");
		map.put(Personne.ILS,  "avaient eu");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseSimple() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "eus");
		map.put(Personne.TU,   "eus");
		map.put(Personne.IL,   "eut");
		map.put(Personne.NOUS, "eûmes");
		map.put(Personne.VOUS, "eûtes");
		map.put(Personne.ILS,  "eurent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseCompose() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE_COMPOSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "ai eu");
		map.put(Personne.TU,   "as eu");
		map.put(Personne.IL,   "a eu");
		map.put(Personne.NOUS, "avons eu");
		map.put(Personne.VOUS, "avez eu");
		map.put(Personne.ILS,  "ont eu");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPresent() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aurais");
		map.put(Personne.TU,   "aurais");
		map.put(Personne.IL,   "aurait");
		map.put(Personne.NOUS, "aurions");
		map.put(Personne.VOUS, "auriez");
		map.put(Personne.ILS,  "auraient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPasse() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aurais eu");
		map.put(Personne.TU,   "aurais eu");
		map.put(Personne.IL,   "aurait eu");
		map.put(Personne.NOUS, "aurions eu");
		map.put(Personne.VOUS, "auriez eu");
		map.put(Personne.ILS,  "auraient eu");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPresent() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aie");
		map.put(Personne.TU,   "aies");
		map.put(Personne.IL,   "ait");
		map.put(Personne.NOUS, "ayons");
		map.put(Personne.VOUS, "ayez");
		map.put(Personne.ILS,  "aient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPasse() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aie eu");
		map.put(Personne.TU,   "aies eu");
		map.put(Personne.IL,   "ait eu");
		map.put(Personne.NOUS, "ayons eu");
		map.put(Personne.VOUS, "ayez eu");
		map.put(Personne.ILS,  "aient eu");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifImparfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "eusse");
		map.put(Personne.TU,   "eusses");
		map.put(Personne.IL,   "eût");
		map.put(Personne.NOUS, "eussions");
		map.put(Personne.VOUS, "eussiez");
		map.put(Personne.ILS,  "eussent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPlusQueParfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "eusse eu");
		map.put(Personne.TU,   "eusses eu");
		map.put(Personne.IL,   "eût eu");
		map.put(Personne.NOUS, "eussions eu");
		map.put(Personne.VOUS, "eussiez eu");
		map.put(Personne.ILS,  "eussent eu");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPresent() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "aie");
		map.put(Personne.NOUS, "ayons");
		map.put(Personne.VOUS, "ayez");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPasse() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "aie eu");
		map.put(Personne.NOUS, "ayons eu");
		map.put(Personne.VOUS, "ayez eu");
		
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
