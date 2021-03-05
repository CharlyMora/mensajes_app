/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andres
 */
public class Conexion {
    public Connection get_connection(){
        Connection connection =null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","")                          ;
            if(connection != null){
                System.out.println("conexion exitosa");
            }else{
                System.out.println("la cagastes");
            }
        }
        catch(SQLException e){  
            System.out.println("Y aca esta en lo que la cagastes " + e);
            
        }
        return connection;
    }   
}
