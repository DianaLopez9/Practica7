public class Television extends DispElect{

  private String garantia;

  public Television (double precio, String nombre, String marca, String pantalla, String garantia){
    super(precio, nombre, marca, pantalla);
    this.garantia = garantia;
  }

  public String toString(){
    return "Television";
  }

  public void mostrarDatos(){
	super.mostrarDatos();
        System.out.println("Garantia: "+this.garantia);
  }
  
}

