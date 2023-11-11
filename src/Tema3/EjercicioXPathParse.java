/*
 * Ejercicio de cómo usar XPath para buscar información en un documento XML
 */
package Tema3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EjercicioXPathParse {

    public static void main(String[] args) {

        try {

            // 1 - Carga del documento xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(new File(
                    "\\C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\documentoXpath.txt")); //parsea el inputFile
            
            //se eliminan todos los elementos de nombre redundantes
            documento.getDocumentElement().normalize();
            
            //2- Sentencia XPath
            XPath xPath = XPathFactory.newInstance().newXPath(); //sin contructor, a través de su método
            
            String expresion = "/contacto/nombre";//expresión de búsqueda
            
            //compile evalua la expresión y evaluate la evalua en el documento y se  obtiene una lista de nodos
            NodeList nodeList = (NodeList)xPath.compile(expresion).evaluate(documento, XPathConstants.NODESET);
            
             for(int i=0; i<nodeList.getLength(); i++){
                 
                 Node node = nodeList.item(i);
                 
                 System.out.println(node.getNodeName()+ ": "+ node.getTextContent()+ ", Atributo: " + node.getAttributes());
                 
             }
                 
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
       
    }

}
