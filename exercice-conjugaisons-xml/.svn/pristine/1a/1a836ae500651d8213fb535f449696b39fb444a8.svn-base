package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.*;

import org.junit.Test;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;


public class _014_TestXMLConjugueurGetConjugaisonsAimer {

	private final String infinitif = "aimer";
	
	@Test
	public void testGetConjugaisonItemIndicatifPresent() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aime");
		map.put(Personne.TU,   "aimes");
		map.put(Personne.IL,   "aime");
		map.put(Personne.NOUS, "aimons");
		map.put(Personne.VOUS, "aimez");
		map.put(Personne.ILS,  "aiment");

		test(map, mode, temps);
	}

	@Test
	public void testGetConjugaisonItemIndicatifFutur() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.FUTUR;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aimerai");
		map.put(Personne.TU,   "aimeras");
		map.put(Personne.IL,   "aimera");
		map.put(Personne.NOUS, "aimerons");
		map.put(Personne.VOUS, "aimerez");
		map.put(Personne.ILS,  "aimeront");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifImparfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aimais");
		map.put(Personne.TU,   "aimais");
		map.put(Personne.IL,   "aimait");
		map.put(Personne.NOUS, "aimions");
		map.put(Personne.VOUS, "aimiez");
		map.put(Personne.ILS,  "aimaient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPlusQueParfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "avais aimé");
		map.put(Personne.TU,   "avais aimé");
		map.put(Personne.IL,   "avait aimé");
		map.put(Personne.NOUS, "avions aimé");
		map.put(Personne.VOUS, "aviez aimé");
		map.put(Personne.ILS,  "avaient aimé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseSimple() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aimai");
		map.put(Personne.TU,   "aimas");
		map.put(Personne.IL,   "aima");
		map.put(Personne.NOUS, "aimâmes");
		map.put(Personne.VOUS, "aimâtes");
		map.put(Personne.ILS,  "aimèrent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseCompose() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE_COMPOSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "ai aimé");
		map.put(Personne.TU,   "as aimé");
		map.put(Personne.IL,   "a aimé");
		map.put(Personne.NOUS, "avons aimé");
		map.put(Personne.VOUS, "avez aimé");
		map.put(Personne.ILS,  "ont aimé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPresent() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aimerais");
		map.put(Personne.TU,   "aimerais");
		map.put(Personne.IL,   "aimerait");
		map.put(Personne.NOUS, "aimerions");
		map.put(Personne.VOUS, "aimeriez");
		map.put(Personne.ILS,  "aimeraient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPasse() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aurais aimé");
		map.put(Personne.TU,   "aurais aimé");
		map.put(Personne.IL,   "aurait aimé");
		map.put(Personne.NOUS, "aurions aimé");
		map.put(Personne.VOUS, "auriez aimé");
		map.put(Personne.ILS,  "auraient aimé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPresent() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aime");
		map.put(Personne.TU,   "aimes");
		map.put(Personne.IL,   "aime");
		map.put(Personne.NOUS, "aimions");
		map.put(Personne.VOUS, "aimiez");
		map.put(Personne.ILS,  "aiment");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPasse() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aie aimé");
		map.put(Personne.TU,   "aies aimé");
		map.put(Personne.IL,   "ait aimé");
		map.put(Personne.NOUS, "ayons aimé");
		map.put(Personne.VOUS, "ayez aimé");
		map.put(Personne.ILS,  "aient aimé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifImparfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "aimasse");
		map.put(Personne.TU,   "aimasses");
		map.put(Personne.IL,   "aimât");
		map.put(Personne.NOUS, "aimassions");
		map.put(Personne.VOUS, "aimassiez");
		map.put(Personne.ILS,  "aimassent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPlusQueParfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "eusse aimé");
		map.put(Personne.TU,   "eusses aimé");
		map.put(Personne.IL,   "eût aimé");
		map.put(Personne.NOUS, "eussions aimé");
		map.put(Personne.VOUS, "eussiez aimé");
		map.put(Personne.ILS,  "eussent aimé");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPresent() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "aime");
		map.put(Personne.NOUS, "aimons");
		map.put(Personne.VOUS, "aimez");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPasse() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "aie aimé");
		map.put(Personne.NOUS, "ayons aimé");
		map.put(Personne.VOUS, "ayez aimé");
		
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
