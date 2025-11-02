/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Impuesto_Servicio {
    public double[] calcular (double subtotal){
        double igv = subtotal * 0.18;
        double total = subtotal +igv;
        return new double[]{igv, total};
    }
}
