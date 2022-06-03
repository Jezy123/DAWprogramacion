package ControlFicheros;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException, SAXException {
        // Cliente ramon= new Cliente("001", "nombre", "apellido", "id1"," email@1");
        // Cliente ramon2= new Cliente("011", "Ramon", "apellido", "id1"," email@1");
        // Cliente ramon3= new Cliente("111", "Julian", "apellido", "id1"," email@1");
       
        // Cliente[] arrat={ramon,ramon2,ramon3};
        // ficheroXML.writeXML(arrat);
        ficheroXML.readXML("./ControlFicheros/Cliente3.xml");    
        
        System.out.println("Funciona");
    }
}
