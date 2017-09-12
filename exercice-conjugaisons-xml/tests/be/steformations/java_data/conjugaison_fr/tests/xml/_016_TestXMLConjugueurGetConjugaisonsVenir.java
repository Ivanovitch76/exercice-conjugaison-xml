package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.*;

import org.junit.Test;

import be.steformations.java_data.conjugaison_fr.interfaces.Conjugaison;
import be.steformations.java_data.conjugaison_fr.interfaces.Mode;
import be.steformations.java_data.conjugaison_fr.interfaces.Personne;
import be.steformations.java_data.conjugaison_fr.interfaces.Temps;


public class _016_TestXMLConjugueurGetConjugaisonsVenir {

	private final String infinitif = "venir";
	
	@Test
	public void testGetConjugaisonItemIndicatifPresent() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "viens");
		map.put(Personne.TU,   "viens");
		map.put(Personne.IL,   "vient");
		map.put(Personne.NOUS, "venons");
		map.put(Personne.VOUS, "venez");
		map.put(Personne.ILS,  "viennent");

		test(map, mode, temps);
	}

	@Test
	public void testGetConjugaisonItemIndicatifFutur() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.FUTUR;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "viendrai");
		map.put(Personne.TU,   "viendras");
		map.put(Personne.IL,   "viendra");
		map.put(Personne.NOUS, "viendrons");
		map.put(Personne.VOUS, "viendrez");
		map.put(Personne.ILS,  "viendront");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifImparfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "venais");
		map.put(Personne.TU,   "venais");
		map.put(Personne.IL,   "venait");
		map.put(Personne.NOUS, "venions");
		map.put(Personne.VOUS, "veniez");
		map.put(Personne.ILS,  "venaient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPlusQueParfait() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "étais venu");
		map.put(Personne.TU,   "étais venu");
		map.put(Personne.IL,   "était venu");
		map.put(Personne.NOUS, "étions venus");
		map.put(Personne.VOUS, "étiez venus");
		map.put(Personne.ILS,  "étaient venus");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseSimple() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "vins");
		map.put(Personne.TU,   "vins");
		map.put(Personne.IL,   "vint");
		map.put(Personne.NOUS, "vînmes");
		map.put(Personne.VOUS, "vîntes");
		map.put(Personne.ILS,  "vinrent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemIndicatifPasseCompose() {
		Mode mode = Mode.INDICATIF;
		Temps temps = Temps.PASSE_COMPOSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "suis venu");
		map.put(Personne.TU,   "es venu");
		map.put(Personne.IL,   "est venu");
		map.put(Personne.NOUS, "sommes venus");
		map.put(Personne.VOUS, "êtes venus");
		map.put(Personne.ILS,  "sont venus");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPresent() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "viendrais");
		map.put(Personne.TU,   "viendrais");
		map.put(Personne.IL,   "viendrait");
		map.put(Personne.NOUS, "viendrions");
		map.put(Personne.VOUS, "viendriez");
		map.put(Personne.ILS,  "viendraient");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemConditionnelPasse() {
		Mode mode = Mode.CONDITIONNEL;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "serais venu");
		map.put(Personne.TU,   "serais venu");
		map.put(Personne.IL,   "serait venu");
		map.put(Personne.NOUS, "serions venus");
		map.put(Personne.VOUS, "seriez venus");
		map.put(Personne.ILS,  "seraient venus");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPresent() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "vienne");
		map.put(Personne.TU,   "viennes");
		map.put(Personne.IL,   "vienne");
		map.put(Personne.NOUS, "venions");
		map.put(Personne.VOUS, "veniez");
		map.put(Personne.ILS,  "viennent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPasse() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "sois venu");
		map.put(Personne.TU,   "sois venu");
		map.put(Personne.IL,   "soit venu");
		map.put(Personne.NOUS, "soyons venus");
		map.put(Personne.VOUS, "soyez venus");
		map.put(Personne.ILS,  "soient venus");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifImparfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.IMPARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "vinsse");
		map.put(Personne.TU,   "vinsses");
		map.put(Personne.IL,   "vînt");
		map.put(Personne.NOUS, "vinssions");
		map.put(Personne.VOUS, "vinssiez");
		map.put(Personne.ILS,  "vinssent");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemSubjonctifPlusQueParfait() {
		Mode mode = Mode.SUBJONCTIF;
		Temps temps = Temps.PLUS_QUE_PARFAIT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.JE,   "fusse venu");
		map.put(Personne.TU,   "fusses venu");
		map.put(Personne.IL,   "fût venu");
		map.put(Personne.NOUS, "fussions venus");
		map.put(Personne.VOUS, "fussiez venus");
		map.put(Personne.ILS,  "fussent venus");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPresent() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PRESENT;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "viens");
		map.put(Personne.NOUS, "venons");
		map.put(Personne.VOUS, "venez");
		
		test(map, mode, temps);
	}
	
	@Test
	public void testGetConjugaisonItemImperatifPasse() {
		Mode mode = Mode.IMPERATIF;
		Temps temps = Temps.PASSE;
		java.util.EnumMap<Personne, String> map = new java.util.EnumMap<>(Personne.class);
		map.put(Personne.TU,   "sois venu");
		map.put(Personne.NOUS, "soyons venus");
		map.put(Personne.VOUS, "soyez venus");
		
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
