/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*;

public class Conexion {

    private static String url = "jdbc:mysql://remotemysql.com:3306/yJQGPmUzpm";
    private static String username = "yJQGPmUzpm";
    private static String password = "cyCjeG6mtV";
    
    public static Connection getConexion(){
        Connection cn = null;
        try{
            cn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion establecida");    
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return cn;
    }
}
