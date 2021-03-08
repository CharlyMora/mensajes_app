/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

/**
 *
 * @author Andres
 */
public class Mensaje {
    int id_mensae;
    String mensaje;
    String autor_mensaje;
    String fecha_mensaje;
    
    public Mensaje(){
        
    }

    public Mensaje(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }
    
    

    public int getId_mensae() {
        return id_mensae;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setId_mensae(int id_mensae) {
        this.id_mensae = id_mensae;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
}
