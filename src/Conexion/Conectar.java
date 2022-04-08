/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    
    Connection conectar=null;
    
    
    public Connection Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario","root","123456789");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }// end method
    
    
    
}//end class
