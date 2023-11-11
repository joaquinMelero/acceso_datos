/*
 * Realiza el acceso a un fichero creado previamente el cual tenga al menos de 5 a 10 líneas de texto de algún
tipo de información. Debes acceder al Byte número 5 y mostrarlo por pantalla
RandomAcessFile para acceder a ficheros de forma aleatoria. A diferencia de las clases
anteriores, permite abrir un fichero en modo lectura y además en modo lectura-escritura
Esta clase permite acceder a un lugar determinado de un fichero y a su vez, leer información o escribirla.
 */
package Tema1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Actividad2 {

    public static void main(String[] args) {

        try {

            //acceder de forma aleatoria al fichero
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\carpetaCosas\\documento1.txt", "rw");

            //posiciono el ountero en byte 5
            file.seek(5);

            //muestro la posición donde apunta el puntero
            System.out.println(file.getFilePointer());

            //muestro la letra de la posición del puntero
            System.out.println((char) file.read());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
