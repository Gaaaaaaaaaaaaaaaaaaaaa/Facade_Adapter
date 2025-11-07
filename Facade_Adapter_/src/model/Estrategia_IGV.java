/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Estrategia_IGV implements Estrategia_Impuesto {
    @Override
    public double calcular(double subtotal){
        return subtotal*0.18;
    }
}
