/*
 * Realiza un resumen de la clase “File”, realiza un estudio de sus métodos más importantes, qué
parámetros aceptan y que tipos devuelven.
 */
package Tema1;

import java.io.*;

public class Actividad1 {

    public static void main(String[] args) {
        
          File archive1 = new File("archivo11.txt"); //instancio el objeto de la clase File
        
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
       
        
        System.out.println("Se puede leer:" +doc.canRead() + ", y escribir:"+doc.canWrite());
        
        try{
            doc.createNewFile();
            System.out.println("se ha ceado el documento");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
       
        try {
            
            //escribir en el archivo creado (documento1.txt)
            Writer escritorFichero = new FileWriter("C:\\Users\\user\\Documents\\NetBeansProjects\\Proyectos_Acceso_A_Datos_DAM\\carpetaCosas\\documento1.txt");
            escritorFichero.write("Actividad 1 - Métodos de utilidad de File -");
            escritorFichero.close();

        } catch (IOException e) {
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
