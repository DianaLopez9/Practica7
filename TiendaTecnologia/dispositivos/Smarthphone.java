
public class Smarthphone extends Movil{

    private int bateria;
    private String tamanio;
    
    public Smartphone(int id, double precio, String nombre, String marca, String pantalla, String sistema, int ram, int bateria, String tamanio){
        super(id, precio, nombre, marca, pantalla,sistema,ram);
        this.bateria=bateria;
        this.tamanio=tamanio;
    }
    
    public String toString(){
        return "Smartphone";
    }
    
    public void mostraDatos(){
        super.mostrarDatos();
        System.out.println("Duracion de la bateria: "+this.bateria+" horas");
        System.out.println(this.tamanio);
    }
}
