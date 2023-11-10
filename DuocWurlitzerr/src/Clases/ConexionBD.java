/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author nico_
 */
public class ConexionBD {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wurlitzerdb","root","");
            System.out.println("Se hizo la conexión exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    
}
