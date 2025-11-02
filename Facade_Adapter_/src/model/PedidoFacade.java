/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PedidoFacade {
    private Stock_Servicio stock_servicio;
    private Impuesto_Servicio impuesto_Servicio;
    private Pedido_Servicio pedido_Servicio;
    private Factura_Servicio factura_Servicio;

    public PedidoFacade() {
        this.stock_servicio = new Stock_Servicio();
        this.impuesto_Servicio = new Impuesto_Servicio();
        this.pedido_Servicio = new Pedido_Servicio();
        this.factura_Servicio = new Factura_Servicio(new LegacyBillingSystem());
    }

    public PedidoResultado procesarPedido(String cliente, String producto, int cantidad, double precioUnitario) throws Exception {
        stock_servicio.validarStock(producto, cantidad);

        double subtotal = cantidad * precioUnitario;
        double[] calculos = impuesto_Servicio.calcular(subtotal);
        double igv = calculos[0];
        double total = calculos[1];

        pedido_Servicio.registrar(cliente, producto, cantidad, total);
        factura_Servicio    .generarFactura(cliente, total);

        return new PedidoResultado(cliente, producto, cantidad, subtotal, igv, total);
    }
}