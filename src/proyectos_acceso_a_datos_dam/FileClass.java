/*
 * Métodos de la clase FILE
 */
package proyectos_acceso_a_datos_dam;

import java.io.File;


public class FileClass {

   
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        
        try{
            
            File fileOrigin = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\texto1.txt");
            File fileDestino = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\texto2.txt");
            
            fileOrigin.createNewFile();
            //renombrar fichero texto1
            if(fileOrigin.renameTo(fileDestino)){
                System.out.println("fichero movido");
            }else{
                System.out.println("no movido");
            }
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
    }
    
}
