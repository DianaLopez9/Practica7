package TiendaTecnologia.Compradores;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante extends Comprador implements Descuentos{
    private double descuento;
    private int idEstudiante;
    public int precioEstidiante;

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    public void setIdEstidiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    @Override
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
        
    }

    public void crearMenu(){
        Smarthphone smartphone1 = new Smarthphone(1, 500, "Modelo1", "Marca1", "Pantalla1", "Sistema1", 4, 3000, "Tamaño1");
        Smarthphone smartphone2 = new Smarthphone(2, 600, "Modelo2", "Marca2", "Pantalla2", "Sistema2", 6, 3500, "Tamaño2");
        Smarthphone smartphone3 = new Smarthphone(3, 700, "Modelo3", "Marca3", "Pantalla3", "Sistema3", 8, 4000, "Tamaño3");

        // Crear tres objetos de la clase Pc
        Pc pc1 = new Pc(4, 800, "Modelo1", "Marca1", "Pantalla1", 4, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1");
        Pc pc2 = new Pc(5, 900, "Modelo2", "Marca2", "Pantalla2", 8, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2");
        Pc pc3 = new Pc(6, 1000, "Modelo3", "Marca3", "Pantalla3", 16, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3");

        // Crear tres objetos de la clase Laptop
        Laptop laptop1 = new Laptop(7, 1200, "Modelo1", "Marca1", "Pantalla1", 8, "Sistema1", "Memoria1", "TarjetaMadre1", "TarjetaGrafica1", 5000);
        Laptop laptop2 = new Laptop(8, 1400, "Modelo2", "Marca2", "Pantalla2", 16, "Sistema2", "Memoria2", "TarjetaMadre2", "TarjetaGrafica2", 6000);
        Laptop laptop3 = new Laptop(9, 1600, "Modelo3", "Marca3", "Pantalla3", 32, "Sistema3", "Memoria3", "TarjetaMadre3", "TarjetaGrafica3", 7000);

        Arraylist<DispElect> menu = new ArrayList<>();

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
        if(0>chose && chose<menu.size()){
        miCarrito.agregarAlCarrito(menu.get(chose));
        System.out.println("Producto agregado al carrito");
        }
        else{
            System.out.println("Por favor, escoja una opcion disponible");
        }
    }

    public void ticket(){
         
     }
    
    
    
}
