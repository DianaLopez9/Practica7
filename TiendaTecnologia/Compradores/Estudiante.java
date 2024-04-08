/*package TiendaTecnologia.Compradores;

import dispositivos.DispElect;
import dispositivos.Laptop;
import dispositivos.Pc;
import dispositivos.Smartphone;*/

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante extends Comprador{
    private int idEstudiante;
    private ArrayList<DispElect> menu;
    

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
        this.menu = new ArrayList<>();
    }
    
    public void setIdEstidiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    /*@Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double precioConDescuento() {
        return precioEstidiante = (int) (precioEstidiante * (descuento/100.0));
        
    }*/

    public void crearMenu(){
        Smarthphone smartphone1 = new Smarthphone(500.0, "Modelo1", "Marca1", "Pantalla1", "Sistema1", 4, 30, "21x5");
        Smarthphone smartphone2 = new Smarthphone(600.0, "Modelo2", "Marca2", "Pantalla2", "Sistema2", 6, 35, "22x6");
        Smarthphone smartphone3 = new Smarthphone(700.0, "Modelo3", "Marca3", "Pantalla3", "Sistema3", 8, 40, "20x5");

        // Crear tres objetos de la clase Pc
        Pc pc1 = new Pc(800.0, "Modelo1", "Marca1", "Pantalla1", 4, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1");
        Pc pc2 = new Pc(900.0, "Modelo2", "Marca2", "Pantalla2", 8, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2");
        Pc pc3 = new Pc(1000.0, "Modelo3", "Marca3", "Pantalla3", 16, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3");

        // Crear tres objetos de la clase Laptop
        Laptop laptop1 = new Laptop(1200.0, "Modelo1", "Marca1", "Pantalla1", 8, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1",64);
        Laptop laptop2 = new Laptop(1400.0, "Modelo2", "Marca2", "Pantalla2", 16, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2",24);
        Laptop laptop3 = new Laptop(1600.0, "Modelo3", "Marca3", "Pantalla3", 32, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3",12);


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

    public void mostrarDescuentos(){
    
       System.out.println("Ofertas disponibles:");
       System.out.println("1 - En la compra de una Laptop y un smartphone, el segundo sale a mitad de precio");
       System.out.println("2 - En la compra de una PC y un Smartphone, el segundo es gratis");
       
       Scanner sc2 = new Scanner(System.in);
       
       int chose2 = sc2.nextInt();
        switch(chose2){
               case 1:
                    miCarrito.agregarAlCarrito(menu.get(7));
                    DispElect telefono = menu.get(4);
                    double newPrice = (telefono.getPrecio()/2);
                    telefono.setPrecio(newPrice);
                    miCarrito.agregarAlCarrito(telefono);
                    System.out.println("Articulos ya han sido agregados");
                    break;
                   
                case 2:
                    miCarrito.agregarAlCarrito(menu.get(2));
                    DispElect telefono2 = menu.get(3);
                    telefono2.setPrecio(0);
                    miCarrito.agregarAlCarrito(telefono2);
                    System.out.println("Articulos ya han sido agregados");
                    break;
                default:
                    System.out.println("Utilice las opciones disponibles, por favor");
           }
    }
}
