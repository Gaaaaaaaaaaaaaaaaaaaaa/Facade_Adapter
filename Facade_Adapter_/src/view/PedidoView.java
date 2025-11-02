/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import model.PedidoResultado;



public class PedidoView {
    public void mostrarComprobante(PedidoResultado r) {
        System.out.println("\n=== COMPROBANTE ===");
        System.out.println("Cliente : " + r.cliente);
        System.out.println("Producto: " + r.producto);
        System.out.println("Cantidad: " + r.cantidad);
        System.out.printf("Subtotal: S/%.2f%n", r.subtotal);
        System.out.printf("IGV (18%%): S/%.2f%n", r.igv);
        System.out.printf("Total: S/%.2f%n", r.total);
        System.out.println("====================\n");
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje + "\n");
    }
}


