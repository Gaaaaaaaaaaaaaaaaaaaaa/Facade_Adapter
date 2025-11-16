/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class HiloFactura extends Thread {

    private PedidoFacade facade;

    public HiloFactura(PedidoFacade facade) {
        this.facade = facade;
    }

    @Override
public void run() {
    try {
        Thread.sleep(400); 
        System.out.println("[HILO FACTURA] Generando factura...");

        PedidoRepository repo = facade.getRepositorio();
        PedidoResultado ultimo = repo.getUltimoPedido();

        if (ultimo == null) {
            System.out.println("[HILO FACTURA] No hay pedidos para facturar.");
            return;
        }

        Factura_Servicio factura = facade.getFacturaServicio();
        factura.generarFactura(ultimo.cliente, ultimo.total);

    } catch (Exception e) {
        System.out.println("[HILO FACTURA] Error: " + e.getMessage());
    }
}

}
