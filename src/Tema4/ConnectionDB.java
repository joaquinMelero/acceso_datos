/*
 *Clase para conectar con mysql a través de jdbc. Se necesita previamente descargar el conecctor de la página mysql e importarlo a libraries (archivo .jar)
 */
package Tema4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConnectionDB {
    
    //los atributos de la clase. Static cuando sean compatridos de la clase, que no cambien de valor
    public String bd = ""; //nombre base datos
    public static String url = "jdbc:mysql://localhost:3307/"; //url de conexión a la bd
    public static Connection dbConnection; //objeto conexión
    public static String driver = "com.mysql.cj.jdbc.Driver"; //driver importado a libreries
    public static String user = "melero"; //usuario de bd
    public static String pass= "melero";//contraseña bd
    
    //constructor, se le pasa el nombre de la bd
    public ConnectionDB(String db) {
        this.bd =db;
    }

    //metodo que devuelve un objeto Connection. 
    public Connection conectar() {
        try {
            //para conectar a la bd con el driver
            Class.forName(driver);

            ////conexión a BD. con DriverManager para manipular los drivers. usuario contraseña y url
            dbConnection = DriverManager.getConnection(url + bd, user, pass);

            System.out.println("CONEXIÓN A BD-> " + bd + ", REALIZADA!");

        } catch (ClassNotFoundException | SQLException ex) {

            System.out.println("No se conecto a " + bd);
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dbConnection;

    }
    
    public void desconectar(){
        
        try {
            dbConnection.close();
            System.out.println("Desconexión a base de datos: "+bd);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
