
public class Smarthphone extends Movil{

    private int bateria;
    private String tamanio;
    
    public Smarthphone(double precio, String nombre, String marca, String pantalla, String sistema, int ram, int bateria, String tamanio){
        super(precio, nombre, marca, pantalla,sistema,ram);
        this.bateria=bateria;
        this.tamanio=tamanio;
    }
    
    public String toString(){
        return "Smartphone";
    }
    
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Duracion de la bateria: "+this.bateria+" horas");
        System.out.println("Tamanio: "+this.tamanio);
    }
}
