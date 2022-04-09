
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    Connection con;
    
    
    public Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario","root","123456789");
        } catch (Exception e) {
            System.err.println("No se establecio conexion:Error: "+e);
        }
        
    }// end method
    
    public Connection getConnection(){
        return con;
    }
    
    
}//end class
