/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public interface Sujeto {
    void agregarObservador(Observer o);
    void eliminarObservador(Observer o);
    void notificarObservadores(String mensaje);
}
