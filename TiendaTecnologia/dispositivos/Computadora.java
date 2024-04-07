public class Computadora extends DispElect{

  private int ram;
  private String sistema;

  public Computadora (double precio, String nombre, String marca, String pantalla, int ram, String sistema){
    super(precio, nombre, marca, pantalla);
    this.ram=ram;
    this.sistema=sistema;
  }

  public String toString(){
    return "Computadora";
  }
  
  public void mostrarDatos(){
      super.mostrarDatos();
      System.out.println("Sistema Operativo: "+this.sistema);
      System.out.println("Tamaño de RAM: "+this.ram);
  }
}
