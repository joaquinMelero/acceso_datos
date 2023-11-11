/*
 * Ejemplo de ejercico que crea un archivo, escribe y  lee con la clase File
 */
package proyectos_acceso_a_datos_dam;

import java.io.*;


public class EjercicioFichero {

   
    public static void main(String[] args) {
        
        File archive1 = new File("archivo1.txt"); //instancio el objeto de la clase File
        
        try{
            
            archive1.createNewFile();
            System.out.println("Se ha creado el archivo " + archive1.getAbsolutePath());
            
        }catch(Exception e){
            System.out.println("Exception" + e);
        }
        
        //comprobar si existe archive1
        if(archive1.exists()){
            System.out.println("Si, existe");
        }else{
            System.out.println("No, existe");
        }
        
        //saber el directorio actual
        String ActualDirectory = System.getProperty("user.dir");
        
        File directory = new File (ActualDirectory); //instancio el directorio
        
        //listar contenido del directorio (carpeta)
        if(directory.isDirectory()){
            System.out.println("Los arcchivos de la carpeta -" +directory.getAbsolutePath()+"- son:");
            
            String [] files = directory.list(); //guardo los nombres de los archivos de la carpeta en array
            
            //recorro el array y muestro los nombres
            for(String file : files){
                System.out.println(file);
            }
        }
        
        System.out.println("---CREAR ARCHIVO EN CARPETA----");
        
        //crear un nuevo directorio y dentro un archivo 
        File directorio = new File("carpetaCosas");
        
        directorio.mkdir();
        System.out.println("Se ha creado el directorio carpeta cosas");
        
        //crear archivo dentro carpeta
        File doc = new File(directorio, "documento1.txt");
        
        try{
            doc.createNewFile();
            System.out.println("se ha ceado el documento");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        //listar contenido del directorio (carpeta)
        if(directorio.isDirectory()){
            System.out.println("Los arcchivos de la carpeta -" +directorio.getAbsolutePath()+"- son:");
            
            String [] files = directorio.list(); //guardo los nombres de los archivos de la carpeta en array
            
            //recorro el array y muestro los nombres
            for(String file : files){
                System.out.println("Contenido: "+file);
            }
        }
    }
    
}
