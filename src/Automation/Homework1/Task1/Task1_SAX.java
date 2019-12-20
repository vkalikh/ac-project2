package Automation.Homework1.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Task1_SAX {
    private static ArrayList<Employee_1> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XHLHandlerSAX xmlHandler = new XHLHandlerSAX();
        parser.parse(new File("MED.xml"), xmlHandler);

        for(Employee_1 em: employees){
            System.out.println(em.toString());
        }
    }






    private static class XHLHandlerSAX extends DefaultHandler {
        private String element, firstName, lastName, middleName, position, department, experience;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            element = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String info = new String(ch, start, length);
            info = info.replace("/n", "").trim();

            if (!info.isEmpty()) {
                if (element.equals("firstName"))
                    firstName = info;
                if (element.equals("lastName"))
                    lastName = info;
                if (element.equals("middleName"))
                    middleName = info;
                if (element.equals("position"))
                    position = info;
                if (element.equals("department"))
                    department = info;
                if (element.equals("experience"))
                    experience = info;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((firstName != null && !firstName.isEmpty()) && (lastName != null && !lastName.isEmpty())
                    && (middleName != null && !middleName.isEmpty()) && (position != null && !position.isEmpty())
                    && (department != null && !department.isEmpty()) && (experience != null && !experience.isEmpty())) {
                employees.add(new Employee_1(firstName, lastName, middleName, position, department, experience));
                firstName = null;
                lastName = null;
                middleName = null;
                position = null;
                department = null;
                experience = null;
            }
        }


        public void print (String name){

        }
    }
}
