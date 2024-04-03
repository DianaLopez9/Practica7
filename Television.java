public class Television extends DispElect{

  private String garantia;

  public Television (int id, int precio, String nombre, String marca, String pantalla, String garantia){
    super(int id, int precio, String nombre, String marca, String pantalla);
    this.garantia = garantia;
  }

  public String toString(){
    return "Television";
  }
  
}

