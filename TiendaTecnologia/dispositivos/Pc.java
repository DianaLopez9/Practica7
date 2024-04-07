
public class Pc extends Computadora{
    
    private String memoria;
    private String tarjmadre;
    private String tarjgrafica;
    
    public Pc(double precio, String nombre, String marca, String pantalla, int ram, String sistema, String memoria, String tarjmadre, String tarjgrafica){
        super(precio, nombre, marca, pantalla,ram,sistema);
        this.memoria=memoria;
        this.tarjmadre=tarjmadre;
        this.tarjgrafica=tarjgrafica;
    }
    
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
