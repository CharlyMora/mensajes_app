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
        
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje(entrada);
        mensaje.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(mensaje);
    
    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba el id del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("escriba el id del mensaje a editar");
        int id_mensaje = sc.nextInt();
        
        System.out.println("escriba un mensaje nuevo");
        String entrada =sc.nextLine();
        
        System.out.println("escriba nombre nuevo");
        String nombre = sc.nextLine();
        
        Mensaje mensaje = new Mensaje();
        mensaje.setMensaje(entrada);
        mensaje.setAutor_mensaje(nombre);
        mensaje.setId_mensae(id_mensaje);
        MensajesDAO.actualizarMensajeDB(mensaje);
    }
}
