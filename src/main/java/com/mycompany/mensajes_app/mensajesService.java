/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class mensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba un mensaje lampara");
        String entrada =sc.nextLine();
        
        System.out.println("tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes mensaje = new Mensajes();
        mensaje.setMensaje(entrada);
        mensaje.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(mensaje);
    
    }
    public static void listarMensajes(){
    
    }
    
    public static void borrarMensaje(){
    
    }
    public static void editarMensaje(){
    
    }
}
