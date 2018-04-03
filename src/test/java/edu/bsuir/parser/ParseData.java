package edu.bsuir.parser;
import java.io.*;
import java.util.*;
import org.jdom2.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import edu.bsuir.*;
import sun.applet.Main;

/**
 * Created by Acer on 03.04.2018.
 */
public class ParseData {
    public ArrayList<String> getData(String role) throws Exception{
        ArrayList<String> al = new ArrayList<String>();
        File inputFile = new File("data.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("root");
        System.out.println("----------------------------");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println();
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                if(eElement.getElementsByTagName("role").item(0).getTextContent().equals(role)){
                    String s1 = eElement.getElementsByTagName("login").item(0).getTextContent();
                    String s2 = eElement.getElementsByTagName("password").item(0).getTextContent();
                    al.add(s1);
                    al.add(s2);
                }

            }

        }
        return al;
    }
}
