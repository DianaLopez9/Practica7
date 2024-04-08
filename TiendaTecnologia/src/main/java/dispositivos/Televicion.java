/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Televicion extends DispElect{
    
    private String garantia;

    public Televicion(String garantia, double precio, String nombre, String marca, String pantalla) {
        super(precio, nombre, marca, pantalla);
        this.garantia = garantia;
    }
    
    

    /*public Televicion (int id, double precio, String nombre, String marca, String pantalla, String garantia){
        super(id, precio, nombre, marca, pantalla);
        this.garantia = garantia;
    }*/

    @Override
    public String toString(){
        return "Television";
    }
    
    @Override
    public void mostrarDatos(){
	super.mostrarDatos();
        System.out.println("Garantia: "+this.garantia);
    }
}
