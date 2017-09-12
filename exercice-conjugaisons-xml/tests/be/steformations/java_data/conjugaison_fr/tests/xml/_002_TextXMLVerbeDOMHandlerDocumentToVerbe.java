package be.steformations.java_data.conjugaison_fr.tests.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import be.steformations.java_data.conjugaison_fr.interfaces.Auxiliaire;

public class _002_TextXMLVerbeDOMHandlerDocumentToVerbe {
	
	@Test
	public void testProgrammer() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "programmer");
		data.put("V_RAD", "programm");
		data.put("V_AUX", Auxiliaire.AVOIR.name());
		data.put("V_PAR", "programmé");
		data.put("M_INF", "aimer");
		data.put("M_RAD", "aim");
		data.put("M_AUX", Auxiliaire.AVOIR.name());
		data.put("M_PAR", "aimé");
		
		test(data, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><verbe xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"verbe.xsd\"><infinitif>programmer</infinitif><radical>programm</radical><auxiliaire>avoir</auxiliaire><participe>programmé</participe><modele><infinitif>aimer</infinitif><radical>aim</radical><participe>aimé</participe></modele></verbe>");
	}

	@Test
	public void testAimer() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "aimer");
		data.put("V_RAD", "aim");
		data.put("V_AUX", Auxiliaire.AVOIR.name());
		data.put("V_PAR", "aimé");
		data.put("M_INF", "aimer");
		data.put("M_RAD", "aim");
		data.put("M_AUX", Auxiliaire.AVOIR.name());
		data.put("M_PAR", "aimé");
		
		test(data, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><verbe xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"verbe.xsd\"><infinitif>aimer</infinitif><radical>aim</radical><participe>aimé</participe></verbe>");
	}
	
	@Test
	public void testAller() {
		java.util.Map<String, String> data = new java.util.HashMap<String, String>();
		data.put("V_INF", "aller");
		data.put("V_RAD", null);
		data.put("V_AUX", Auxiliaire.ETRE.name());
		data.put("V_PAR", "allé");
		data.put("M_INF", "aller");
		data.put("M_RAD", null);
		data.put("M_AUX", Auxiliaire.ETRE.name());
		data.put("M_PAR", "allé");
		
		test(data, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><verbe xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"verbe.xsd\"><infinitif>aller</infinitif><radical/><auxiliaire>être</auxiliaire><participe>allé</participe></verbe>");
	}	
	
	private void test(java.util.Map<String, String> data, String xml) {
		
		org.w3c.dom.Document document = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.FabriqueXML fabriqueXML = null;
		be.steformations.java_data.conjugaison_fr.xml.interfaces.XMLVerbeDOMHandler xmlVerbeDOMHandler = null;
		be.steformations.java_data.conjugaison_fr.interfaces.Verbe verbe = null;
		
		try {
			document = TestsUtils.stringToDocument(xml);
			
			fabriqueXML = FabriqueTestXML.getFabriqueXML();
			assertNotNull("FabriqueTestXML.getFabriqueXML() != null", fabriqueXML);
			
			xmlVerbeDOMHandler  = fabriqueXML.createXmlVerbeDOMHandler();
			assertNotNull("FabriqueTestXML.getFabriqueXML().createVerbeDOMHandler() != null", xmlVerbeDOMHandler);
			
			verbe = xmlVerbeDOMHandler.getVerbe(document);
			assertNotNull("XMLVerbeDOMHandler.getVerbe(\""+xml+"\") != null", verbe);
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getInfinitif()", data.get("V_INF"), verbe.getInfinitif());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getRadical()", data.get("V_RAD"), verbe.getRadical());
			assertNotNull("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getAuxiliaire() != null", verbe.getAuxiliaire());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getAuxiliaire()", data.get("V_AUX"), verbe.getAuxiliaire().name());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getParticipe()", data.get("V_PAR"), verbe.getParticipe());
			assertNotNull("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getModele() != null", verbe.getModele());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getModele().getInfinitif()", data.get("M_INF"), verbe.getModele().getInfinitif());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getModele().getRadical()", data.get("M_RAD"), verbe.getModele().getRadical());
			assertNotNull("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getModele().getAuxiliaire() != null", verbe.getModele().getAuxiliaire());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getAuxiliaire()", data.get("M_AUX"), verbe.getModele().getAuxiliaire().name());
			assertEquals("XMLVerbeDOMHandler.getVerbe(\""+xml+"\").getModele().getParticipe()", data.get("M_PAR"), verbe.getModele().getParticipe());
			
		} catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
