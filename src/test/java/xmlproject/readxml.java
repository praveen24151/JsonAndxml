package xmlproject;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;

public class readxml {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException{  
		DocumentBuilderFactory dBf = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dBf.newDocumentBuilder();
		
		Document document = builder.parse(new File("C:\\Users\\HP\\Selenium\\json\\src\\test\\java\\xmlproject\\studentread.xml"));
		document.getDocumentElement().normalize();
		
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		NodeList nList = document.getElementsByTagName("student");
		System.out.println("Registered  for online exams");

		for (int i = 0; i < nList.getLength(); i++)
		{
			Node node = nList.item(i);
			System.out.println();    
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
			
				Element element = (Element) node;
				System.out.println("Student id : " + element.getAttribute("id"));
				System.out.println("Name : "  + element.getElementsByTagName("Name").item(0).getTextContent());
				System.out.println("age : "   + element.getElementsByTagName("age").item(0).getTextContent());
				System.out.println("Location : "    + element.getElementsByTagName("location").item(0).getTextContent());
			}
		}
	}
}