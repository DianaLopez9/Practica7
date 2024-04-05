package TiendaTecnologia.Productos;

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
}