/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author PC
 */
public class Stock_Servicio {
    private Map<String, Integer> stock = new HashMap<>();
                 public Stock_Servicio(){
                 stock.put("Laptop", 11);
                 stock.put("Teclado mecanico", 50);
                 stock.put("Ryzen 5 3400g", 20);
                 stock.put("RTX 4090", 120);
                 }
                 public void validarStock(String producto, int cantidad)
                         throws Exception{
                     if (cantidad <= 0)
                         throw new Exception("La cantidad debe ser positiva");
                     if (!stock.containsKey(producto))
                         if(stock.get(producto)< cantidad)
                             throw new Exception("Stock insuficiente");
                     System.out.println("Stock validado para " + producto );
                 }
}
