package XmlParser;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XML_Practice2 {
	public static void main(String args[]) {
		try {
	         File inputFile = new File("group.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Employee");
	         System.out.println("Number of Node is " +nList.getLength());
	         for(int i=0;i<nList.getLength();i++) {
	         Node node = nList.item(i);
	         Element element = (Element)node;
	         System.out.println("Employee id is " +element.getAttribute("id"));
	         if(element.getAttribute("id").equals("2")) {
	         System.out.println("Employee id is " +element.getAttribute("id"));
	         System.out.println("Employee name is " +element.getElementsByTagName("Name").item(0).getTextContent());
	         System.out.println("Employee Department is " +element.getElementsByTagName("Department").item(0).getTextContent());
	         System.out.println("Employee Salary is " +element.getElementsByTagName("Salary").item(0).getTextContent());
	         } }
	       }catch(Exception e) {
			System.out.println("Exception occur");
		}
	}
}
