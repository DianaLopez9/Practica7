
public class Tablet extends Smartphone {

    private String stylus;
    
    public Tablet(int id, double precio, String nombre, String marca, String pantalla, String sistema, int ram, int bateria, String tamanio, String stylus){
        super(id, precio, nombre, marca, pantalla,sistema,ram,bateria,tamanio);
        this.stylus=stylus;
    }
    
    public String toString(){
        return "Tablet"
    }
    
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Stylus: "+this.stylus);
    }
    
}
