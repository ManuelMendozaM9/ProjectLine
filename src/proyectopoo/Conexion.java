/*
 */
package proyectopoo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    protected Connection conexion;
    //JDBC Driver y base de datos URL
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/eventos?useSSL=false";
    
    //Credenciales de la base de datos
    private final String USER = "root";
    private final String PASS = "";
    
    public static Statement sentencia;
    
    public Conexion() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        }catch(Exception e){
            throw e;
        }
    }
}