/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Pc extends Computadora{
    
    private String memoria;
    private String tarjmadre;
    private String tarjgrafica;
    
    public Pc(int ram, int par1, String nombre, String marca, String pantalla, int par2, String sistema, String memoria, String tarjmadre, String tarjgrafica){
        super(precio, nombre, marca, pantalla,ram,sistema);
        this.memoria=memoria;
        this.tarjmadre=tarjmadre;
        this.tarjgrafica=tarjgrafica;
    }
    
    @Override
    public String toString(){
        return "PC";
    }
    
    
    public mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Memoria: "+this.memoria);    
        System.out.println("Tarjeta Madre: "+this.tarjmadre);
        System.out.println("Tarjeta Grafica: "+this.tarjgrafica);
    }
    
}