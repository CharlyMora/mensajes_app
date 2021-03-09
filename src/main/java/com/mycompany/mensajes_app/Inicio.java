/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Inicio {
    public static void main(String[] args) throws SQLException {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion =0;
        
        do{
            System.out.println("----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println(" 1. crear");
            System.out.println(" 2. listar");
            System.out.println(" 3. eliminar");
            System.out.println(" 4. editar");
            System.out.println(" 5. salir");
            //read option
            opcion =sc.nextInt();
            
            switch(opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    
                    break;
            }
            
        
        }while(opcion!=5);
        
        Conexion conexion = new Conexion();
        
        try(Connection cxn=conexion.get_connection()){
        
        }catch(Exception e){
            System.out.println("la recagastes "+ e);
        }
    }
}
