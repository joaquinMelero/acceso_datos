/*
 * Instancia un objeto de tipo PushbackReader apuntando a una ruta donde tengamos localizado un fichero
de texto. Una vez instanciado experimenta con los métodos unread() y read() de dicha clase. Chequea
como se van leyendo bytes y al mismo tiempo se van devolviendo al stream de datos.
Puedes mostrar cierta información por pantalla para que te sea más fácil ver el resultado del aplicativo.
Compón un documento con capturas de pantalla en donde se pueda observar el progreso.
Usa la funcionalidad debugger del IDE que estés usando, te será más fácil ver y chequear cómo se van
añadiendo y devolviendo los bytes al flujo a tiempo real.
 */
package Tema2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Actividad2_Tema2 {
 
    public static void main(String[] args) {

        try {

            //Instancia un objeto de tipo PushbackReader
            PushbackReader objetoPush = new PushbackReader(new FileReader(
                    "C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\archivo1.txt"));

            String palabra = "hola";
            
            int datos = objetoPush.read();
            
                 //Este método devuelve al stream de datos el byte que hemos leído con anterioridad, 
            //de tal forma que si volvemos a hacer un read() y mostramos por pantalla,
            //obtendremos el mismo byte que antes
            
            objetoPush.unread('G');

            while (datos != -1) {

                datos = objetoPush.read();
                System.out.print((char) datos);
                
            }
 
            System.out.println("");
            
       

            objetoPush.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Actividad2_Tema2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Actividad2_Tema2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
