/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compradores;

/**
 *
 * @author nana
 */
import dispositivos.DispElect;
import java.util.ArrayList;
import java.util.List;


public class CarritoDeCompras {
    
     public List<DispElect> dispositivos;

    public CarritoDeCompras() {
        dispositivos = new ArrayList<>();
    }

    public void agregarAlCarrito(DispElect dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void mostrarCarrito() {
        for (DispElect dispositivo : dispositivos) {
            dispositivo.mostrarDatos();
        }
    }
    
}
