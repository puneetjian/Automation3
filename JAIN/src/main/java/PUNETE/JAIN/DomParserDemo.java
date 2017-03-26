package PUNETE.JAIN;


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo {
   public static void main(String[] args){

      try {	
         File inputFile = new File("puneet.xml");
         DocumentBuilderFactory dbFactory 
            = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :"+doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("student2");
         
         System.out.println("----------------------------");
         for (int temp = 0; temp < nList.getLength(); temp++) {
			
        	 Node nNode = nList.item(temp);
        	 System.out.println("\nCurrent Element :"+ nNode.getNodeName());
                  if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                     Element eElement = (Element) nNode;
                     NodeList List= eElement.getElementsByTagName("student");
                     System.out.println(List.getLength());
                  }
        	 
		}
       
            
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}