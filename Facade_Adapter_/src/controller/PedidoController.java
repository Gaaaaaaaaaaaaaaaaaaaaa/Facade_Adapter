/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.PedidoFacade;
import model.PedidoResultado;
import view.PedidoView;

public class PedidoController {
    private PedidoFacade facade;
    private PedidoView view;
    
    public PedidoController(PedidoFacade facade, PedidoView view){
        this.facade = facade;
        this.view = view;
    }
    public void registrarPedido(String cliente, String producto, int cantidad, double)
}
