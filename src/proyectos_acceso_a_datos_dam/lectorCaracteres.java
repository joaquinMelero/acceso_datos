/*
 * Acceso a fichero por caracteres, leer y escribir
 */
package proyectos_acceso_a_datos_dam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class lectorCaracteres {

   
    public static void main(String[] args) {
        
        try {
            
            Writer escritorFichero = new FileWriter("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\texto1.txt");
            escritorFichero.write("Escribiendo en el fichero");
            escritorFichero.close();
            
            //file reader lee un caracter
            Reader lector = new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\texto1.txt");
            int data = lector.read();
            System.out.println((char)data);
            lector.close();
            
        } catch (IOException ex) {
            Logger.getLogger(lectorCaracteres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
