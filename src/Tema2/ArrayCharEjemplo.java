/*
 * Ejemplo de pasar información con lo smétodos de caracteres de arrays. Flujo de datos Stream
 */
package Tema2;

import java.io.*;

public class ArrayCharEjemplo {

    public static void main(String[] args) {
        
        char [] charsArray = "Hola Mundo".toCharArray(); //array de caracteres que coviertoa array char
        
        //instancio el objeto de la clase ue permite crear el flujo
        CharArrayReader charArrayReader = new CharArrayReader(charsArray);
        int data=0;
        
        try{
            
            //se lee el array
            data = charArrayReader.read();
            
            //mientras que no llegue a -1, cuando no haya contenido
            while(data!=-1){
                System.out.println((char)data);
                data = charArrayReader.read();
            }
            
        }catch(Exception IO){
            System.out.print("Exception IO");
        }
        
        charArrayReader.close();
    }
    
}
