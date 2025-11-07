/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
public class PedidoRepository {
    private  List<String> pedidos = new ArrayList<>();
    
    
    public void guardarPedido(String pedido, String producto, int cantidad, double total){
        pedidos.add(pedido);
        System.out.println("Pedido guardado correctamente en el repositorio.");
    }
    public List<String> obtenerPedidos(){
         return pedidos;
    }
   
}
