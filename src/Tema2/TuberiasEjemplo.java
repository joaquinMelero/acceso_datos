/*
 * Tubería: pasar información de un programa a otro mientras se ejecutan simultáneamente
 */
package Tema2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TuberiasEjemplo {
    
    public static void main(String[] args) {
        
        try {
            
            //instancio los objetos para la salida y entrada de datos con bytes
            PipedOutputStream salida = new PipedOutputStream();
            PipedInputStream entrada = new PipedInputStream(salida);
            
            Thread escritor = new Thread((Runnable) salida);
            Thread lector = new Thread((Runnable) entrada);
            
            //Hace que este hilo comience a ejecutarse
            escritor.start();
            lector.start();
            
        } catch (IOException ex) {
            Logger.getLogger(TuberiasEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
