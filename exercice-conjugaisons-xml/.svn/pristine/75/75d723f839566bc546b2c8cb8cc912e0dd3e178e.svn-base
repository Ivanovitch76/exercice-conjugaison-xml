package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.*;

import org.junit.Test;


public class _003b_TestXMLVerbeDOMHandlerInfinitifToDocument {

	@Test
	public void testProgrammer() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "programmer");
		data.put("V_RAD", "programm");
		data.put("V_PAR", "programmé");
		data.put("M_INF", "aimer");
		data.put("M_RAD", "aim");
		data.put("M_PAR", "aimé");
		
		test(data, "programmer");
	}

	@Test
	public void testAimer() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "aimer");
		data.put("V_RAD", "aim");
		data.put("V_PAR", "aimé");
		data.put("M_INF", "aimer");
		data.put("M_RAD", "aim");
		data.put("M_PAR", "aimé");
		
		test(data, "aimer");
	}
	
	@Test
	public void testAller() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "aller");
		data.put("V_RAD", null);
		data.put("V_PAR", "allé");
		data.put("M_INF", "aller");
		data.put("M_RAD", null);
		data.put("M_PAR", "allé");
		
		test(data, "aller");
	}	
	
	@Test
	public void testAvoir() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "avoir");
		data.put("V_RAD", null);
		data.put("V_PAR", "eu");
		data.put("M_INF", "avoir");
		data.put("M_RAD", null);
		data.put("M_PAR", "eu");
		
		test(data, "avoir");
	}
	
	private void test(java.util.Map<String, String> data, String infinitif) {
		
		java.net.URL xmlSchemaURL = null;
		org.w3c.dom.Document document = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.FabriqueXML fabriqueXML = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler xmlVerbeDOMHandler = null;
		be.steformations.java_data.conjugaison_fr.interfaces.Verbe verbe = null;
		
		try {
			xmlSchemaURL = getClass().getResource("/xsd/verbe.xsd");
			
			fabriqueXML = FabriqueTestXML.getFabriqueXML();
			assertNotNull("FabriqueTestXML.getFabriqueXML() != null", fabriqueXML);
			
			xmlVerbeDOMHandler  = fabriqueXML.createXmlVerbeDOMHandler();
			assertNotNull("FabriqueTestXML.getFabriqueXML().createVerbeDOMHandler() != null", xmlVerbeDOMHandler);
			
			document = xmlVerbeDOMHandler.getVerbeAsDOMDocument(infinitif);
			assertNotNull("XMLConjugueur.getVerbeAsDOMDocument("+infinitif+") != null", document);
			assertTrue("XMLConjugueur.getVerbeAsDOMDocument("+infinitif+") est valide", TestsUtils.isValid(document, xmlSchemaURL));

			verbe = xmlVerbeDOMHandler.getVerbe(document);
			assertNotNull("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")) != null", verbe);
			assertEquals("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getInfinitif()", data.get("V_INF"), verbe.getInfinitif());
			assertEquals("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getRadical()", data.get("V_RAD"), verbe.getRadical());
			assertEquals("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getParticipe()", data.get("V_PAR"), verbe.getParticipe());
			assertNotNull("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getModele() != null", verbe.getModele());
			assertEquals("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getModele().getInfinitif()", data.get("M_INF"), verbe.getModele().getInfinitif());
			assertEquals("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getModele().getRadical()", data.get("M_RAD"), verbe.getModele().getRadical());
			assertEquals("XMLVerbeDOMHandler.getVerbe(XMLVerbeDOMHandler.getVerbeAsDOMDocument(\""+infinitif+"\")).getModele().getParticipe()", data.get("M_PAR"), verbe.getModele().getParticipe());	
		} catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
