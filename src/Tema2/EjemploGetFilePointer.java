/*
 * Ejemplo para ver el funcionamineto del puntero getFilepinter(), puntero para posionarnos en el texto 
 */
package Tema2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EjemploGetFilePointer {
    public static void main(String[] args) {
      
        try {
            //acceder de forma aleatoria al fichero
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\carpetaCosas\\documento1.txt", "rw");
            
            //guardamos la posición por defecto del puntero
            long position = file.getFilePointer();
            System.out.println("Posición inicial por defecto del puntero en el texto: "+position);
            
            //situarnos en la posición que queramos
            file.seek(0);
            
            //comprobamos que el puntero se encuentra en la posicion que queramos
            position = file.getFilePointer();
            System.out.println("El puntero está en posición: "+position);
            
            //escribimos un byte en el fichero
            file.write(124);
            
            //comprobamos puntero por 3 vez
            position = file.getFilePointer();
            System.out.println("El puntero está en posición: "+position);
            
            //leemos la letra de la posicion
            int letra =file.read();
            
             file.seek(0);
            
            //muestro la letra
            System.out.println((char)letra);
            System.out.println(position);
            
            
            file.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploGetFilePointer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploGetFilePointer.class.getName()).log(Level.SEVERE, null, ex);
        }

            
    }
    
}
