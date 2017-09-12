package be.steformations.it.xml.conjugaisons.helpers;

public class XMLHelper {

	public String node2String(org.w3c.dom.Node node) {
		String xml = null;
		
		if (node != null) {
			StringBuilder sb = new StringBuilder();
			if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				sb.append('<').append(node.getNodeName());
				if (node.hasAttributes()) {
					org.w3c.dom.NamedNodeMap attributes = node.getAttributes();
					for (int i = 0; i < attributes.getLength(); i++) {
						org.w3c.dom.Node attribute = attributes.item(i);
						sb.append(" ").append(attribute.getNodeName())
							.append('=').append('"').append(attribute.getNodeValue())
							.append('"');
					}
				}
				sb.append('>');
				if (node.hasChildNodes()) {
					org.w3c.dom.NodeList children = node.getChildNodes();
					for (int i = 0; i < children.getLength(); i++) {
						org.w3c.dom.Node child = children.item(i);
						sb.append(this.node2String(child));
					}
				}
				sb.append('<').append('/').append(node.getNodeName()).append('>');
			} else {
				sb.append(node.getTextContent());
			}
			
			xml = sb.toString();
		}
		
		return xml;
	}
}
