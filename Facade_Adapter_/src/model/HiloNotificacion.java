/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

public class HiloNotificacion extends Thread {

    private Sujeto sujeto;
    private String mensaje;

    public HiloNotificacion(Sujeto sujeto, String mensaje) {
        this.sujeto = sujeto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println("[HILO NOTIFICACION] Enviando notificaciones...");
        sujeto.notificarObservadores(mensaje);
    }
}

