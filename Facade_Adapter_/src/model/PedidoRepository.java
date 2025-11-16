/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;  
import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private List<PedidoResultado> pedidos = new ArrayList<>();

    public void guardarPedido(String cliente, String producto, int cantidad, double total) {
        pedidos.add(new PedidoResultado(cliente, producto, cantidad, total / 1.18, total - (total / 1.18), total));
        System.out.println("Pedido guardado correctamente en el repositorio.");
    }

    public PedidoResultado getUltimoPedido() {
        if (pedidos.isEmpty()) return null;
        return pedidos.get(pedidos.size() - 1);
    }
}
