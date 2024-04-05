package TiendaTecnologia.Compradores;

import java.util.Random; 

public class Comprador{
	private int id; 
	private String nombre;
	private CarritoDeCompras miCarrito;

	Random rand = new Random();

	public Comprador(String nombre){
		this.id = rand.nextInt(10000);
		this.nombre = nombre;
		this.miCarrito = new CarritoDeCompras();
	}

    //????
	/*public void mostrarMenu(){
		System.out.println("Bienvenido al Menu");
		System.out.println("Pc");
		System.out.println("Laptop");
	}*/

	public void mostrarDescuentos(){
		System.out.println("Estos son los descuentos disponibles");
	}
}
