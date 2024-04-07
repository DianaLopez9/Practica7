import java.util.Random;

public class DispElect{
	private int id;
	private double precio;
	private String nombre;
	private String marca;
	private String pantalla;

	Random rand = new Random();

	public DispElect(int id, double precio, String nombre, String marca, String pantalla){
		this.id = rand.nextInt(10000);
		this.precio = precio;
		this.nombre=nombre;
		this.marca=marca;
		this.pantalla=pantalla;
	}
	
	public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

	public String toString(){
		return "Dispositivo Electronico"
	}

	public void mostrarDatos(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Marca: "+this.marca);
		System.out.println("Pantalla: "+this.pantalla);
		System.out.println("Precio: "+this.id);
		System.out.println("Id: "+this.id);
	}
}
