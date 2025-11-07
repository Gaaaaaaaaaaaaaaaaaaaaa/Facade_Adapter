/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PedidoFacade {
    private Stock_Servicio stock_servicio;
    private Estrategia_Impuesto estrategia_Impuesto;
    private PedidoRepository pedido_Repository;
    private Factura_Servicio factura_Servicio;

    public PedidoFacade() {
        this.stock_servicio = new Stock_Servicio();
        this.estrategia_Impuesto = estrategia_Impuesto;
        this.pedido_Repository = new PedidoRepository();
        this.factura_Servicio = new Factura_Adapter(new LegacyBillingSystem());
    }

    public PedidoResultado procesarPedido(String cliente, String producto, int cantidad, double precioUnitario) throws Exception {
        stock_servicio.validarStock(producto, cantidad);

        double subtotal = cantidad * precioUnitario;
        
        double igv = estrategia_Impuesto.calcular(subtotal);
        
        double total = subtotal+ igv;

        pedido_Repository.guardarPedido(cliente, producto, cantidad, total);
        
        factura_Servicio.generarFactura(cliente, total);
        
       

        return new PedidoResultado(cliente, producto, cantidad, subtotal, igv, total);
    }
}