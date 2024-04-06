public class Movil extends DispElect{
    
  private String sistema;
  private int ram;

  public Movil (int id, int precio, String nombre, String marca, String pantalla, String sistema, int ram){
    super(id, precio, nombre, marca, pantalla);
    this.sistema=sistema;
    this.ram=ram;
  }

  public String toString(){
    return "Movil";
  }
  
  public void mostrarDatos(){
      super.mostrarDatos();
      System.out.println("Sistema Operativo: "+this.sistema);
      System.out.println("Tamaño de RAM: "+this.ram);
  }

}
