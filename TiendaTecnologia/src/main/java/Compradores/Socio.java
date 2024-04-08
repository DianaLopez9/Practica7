/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compradores;


/**
 *
 * @author nana
 */

public class Socio extends Comprador{
    private double descuento;
    private int idSocio;
    public int precioSocio;

    
    public Socio(String nombre, String apellido, double descuento) {
        super(nombre, apellido);
        this.descuento = descuento;
    }
    
    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdSocio() {
        return idSocio;
    }

    
    
}
