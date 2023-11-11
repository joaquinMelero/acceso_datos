
package Tema4;

import ejemplojdbc.ValidarDatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploJDBC {
    
    public static String url="jdbc:derby://localhost:1527/ejemplo";
    public static Connection dbConnection;
    public static String sqlSelectAll="SELECT * FROM ejemplo";
    public static Statement sentencias;
    
    public static void main(String[] args) {
        
        try {

            dbConnection = DriverManager.getConnection(url, "usuario", "usuario");
            sentencias = dbConnection.createStatement();

            //hacemos select y se muestra resultado
            ResultSet listaTelefonos = sentencias.executeQuery(sqlSelectAll);
           
              
            String nombreTeclado = ValidarDatos.pedirValidarNombre("Introduce un nombre: ");
            int telefonoTeclado = ValidarDatos.verificarInt("introduce un teléfono: ", 0);
            
            String sqlInsertTelefono = "INSERT INTO ejemplo VALUES('"+nombreTeclado +"','"+telefonoTeclado +"')";
            System.out.println(sqlInsertTelefono);
            while (listaTelefonos.next()) {
                String nombre = listaTelefonos.getString("NOMBRE");
                String tfo = listaTelefonos.getString("TELEFONO");

                System.out.println("Nombre: " + nombre + "\nTeléfono: " + tfo);

            }
            
           
            
            
            

            //cerramos conexión
            dbConnection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(EjemploJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
