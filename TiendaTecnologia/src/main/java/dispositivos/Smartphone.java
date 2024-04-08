/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Smartphone extends Movil{
    private int bateria;
    private String tamanio;

    public Smartphone(int bateria, String tamanio, String sistema, int ram, double precio, String nombre, String marca, String pantalla) {
        super(sistema, ram, precio, nombre, marca, pantalla);
        this.bateria = bateria;
        this.tamanio = tamanio;
    }
    
    /*public Smartphone(int id, double precio, String nombre, String marca, String pantalla, String sistema, int ram, int bateria, String tamanio){
        super(id, precio, nombre, marca, pantalla,sistema,ram);
        this.bateria=bateria;
        this.tamanio=tamanio;
    }*/
    
    @Override
    public String toString(){
        return "Smartphone";
    }
    
    public void mostraDatos(){
        super.mostrarDatos();
        System.out.println("Duracion de la bateria: "+this.bateria+" horas");
        System.out.println(this.tamanio);
    }
}
