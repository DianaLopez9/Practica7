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
        
        Tablet tab1 = new Tablet(4000.0, "Stylus1", "Samsumg", "Sam Pro", "10.5 Pulgadas", "Android", 4, 21000, "Samsumg Redonda de 10.5");
        Tablet tab2 = new Tablet(5000.0, "Stylus2", "Huawey", "MatePad 11.5 PaperMatte", "11.5 Pulgadas", "Harmony OS 3.1", 8, 19000, "HUAWEI FullView de 11.5");
        Tablet tab3 = new Tablet(5000.0, "Stylus3", "Dell", "5300", "13.3 Pulgadas", "Windows 10 Pro", 16, 25000, "Intel de 13.3");
        Tablet tab4 = new Tablet(5100.0, "Stylus4", "Lenovo", "Tab M8", "8 Pulgadas", "A", 3, 30000, "HD de 8");

        // Crear tres objetos de la clase Pc
        Pc pc1 = new Pc(4000.0, "800 G3 SFF", "HD", "21,5 Pulgadas", 4, "Windows 10 Pro", "32GB", "DDR4", "Integrada");
        Pc pc2 = new Pc(8000.0, "ThinkCentre M720s SFF", "Lenovo", "22 Pulgadas", 8, "Windows 10 Pro", "16", "P8", "Integrada");
        Pc pc3 = new Pc(11000.0, "ProDesk", "HP", "19 Pulgadas", 16, "Windows 10 Home", "32", "P9", "Integrada");

        // Crear tres objetos de la clase Laptop
        Television tv1 = new Television(12000.0, "Mod223", "Motorola", "55 Pulgadas", "1 año");
        Television tv2 = new Television(9500.0, "Mod453", "Weyon", "60 Pulgadas", "2 años");
        Television tv3 = new Television(10100.0, "Mod574", "Sansui", "80 Pulgadas", "3 años");

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

/*
package Compradores;

import dispositivos.DispElect;
import dispositivos.Pc;
import dispositivos.Tablet;
import dispositivos.Television;
import java.util.ArrayList;
import java.util.Scanner;


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
        
        Tablet tab1 = new Tablet(4000.0, "Sam Pro", "Samsumg", "amsumg Redonda de 10.5", "Android", "10.5 pulgadas", 4, 21000, "Si");
        Tablet tab2 = new Tablet(5000.0, "MatePad 11.5 PaperMatte", "Huawey", "MatePad 11.5 PaperMatte", "Harmony OS 3.1", "11.5 pulgadas", 8, 19000, "Si");
        Tablet tab3 = new Tablet(5000.0, "Intel", "Dell", "5300", "13.3 Pulgadas", "Windows 10 Pro", 16, 25000, "Intel de 13.3");
        Tablet tab4 = new Tablet(5100.0, "Tab MB", "Lenovo", "HD de 8", "Android", "8 pulgadas", 3, 30000, "Si");

        // Crear tres objetos de la clase Pc
        Pc pc1 = new Pc(4000.0, "800 G3 SFF", "HD", "21,5 Pulgadas", 4, "Windows 10 Pro", "32GB", "DDR4", "Integrada");
        Pc pc2 = new Pc(8000.0, "ThinkCentre M720s SFF", "Lenovo", "22 Pulgadas", 8, "Windows 10 Pro", "16", "P8", "Integrada");
        Pc pc3 = new Pc(11000.0, "ProDesk", "HP", "19 Pulgadas", 16, "Windows 10 Home", "32", "P9", "Integrada");

        // Crear tres objetos de la clase Laptop
        Television tv1 = new Television(12000.0, "Mod223", "Motorola", "55 Pulgadas", "1 año");
        Television tv2 = new Television(9500.0, "Mod453", "Weyon", "60 Pulgadas", "2 años");
        Television tv3 = new Television(10100.0, "Mod574", "Sansui", "80 Pulgadas", "3 años");

        ArrayList<DispElect> menu = new ArrayList<>();
        
 
        menu.add(tab1);
        menu.add(tab2);
        menu.add(tab3);
        menu.add(tab4);
        menu.add(pc1);
        menu.add(pc2);
        menu.add(pc3);
        menu.add(tv1);
        menu.add(tv2);
        menu.add(tv3);
    }

    public void mostrarMenu(){
        
        System.out.println("Estos son los productos que tenemos para usted:");
        System.out.print("\n");
        int index=0;
        for(DispElect check : menu){
            index++;
            System.out.println("Indice: "+index);
            check.mostrarDatos();
            System.out.println("\n");
        }
    }

    public void comprar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que producto le gustaria comprar?");
        int chose = sc.nextInt();
        sc.nextLine();
        System.out.println(chose);
        int limit = menu.size();
        System.out.println(limit);
        if(0<=chose && chose<limit){
        int chose2 = chose-1;
        miCarrito.agregarAlCarrito(menu.get(chose2));
        System.out.println("Producto agregado al carrito");
        }
        else{
            System.out.println("Por favor, escoja una opcion disponible");
            System.exit(0);
        }
    }

    public void ticket(){
         double total = 0;
         System.out.println("Elementos agregados al carrito:");
         for (DispElect dispositivo : miCarrito.dispositivos){
            System.out. print("\n");
            dispositivo.mostrarDatos(); 
            total += dispositivo.getPrecio(); 
         }
         System.out.println("Total del carrito de compras: " + total);
     }

    

}

*/
