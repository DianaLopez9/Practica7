/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Laptop extends Pc{
    
    private int bateria;

    public Laptop(int bateria, int ram, String nombre, String marca, String pantalla, int par2, String sistema, String memoria, String tarjmadre, String tarjgrafica, int par3) {
        super(ram, 1000, nombre, marca, pantalla, 16, sistema, memoria, tarjmadre, tarjgrafica);
        this.bateria = bateria;
    }

    public Laptop(int bateria) {
        this.bateria = bateria;
    }
    
    
        
        /*public Laptop(int id, double precio, String nombre, String marca, String pantalla, int ram, String sistema, String memoria, String tarjmadre, String tarjgrafica, int bateria){
            super(id, precio, nombre, marca, pantalla,ram,sistema,memoria,tarjmadre,tarjgrafica);
            this.bateria=bateria;
        }*/
        
    @Override
        public String toString(){
            return "Laptop";
        }
        
    @Override
        public void mostrarDatos(){
            super.mostrarDatos();
            System.out.println("Duracion de la bateria: "+this.bateria+" horas");
        }
}
