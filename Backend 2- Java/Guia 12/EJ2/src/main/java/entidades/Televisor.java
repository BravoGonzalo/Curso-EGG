/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GonzaletoKun
 */
public class Televisor extends Electrodomestico {

    protected double resolucion;
    protected boolean sinconizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sinconizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sinconizadorTDT = sinconizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSinconizadorTDT() {
        return sinconizadorTDT;
    }

    public void setSinconizadorTDT(boolean sinconizadorTDT) {
        this.sinconizadorTDT = sinconizadorTDT;
    }

    
}
