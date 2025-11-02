/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Factura_Adapter implements Factura_Servicio {
    private LegacyBillingSystem legacySystem;

    public Factura_Adapter(LegacyBillingSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void generarFactura(String cliente, double total) {
        legacySystem.generarFacturaAntigua(cliente, total);
        System.out.println("Factura generada mediante el adaptador.");
    }  
}
