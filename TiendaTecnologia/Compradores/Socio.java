package TiendaTecnologia.Compradores;

public class Socio extends Comprador{
	private String nombre;
	private String apellido;
	//private int 

	public Socio(String nombre, String apellido){
		super(nombre, apellido);
	}

	
    public void mostrarPromociones() {
    	System.out.println("¡Hola " + getNombre() + " Te mostramos las pomociones disponibles para socio:");
    }


}
