/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class HiloProcesarPedido extends Thread {

    private PedidoFacade facade;
    private String cliente;
    private String producto;
    private int cantidad;
    private double precio;

    public HiloProcesarPedido(PedidoFacade facade, String cliente, String producto, int cantidad, double precio) {
        this.facade = facade;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public void run() {
        try {
            System.out.println("[HILO PEDIDO] Procesando pedido...");
            facade.procesarPedido(cliente, producto, cantidad, precio);
        } catch (Exception e) {
            System.out.println("[HILO PEDIDO] Error: " + e.getMessage());
        }
    }
}

    
    
    
    
    
    
    
    
    