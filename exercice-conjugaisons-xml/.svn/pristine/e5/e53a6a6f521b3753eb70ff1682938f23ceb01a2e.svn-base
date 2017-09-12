package be.steformations.java_data.conjugaison_fr.tests.xml;

public class TestsUtils {
	
	public static boolean isValid(org.w3c.dom.Document document, java.net.URL xmlSchema) {
		try {
			javax.xml.validation.SchemaFactory sf 
				= javax.xml.validation.SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI); 
			javax.xml.validation.Schema schema = sf.newSchema(xmlSchema); 
			javax.xml.validation.Validator validator = schema.newValidator();
			javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(document);
			validator.validate(source);
		} catch (org.xml.sax.SAXException | java.io.IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static String documentToString(org.w3c.dom.Node document) {
        java.io.StringWriter writer = new java.io.StringWriter();
		try {
			javax.xml.transform.Transformer transformer 
				= javax.xml.transform.TransformerFactory.newInstance().newTransformer();
			transformer.transform(new javax.xml.transform.dom.DOMSource(document), 
								  new javax.xml.transform.stream.StreamResult(writer));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return writer.toString();
	}
	
	public static java.io.InputStream stringToStream(String xml) {
		return new java.io.ByteArrayInputStream(xml.getBytes());
	}
	
	public static org.xml.sax.InputSource stringToInputSource(String xml) {
		return new org.xml.sax.InputSource( stringToStream(xml) );
	}
	
	public static org.w3c.dom.Document stringToDocument(String xml) throws Exception {
		return javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(stringToStream(xml));
	}
	
	public static java.io.InputStream documentToStream(org.w3c.dom.Node document) {
		String xml = documentToString(document);
		if ( xml != null )
			return stringToStream(xml);
		return null;
	}
}
