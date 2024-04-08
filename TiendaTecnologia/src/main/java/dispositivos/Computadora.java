/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Computadora extends DispElect{

  private int ram;
  private String sistema;

  public Computadora (double precio, String nombre, String marca, String pantalla, int ram, String sistema){
    super(precio, nombre, marca, pantalla);
    this.ram=ram;
    this.sistema=sistema;
  }

  @Override
  public String toString(){
    return "Computadora";
  }
  
  @Override
  public void mostrarDatos(){
      super.mostrarDatos();
      System.out.println("Sistema Operativo: "+this.sistema);
      System.out.println("Tamaño de RAM: "+this.ram);
  }
}