/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class PedidoResultado {
    public String cliente;
    public String producto;
    public int cantidad;
    public double subtotal;
    public double igv;
    public double total;

    public PedidoResultado(String cliente, String producto, int cantidad, double subtotal, double igv, double total) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
    }
}


