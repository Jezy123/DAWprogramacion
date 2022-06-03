package ControlFicheros;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ficheroXML {
    public static void writeXML(Cliente [] cliente) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException{
        
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

            for (Cliente cli : cliente) {

                Element emp = doc.createElement("cliente");
                emp.setAttribute("ID", (cli.getId()));

                Element hijo = doc.createElement("nombre");
                hijo.appendChild(doc.createTextNode(cli.getNombre()));
                emp.appendChild(hijo);
                
                hijo = doc.createElement("apellido");
                hijo.appendChild(doc.createTextNode(String.valueOf(cli.getApellido())));
                emp.appendChild(hijo);

                hijo = doc.createElement("email");
                hijo.appendChild(doc.createTextNode(String.valueOf(cli.getEmail())));
                emp.appendChild(hijo);

                hijo = doc.createElement("NIF");
                hijo.appendChild(doc.createTextNode(String.valueOf(cli.getNif())));
                emp.appendChild(hijo);

                root.appendChild(emp);
            }
        Transformer trans = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream("/home/INFORMATICA/alu10204910/Escriptori/carpeta nova 3/Repositori/DAWprogramacion-1/Tema6/ControlFicheros/Cliente3.xml"));

        trans.transform(source, result);
    }

    public static List<Cliente> readXML(String direccion) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException, SAXException{

        List<Cliente> clientesLista = new ArrayList<Cliente>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(direccion));
        Element raiz =(Element) doc.getChildNodes().item(0);
        NodeList clientes = raiz.getElementsByTagName("cliente");

        for (int i = 0; i < clientes.getLength(); i++) {
            Element el = (Element) clientes.item(i);

            String nif = el.getElementsByTagName("NIF").item(0).getChildNodes().item(0).getNodeValue(); 
            String nombre = el.getElementsByTagName("nombre").item(0).getChildNodes().item(0).getNodeValue(); 
            String apellido = el.getElementsByTagName("apellido").item(0).getChildNodes().item(0).getNodeValue(); 
            String id = el.getElementsByTagName("cliente").item(0).getAttributes().item(0).getNodeValue();  
            String email = el.getElementsByTagName("email").item(0).getNodeValue();   
            clientesLista.add(new Cliente(nif, nombre, apellido, id, email));
        }

        return clientesLista;
        
    }
}   