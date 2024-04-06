
public class Laptop extends Pc{
        
        private int bateria;
        
        public Laptop(int id, int precio, String nombre, String marca, String pantalla, int ram, String sistema, String memoria, String tarjmadre, String tarjgrafica, int bateria){
            super(id, precio, nombre, marca, pantalla,ram,sistema,memoria,tarjmadre,tarjgrafica);
            this.bateria=bateria;
        }
        
        public String toString(){
            return "Laptop";
        }
        
        public void mostrarDatos(){
            super.mostrarDatos();
            System.out.println("Duracion de la bateria: "+this.bateria+" horas");
        }
}
