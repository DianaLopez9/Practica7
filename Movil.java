public class Movil extends DispElect{
    
  private String sistema;
  private int ram;

  public Movil (int id, int precio, String nombre, String marca, String pantalla, String sistema, int ram){
    super(int id, int precio, String nombre, String marca, String pantalla);
    this.sistema=sistema;
    this.ram=ram;
  }

  public String toString(){
    return "Movil";
  }

}
