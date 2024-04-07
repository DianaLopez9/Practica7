package Compradores;


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
