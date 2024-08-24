package org.contador.db;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect {

    {
        try {

            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("C:\\Users\\kelve\\OneDrive\\Documentos\\Java\\Projetos\\contador-de-horas\\src\\main\\java\\org\\contador\\properties.xml");

            Element url = doc.getElementById("url");
            Element username = doc.getElementById("username");
            Element password = doc.getElementById("password");



        } catch (ParserConfigurationException | SAXException | IOException e) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, e);

        }
    }


}
