/*
 * Ejemplo de consulta a base de datos con conexión jdbc y PreparatedStatement
 */
package Tema4;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.*;

public class Ejemplo_consulta_JDBC {

    public static void main(String[] args) {

        int total = 0;

        //consulta sql
        String sql = "select * from clientes;";
        
        //creo unobjeto de l aclase ConnecrionDB que conecta con la bd. Parámetro el nombre de bd
        ConnectionDB conBiblio = new ConnectionDB("banco");
        
        //método que devuelve objeto Connection quenecesito para consultas 
        Connection con = conBiblio.conectar();

        try {
            //Variable tipo PreparedStatemet. Objeto que representa una declaración SQL precompilada
            PreparedStatement ps = con.prepareStatement(sql);

            //ejecutar consulta con ResultSet.tabla de datos que representa un conjunto de resultados de una base de datos
            ResultSet consulta = ps.executeQuery(sql);
            
            //número de columnas
            int cantColum = consulta.getMetaData().getColumnCount();
            System.out.println("Cantidad Columnas: " + cantColum);
     

            while (consulta.next()) {

                int id = consulta.getInt(1);
                String nombre = consulta.getString(2);
                String dir = consulta.getString(3);

                System.out.println(id + " " + nombre + " " + dir);
                
                //número de filas
                total++;
            }

            System.out.println("Hay " + total + " registros (filas) en la tabla");

            //close connection
            ps.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo_consulta_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
