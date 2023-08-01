/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GonzaletoKun
 */
public final class Polideportivo extends Edificio {

    private String abiertOtechado;

    public Polideportivo() {
    }

    public Polideportivo(String abiertOtechado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.abiertOtechado = abiertOtechado;
    }

    public String getAbiertOtechado() {
        return abiertOtechado;
    }

    public void setAbiertOtechado(String abiertOtechado) {
        this.abiertOtechado = abiertOtechado;
    }

    
    @Override
    public void calcularSuperficie() {
        double superficie = 2 * (getAncho() * getLargo() + getAncho() * getAlto() + getLargo() * getAlto());
        System.out.println("Superficie: " + superficie);

    }

    @Override
    public void calcularVolumen() {
        double volumen = getAncho() * getLargo() * getAlto();
        System.out.println("Volumen: " + volumen);
    }
}
