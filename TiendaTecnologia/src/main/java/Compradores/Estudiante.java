/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compradores;

import dispositivos.DispElect;
import dispositivos.Laptop;
import dispositivos.Pc;
import dispositivos.Smartphone;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nana
 */
public class Estudiante extends Comprador{
    private double descuento;
    private int idEstudiante;
    private ArrayList<DispElect> menu;
    

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
        miCarrito = new CarritoDeCompras();
        //menu = new ArrayList<>();
    }
    
    public void setIdEstidiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

   

    public void crearMenu(){
        Smartphone smartphone1 = new Smartphone(1, 500, "Modelo1", "Marca1", "Pantalla1", "Sistema1", 4, 3000, "Tamaño1");
        Smartphone smartphone2 = new Smartphone(2, 600, "Modelo2", "Marca2", "Pantalla2", "Sistema2", 6, 3500, "Tamaño2");
        Smartphone smartphone3 = new Smartphone(3, 700, "Modelo3", "Marca3", "Pantalla3", "Sistema3", 8, 4000, "Tamaño3");

        // Crear tres objetos de la clase Pc
        Pc pc1 = new Pc(4, 800, "Modelo1", "Marca1", "Pantalla1", 4, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1");
        Pc pc2 = new Pc(5, 900, "Modelo2", "Marca2", "Pantalla2", 8, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2");
        Pc pc3 = new Pc(6, 1000, "Modelo3", "Marca3", "Pantalla3", 16, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3");

        // Crear tres objetos de la clase Laptop
        Laptop laptop1 = new Laptop(7, 1200, "Modelo1", "Marca1", "Pantalla1", 8, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1", 5000);
        Laptop laptop2 = new Laptop(8, 1400, "Modelo2", "Marca2", "Pantalla2", 16, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2", 6000);
        Laptop laptop3 = new Laptop(9, 1600, "Modelo3", "Marca3", "Pantalla3", 32, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3", 7000);

        ArrayList<DispElect> menu = new ArrayList<>();
        

        menu.add(pc1);
        menu.add(pc2);
        menu.add(pc3);
        menu.add(smartphone1);
        menu.add(smartphone2);
        menu.add(smartphone3);
        menu.add(laptop1);
        menu.add(laptop2);
        menu.add(laptop3);
    }

    public void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Estos son los productos que tenemos para usted");
        for(DispElect check : menu){
            check.mostrarDatos();
        }

        System.out.println("Que producto le gustaria comprar?");
        int chose = sc.nextInt();
        if(0 <= chose && chose < menu.size()){
        //if(0>chose && chose<menu.size()){
        miCarrito.agregarAlCarrito(menu.get(chose));
        System.out.println("Producto agregado al carrito");
        }
        else{
            System.out.println("Por favor, escoja una opcion disponible");
        }
    }

    public void ticket(){
        double total = 0;
        System.out.println("Elementos agregados al carrito:");
        for (DispElect dispositivo : miCarrito.dispositivos) {
            dispositivo.mostrarDatos(); 
            total += dispositivo.getPrecio(); 
        }
        System.out.println("Total del carrito de compras: " + total);
    }
    
}