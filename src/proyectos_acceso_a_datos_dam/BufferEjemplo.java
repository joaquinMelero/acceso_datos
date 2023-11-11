/*
 * En la primera línea de código encontramos la definición del tamaño del buffer que se usará posteriormente.
A continuación, en la segunda línea se instancia nuestro objeto, el cual, necesita dos parámetros: 
El primero es un objeto de tipo FileInputStream con la ruta de nuestro fichero, y el segundo parámetro es el
tamaño que deseamos darle a nuestro buffer, definido en la primera línea.
En el bucle “while” realizaremos la lectura de un bloque de datos siempre y cuando nuestra variable “info” 
no contenga -1, lo cual, si es así, indicará que el contenido del fichero ha finalizado y que nuestro buffer no
tendrá información que proporcionar. Es dentro del bucle donde podremos manipular la información y realizar las
operaciones que deseemos.
Por último, simplemente puntualizar la última línea como cierre y liberación de recursos de nuestro buffer.
 */
package proyectos_acceso_a_datos_dam;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BufferEjemplo {

    public static void main(String[] args) {
        
        int sizeBuffer = 4*1024;
        
        try {
            
            BufferedInputStream bufferedInputStream = new BufferedInputStream( new FileInputStream(
                    "C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\archivo1.txt"),sizeBuffer);
            
            int info = bufferedInputStream.read();
            
            while(info!=-1){
                info = bufferedInputStream.read();
                
                System.out.print((char)info);
            }
            
            bufferedInputStream.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferEjemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
