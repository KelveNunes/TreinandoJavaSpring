package org.contador.db;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.xml.sax.SAXException;

public class Connect {

    public static Connection connection() {
        Connection conn = null;

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("C:\\Users\\kelve\\OneDrive\\Documentos\\Java Project\\Treinamento Java\\TreinandoJavaSpring\\properties.xml");


            String url = doc.getElementsByTagName("url").item(0).getTextContent();
            String username = doc.getElementsByTagName("username").item(0).getTextContent();
            String password = doc.getElementsByTagName("password").item(0).getTextContent();


            conn = DriverManager.getConnection(url, username, "102040"); //erro

        } catch (SQLException | ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}