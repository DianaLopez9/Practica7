public class Television extends DispElect{

  private String garantia;

  public Television (int id, double precio, String nombre, String marca, String pantalla, String garantia){
    super(id, precio, nombre, marca, pantalla);
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

