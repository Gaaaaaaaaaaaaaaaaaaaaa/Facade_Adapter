package model;


public class Pedido_Servicio {
    public void registrar(String cliente, String producto, int cantidad, double total) {
        System.out.println("Pedido registrado: " + cliente + " - " + producto + " x" + cantidad + " - Total: S/" + total);
    }
}
