
import java.io.FileInputStream;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainPracticaSAX {

	public static void main(String[] args) {  
        
	      try {  
	         // Creamos nuestro objeto libro vac�o  
	         Libro libro = new Libro();  
	         // Creamos la factoria de parseadores por defecto  
	         XMLReader reader = XMLReaderFactory.createXMLReader();  
	         // A�adimos nuestro manejador al reader pasandole el objeto libro  
	         LibroXML libroXML = new LibroXML(libro);
	         reader.setContentHandler(libroXML);           
	         // Procesamos el xml de ejemplo  
	         reader.parse(new InputSource(new FileInputStream("libros.xml")));  
	         
	         System.out.println(libroXML.getHashMap().toString());           
	      } catch (SAXException e) {  
	         e.printStackTrace();  
	      } catch (IOException e) {  
	         e.printStackTrace();  
	      }  
	  
	   }  
}
