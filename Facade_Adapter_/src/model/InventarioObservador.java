/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class InventarioObservador implements Observador {
    @Override
    public void notificar(String mensaje) {
        System.out.println("[INVENTARIO] Actualizando inventario: " + mensaje);
    }
}