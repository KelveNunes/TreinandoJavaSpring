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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect {

    {
        try {

            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("C:\\Users\\kelve\\OneDrive\\Documentos\\Java\\Projetos\\contador-de-horas\\properties.xml");


            Element url = doc.getElementById("url");
            String urlString = url.toString();
            Element username = doc.getElementById("username");
            String usernameString = username.toString();
            Element password = doc.getElementById("password");
            String passwordString = password.toString();


            DriverManager conexao = (DriverManager) DriverManager.getConnection(urlString,usernameString,passwordString);


        } catch (ParserConfigurationException | SAXException | IOException e) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, e);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
