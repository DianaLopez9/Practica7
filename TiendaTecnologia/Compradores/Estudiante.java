package TiendaTecnologia.Compradores;

public class Estudiante extends Comprador{

	//private ArrayList<DispElect> Carrito;
	private String nombre;
	private String apellido;
	//private int 

	public Socio(String nombre, String apellido){
		super(nombre, apellido);
		this.carrito = new ArrayList<>();
	}

	/*public void agregarAlCarrito(DispElec disp){
		this.Carrito.add(disp);
	}

	public void mostrarCarrito(){
		for(DispElect electronicos : Carrito){
			electronicos.mostraDatos();
		}
	}*/

	

	
	public void mostrarPromociones() {
	    System.out.println("¡Hola " + getNombre() + " Te mostramos las pomociones disponibles para socio:");
	}
	
}
