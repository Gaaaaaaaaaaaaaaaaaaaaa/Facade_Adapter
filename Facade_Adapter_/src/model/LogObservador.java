/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class LogObservador implements Observador {
    @Override
    public void notificar(String mensaje) {
        System.out.println("[LOG] Evento registrado: " + mensaje);
    }
}

