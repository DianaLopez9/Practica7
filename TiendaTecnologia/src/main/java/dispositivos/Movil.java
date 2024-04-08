/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author nana
 */
public class Movil extends DispElect{
    private String sistema;
    private int ram;

    public Movil(String sistema, int ram, double precio, String nombre, String marca, String pantalla) {
        super(precio, nombre, marca, pantalla);
        this.sistema = sistema;
        this.ram = ram;
    }
    
    

    /*public Movil (int id, double precio, String nombre, String marca, String pantalla, String sistema, int ram){
        super(id, precio, nombre, marca, pantalla);
        this.sistema=sistema;
        this.ram=ram;
    }*/
    
    @Override
    public String toString(){
        return "Movil";
    }
    
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Sistema Operativo: "+this.sistema);
        System.out.println("Tamaño de RAM: "+this.ram);
    }
}
