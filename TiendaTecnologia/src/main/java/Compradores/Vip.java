/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compradores;

/**
 *
 * @author nana
 */
public class Vip extends Comprador{
    private int idVip;

    public Vip(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }
    
    
}
