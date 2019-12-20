package Automation.Homework1.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1_DOM_and_find_name {
    private static ArrayList<Employee_1> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("MED.xml"));

        NodeList emElements = doc.getDocumentElement().getElementsByTagName("employee");
        System.out.println(emElements.getLength());
        for (int i = 0; i < emElements.getLength(); i++) {
            Node item = emElements.item(i);
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) item;
                employees.add(new Employee_1(eElement.getElementsByTagName("firstName").item(0).getTextContent(),
                        eElement.getElementsByTagName("lastName").item(0).getTextContent(),
                        eElement.getElementsByTagName("middleName").item(0).getTextContent(),
                        eElement.getElementsByTagName("position").item(0).getTextContent(),
                        eElement.getElementsByTagName("department").item(0).getTextContent(),
                        eElement.getElementsByTagName("experience").item(0).getTextContent()));
            }
        }

        for (Employee_1 em : employees) {
            System.out.println(em.toString());
        }


        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter a name:");
        String name = in.nextLine();
        printInfo(name);
    }


    public static void printInfo(String name) throws ParserConfigurationException, IOException, SAXException {
        int j = 0;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("MED.xml"));

        NodeList emElements = doc.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < emElements.getLength(); i++) {
            Node item = emElements.item(i);
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) item;
                if (eElement.getElementsByTagName("firstName").item(0).getTextContent().equalsIgnoreCase("\"" + name + "\"")) {
                    j++;
                    System.out.println("firstName = " + eElement.getElementsByTagName("firstName").item(0).getTextContent() +
                            "\nmiddleName = " + eElement.getElementsByTagName("middleName").item(0).getTextContent() +
                            "\nlastName = " + eElement.getElementsByTagName("lastName").item(0).getTextContent() +
                            "\nposition = " + eElement.getElementsByTagName("position").item(0).getTextContent() +
                            "\ndepartment = " + eElement.getElementsByTagName("department").item(0).getTextContent() +
                            "\nexperience = " + eElement.getElementsByTagName("experience").item(0).getTextContent());
                }
            }
        }
        if (j == 0) {
            System.out.println("Nothing was found");
        }
    }
}
