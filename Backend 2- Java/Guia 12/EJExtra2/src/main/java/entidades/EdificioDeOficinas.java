/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GonzaletoKun
 */
public final class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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
    
    public int cantPersonas(){
        int personasPorPiso = getCantPersonas() * getNumOficinas();
        int personasPorEdificios = personasPorPiso * getNumPisos();
        return personasPorEdificios; 
    }
}
