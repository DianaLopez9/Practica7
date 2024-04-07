package TiendaTecnologia.Compradores;

public class ClienteVip extends Comprador{
    private int idVip;

    public ClienteVip(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }
    
    
}
