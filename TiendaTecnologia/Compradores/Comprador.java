package TiendaTecnologia.Compradores;

import java.util.Random; 

public class Comprador{
	private int id; 
	private String nombre;
	private String apellido;
	//private CarritoDeCompras miCarrito;

	Random rand = new Random();

	public Comprador(String nombre, String apellido){
		this.id = rand.nextInt(10000);
		this.nombre = nombre;
		this.apellido = apellido;
		//this.miCarrito = new CarritoDeCompras();
	}

    //????
	/*public void mostrarMenu(){
		System.out.println("Bienvenido al Menu");
		System.out.println("Pc");
		System.out.println("Laptop");
	}*/

	public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    /*public void mostrarDescuentos(){
		System.out.println("Estos son los descuentos disponibles");
	}

   public void agregarAlCarrito(DispositivoElectronico dispositivo) {
      
    }

    public void mostrarCarrito() {
        
    }

    public void vaciarCarrito() {
        
    }

    public void realizarCompra(){

     }*/
}
