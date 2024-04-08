/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compradores;

import dispositivos.DispElect;
import dispositivos.Laptop;
import dispositivos.Pc;
import dispositivos.Smartphone;
import dispositivos.Tablet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nana
 */
public class Vip extends Comprador{
    private int idVip;

    public Vip(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }
    
    public void crearMenu(){
        
        Tablet tab1 = new Tablet(4000, "Stylus1", "Samsumg", "Sam Pro", "10.5 Pulgadas", "Android", 4, 21000, "Samsumg Redonda de 10.5");
        Tablet tab2 = new Tablet(5000, "Stylus2", "Huawey", "MatePad 11.5 PaperMatte", "11.5 Pulgadas", "Harmony OS 3.1", 8, 19000, "HUAWEI FullView de 11.5");
        Tablet tab3 = new Tablet(5000, "Stylus3", "Dell", "5300", "13.3 Pulgadas", "Windows 10 Pro", 16, 25000, "Intel de 13.3");
        Tablet tab4 = new Tablet(5100, "Stylus4", "Lenovo", "Tab M8", "8 Pulgadas", "A", 3, 30000, "HD de 8");

        // Crear tres objetos de la clase Pc
        Pc pc1 = new Pc(800, "Modelo1", "Apple", "Pantalla1", 4, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1");
        Pc pc2 = new Pc(900, "Modelo2", "Lenovo", "Pantalla2", 8, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2");
        Pc pc3 = new Pc(1000, "IdeaPad 1", "Marca3", "Pantalla3", 16, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3");

        // Crear tres objetos de la clase Laptop
        Television tv1 = new Television(1000, "Modelo1", "Marca1", "Pantalla1", "1 año");
        Television tv2 = new Television(1200, "Modelo2", "Marca2", "Pantalla2", "2 años");
        Television tv3 = new Television(1500, "Modelo3", "Marca3", "Pantalla3", "3 años");

        ArrayList<DispElect> menu = new ArrayList<>();
        
 
        menu.add(tab1);
        menu.add(tab2);
        menu.add(tab3);
        menu.add(tab4);
        menu.add(pc1);
        menu.add(pc2);
        menu.add(pc3);
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


