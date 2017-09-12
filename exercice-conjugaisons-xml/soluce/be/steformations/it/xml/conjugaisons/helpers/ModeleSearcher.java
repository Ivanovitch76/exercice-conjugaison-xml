package be.steformations.it.xml.conjugaisons.helpers;

import be.steformations.it.xml.conjugaisons.beans.VerbeImpl;
import be.steformations.java_data.conjugaison_fr.interfaces.Auxiliaire;

public class ModeleSearcher {

	protected org.w3c.dom.Document sourceVerbes;
	protected org.w3c.dom.Document sourceModeles;
	protected javax.xml.xpath.XPath xpath;
	
	public ModeleSearcher() {
		super();
		this.xpath = javax.xml.xpath.XPathFactory.newInstance().newXPath();
		try (
			java.io.InputStream is = this.getClass().getResourceAsStream("/xml/verbes.xml");
			java.io.InputStream is2 = this.getClass().getResourceAsStream("/xml/modeles.xml");
		) {
			javax.xml.parsers.DocumentBuilder builder
				= javax.xml.parsers.DocumentBuilderFactory.newInstance()
						.newDocumentBuilder();
			this.sourceVerbes = builder.parse(is);
			this.sourceModeles = builder.parse(is2);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public VerbeImpl searchModele(String infinitif) {
		VerbeImpl v = null;
		
		if (this.sourceVerbes != null && this.sourceModeles != null) {
			try {
				org.w3c.dom.Node node
					= (org.w3c.dom.Node) this.xpath.evaluate(
							String.format("//verbe[@infinitif='%s']", infinitif), 
							this.sourceVerbes, javax.xml.xpath.XPathConstants.NODE);
				if (node != null) {
					String smodele = node.getAttributes().getNamedItem("modele").getNodeValue();
					
					v = new VerbeImpl();
					v.setInfinitif(smodele.replace(":", ""));
					v.setRadical(smodele.substring(0, smodele.indexOf(':')));
					if (v.getRadical().isEmpty()) {
						v.setRadical(null);
					}
					v.setAuxiliaire(Auxiliaire.AVOIR);
					if (node.getAttributes().getNamedItem("auxiliaire") != null) {
						if (node.getAttributes().getNamedItem("auxiliaire").getNodeValue().equals("être")) {
							v.setAuxiliaire(Auxiliaire.ETRE);
						}
					}
					
					node = (org.w3c.dom.Node) this.xpath.evaluate(
								String.format("//modele[@infinitif='%s']/participe/passe", smodele), 
								this.sourceModeles, javax.xml.xpath.XPathConstants.NODE);
					if (node != null) {
						v.setParticipe(
							String.format("%s%s", 
								v.getRadical() == null ? "" : v.getRadical(), 
								node.getTextContent().substring(0, node.getTextContent().indexOf(','))));
					}
				}			
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return v;
	}
}
