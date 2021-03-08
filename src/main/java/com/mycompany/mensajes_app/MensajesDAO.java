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
    public static void crearMensajeDB(Mensaje mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps =null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                ps = conexion. prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("re teso, mensaje creado en la base de datos");
            }catch(SQLException ex){
                System.out.println("la mierda vea aca lo que paso " +ex);
            }
        }catch(SQLException e){
            System.out.println("vea parce por esto no se supio el mensaje "+e);
        }
    }
    
    public static void leerMensajesDB(){
    
    }
    
    public static void borrarMensajeDB(int id_mensaje){
    
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
    
    }
}
