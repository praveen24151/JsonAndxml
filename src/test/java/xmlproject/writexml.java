package xmlproject;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class writexml {
 
    //public static final String xmlFilePath = "C:\\Users\\HP\\Selenium\\json\\src\\test\\java\\xmlproject\\studentwrite.xml";
 
    public static void main(String argv[]) throws TransformerException, ParserConfigurationException {
 
      
 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
            String xmlFilePath = "C:\\Users\\HP\\Selenium\\json\\src\\test\\java\\xmlproject\\studentwrite.xml";
 
     
            Element root = document.createElement("college");
            document.appendChild(root);
 
            Element employee = document.createElement("student");
 
            root.appendChild(employee);
 
           
            Attr attr = document.createAttribute("id");
            attr.setValue("10");
            employee.setAttributeNode(attr);
 
 
          
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode("pavan"));
            employee.appendChild(firstName);
 
         
            Element lastname = document.createElement("lastname");
            lastname.appendChild(document.createTextNode("patil"));
            employee.appendChild(lastname);
 
       
            Element department = document.createElement("breanch");
            department.appendChild(document.createTextNode("computer science"));
            employee.appendChild(department);
 
          
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
 
          
 
            transformer.transform(domSource, streamResult);
 
            System.out.println("Done creating XML File");
 
        }
    }

