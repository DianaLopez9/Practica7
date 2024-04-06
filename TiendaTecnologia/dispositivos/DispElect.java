
public class DispElect{
	private int id;
	private int precio;
	private String tipoDispElect;
	private String nombre;
	private String marca;
	private String pantalla;

	public DispElect(int id, int precio, String nombre, String marca, String pantalla){
		this.id = id;
		this.precio = precio;
		this.nombre=nombre;
		this.marca=marca;
		this.pantalla=pantalla;
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
