/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Tablet extends Smartphone{
    
    private String stylus;

    public Tablet(String stylus, int bateria, String tamanio, String sistema, int ram, double precio, String nombre, String marca, String pantalla) {
        super(bateria, ram, tamanio, sistema, nombre, marca, 8, 4000, pantalla);
        this.stylus = stylus;
    }
    
    
    
   /* public Tablet(int id, double precio, String nombre, String marca, String pantalla, String sistema, int ram, int bateria, String tamanio, String stylus){
        super(id, precio, nombre, marca, pantalla,sistema,ram,bateria,tamanio);
        this.stylus=stylus;
    }*/
    
    
    @Override
    public String toString(){
        return "Tablet";
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Stylus: "+this.stylus);
    }
}
