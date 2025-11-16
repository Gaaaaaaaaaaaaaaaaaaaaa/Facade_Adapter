/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class ClienteObservador implements Observador {
    
    private String nombre;
    
    public ClienteObservador(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void notificar(String mensaje) {
        System.out.println("[CLIENTE " + nombre + "] Notificacion: " + mensaje);

    }
}    
