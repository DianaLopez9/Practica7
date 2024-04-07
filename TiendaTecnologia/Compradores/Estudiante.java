package TiendaTecnologia.Compradores;

public class Estudiante extends Comprador implements Descuentos{
    private double descuento;
    private int idEstudiante;
    public int precioEstidiante;

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    public void setIdEstidiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double precioConDescuento() {
        return precioEstidiante = (int) (precioEstidiante * (descuento/100.0));
        
    }
    
    
}
