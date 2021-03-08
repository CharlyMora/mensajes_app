/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Andres
 */
public class MensajesDAO {
    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps =null;
            try(){
            }catch(){
            }
        }catch(SQLException e){
            System.out.println("vea parce por esto no se supio el mensaje "+e);
        }
    }
    
    public static void leerMensajesDB(){
    
    }
    
    public static void borrarMensajeDB(int id_mensaje){
    
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje){
    
    }
}
