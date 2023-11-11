/*
 * Tema Fljo de DAtos: Ejemplo de utilización de la clase DataInputStream para procesar tipo de datos primitivos
    
 */
package Tema2;

import java.io.*;

public class DataInputStreamEjemplo {

    
    public static void main(String[] args) {
        
        try{
            
            DataOutputStream dataOut = new DataOutputStream( new FileOutputStream(
            "C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\carpetaCosas\\ficheroBinario.data"));
            
            dataOut.writeInt(12);
            dataOut.writeFloat(214.45F);
            
            //instancio el objeto dataInputStream y paso como parámetro la ruta del fichero
           DataInputStream dataInputStream = new DataInputStream (
                   new FileInputStream ("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\carpetaCosas\\ficheroBinario.data"));
            
           int aByte = dataInputStream.read();
           int aInt = dataInputStream.readInt();
           float aFloat = dataInputStream.readFloat();
           double aDouble = dataInputStream.readDouble();
           
          
           dataInputStream.close();
           
        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }
    
}
