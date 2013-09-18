package deliverableI;


/**
 * ADS Project - Team 001T
 * Authors: Suganthi Dewakar, Mohit Jain
 */

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {
	public static void main(String[] args) {
		
		
		
		 DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder docBuilder;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse (new File("edgeconfig_001T.xml"));
			 doc.getDocumentElement ().normalize ();
	            System.out.println ("Root element of the doc is " + 
	                 doc.getDocumentElement().getNodeName());
	            NodeList listOfDevices = doc.getElementsByTagName("devices");
	            int totalDevices = listOfDevices.getLength();
	            System.out.println("number of devices: "+totalDevices);
	            for(int i = 0; i < listOfDevices.getLength() ; i++){
	            	Node deviceNode = listOfDevices.item(i);
	            	//System.out.println(deviceNode.getAttributes().g);
	            }

			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
         
	}
}
