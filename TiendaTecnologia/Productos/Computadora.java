package TiendaTecnologia.Productos;

public class Computadora extends DispElect{

  private int ram;
  private String sistema;

  public Computadora (int id, int precio, String nombre, String marca, String pantalla, int ram, String sistema){
    super(id, precio, nombre, marca, pantalla);
    this.ram=ram;
    this.sistema=sistema;
  }

  public String toString(){
    return "Computadora";
  }
}