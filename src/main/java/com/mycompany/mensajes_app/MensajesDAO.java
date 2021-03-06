/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            System.out.println("yuca no hay base de datos o algo jodio por lo following: "+e);
        }
    }
    
    public static void leerMensajesDB(){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps =null;
            ResultSet rs = null;
            try{
                String query = "SELECT * FROM mensajes";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                System.out.println("++++++++++");
                while(rs.next()){
                    
                    System.out.println("id: "+rs.getInt("id_mensaje"));
                    System.out.println("Mensaje: "+rs.getString("mensaje"));
                    System.out.println("Autor: "+rs.getString("autor_mensaje"));
                    System.out.println("fecha: "+rs.getString("fecha_mensaje"));
                    System.out.println("===========");
                }
                
                System.out.println("tan tan, todos los mensajes obtenidos");
            }catch(SQLException ex){
                System.out.println("pailis no salieron los mesajes en la DB por esto:" +ex);
            }
        }catch(SQLException e){
            System.out.println("yuca no hay base de datos o algo jodio por lo following: "+e);
        }
    }
    
    public static void borrarMensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps =null;
            try{
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();

                System.out.println("bien hecho, mensaje de mierda borrado");
            }catch(SQLException ex){
                System.out.println("nanay no se pudo borrar el mensaje porque:" +ex);
            }
        }catch(SQLException e){
            System.out.println("yuca no hay base de datos o algo jodio por lo following: "+e);
        }
    }
    
    public static void actualizarMensajeDB(Mensaje mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps =null;
            try{
                String query = "UPDATE mensajes SET mensaje =?, autor_mensaje=? WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.mensaje);
                ps.setString(2, mensaje.autor_mensaje);
                ps.setInt(3, mensaje.id_mensae);
                ps.executeUpdate();

                System.out.println("por fin, mensaje actualizado y mejorado");
            }catch(SQLException ex){
                System.out.println("nanay no se pudo hacer el update del mensaje porque:" +ex);
            }
        }catch(SQLException e){
            System.out.println("yuca no hay base de datos o algo jodio por lo following: "+e);
        }
    }
}
