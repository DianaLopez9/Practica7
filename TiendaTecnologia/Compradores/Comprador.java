package TiendaTecnologia.Compradores;

import java.util.Random; 

import java.util.Random; 

public class Comprador {
    private int id; 
    private String nombre;
    private String apellido;
    public CarritoDeCompras miCarrito;

    Random rand = new Random();
    
    public Comprador(String nombre, String apellido){
	this.id = rand.nextInt(10000);
	this.nombre = nombre;
	this.apellido = apellido;
	this.miCarrito = new CarritoDeCompras();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void agregarAlCarrito(DispElec dispositivo) {
        this.miCarrito.agregarAlCarrito(dispositivo);
    }

    public void mostrarCarrito() {
        this.miCarrito.mostrarCarrito();
    }

    /*public void realizarCompra(){

    }*/
    
}
