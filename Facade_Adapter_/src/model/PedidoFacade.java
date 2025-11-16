/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;

public class PedidoFacade implements Sujeto {

    private Stock_Servicio stock_servicio;
    private Estrategia_Impuesto estrategia_Impuesto;
    private PedidoRepository pedido_Repository;
    private Factura_Servicio factura_Servicio;

    private List<Observador> observadores = new ArrayList<>();

    public PedidoFacade(Estrategia_Impuesto estrategia_Impuesto) {
        this.stock_servicio = new Stock_Servicio();
        this.estrategia_Impuesto = estrategia_Impuesto;
        this.pedido_Repository = new PedidoRepository();
        this.factura_Servicio = new Factura_Adapter(new LegacyBillingSystem());
    }

    public PedidoResultado procesarPedido(String cliente, String producto, int cantidad, double precioUnitario) throws Exception {

        // Validar stock
        stock_servicio.validarStock(producto, cantidad);

        // Calcular precios
        double subtotal = cantidad * precioUnitario;
        double igv = estrategia_Impuesto.calcular(subtotal);
        double total = subtotal + igv;

        // Guardar pedido real
        pedido_Repository.guardarPedido(cliente, producto, cantidad, total);

        // Notificar observadores
        notificarObservadores("Pedido procesado correctamente para: " + cliente);

        return new PedidoResultado(cliente, producto, cantidad, subtotal, igv, total);
    }

    //  MÉTODOS OBSERVER 
    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        for (Observador o : observadores) {
            o.notificar(mensaje);
        }
    }

    // GETTERS NECESARIOS PARA LOS HILOS 

    public PedidoRepository getRepositorio() {
        return pedido_Repository;
    }

    public Factura_Servicio getFacturaServicio() {
        return factura_Servicio;
    }
}
