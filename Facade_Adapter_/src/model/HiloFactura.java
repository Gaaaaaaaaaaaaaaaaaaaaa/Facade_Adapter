/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class HiloFactura extends Thread {

    private Factura_Servicio factura;
    private String cliente;
    private double total;

    public HiloFactura (Factura_Servicio factura, String cliente, double total) {
        this.factura = factura;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public void run() {
        System.out.println("[HILO FACTURA] Generando factura...");
        factura.generarFactura(cliente, total);
    }
}
