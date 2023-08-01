/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Random;


/**
 *
 * @author GonzaletoKun
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        Random random = new Random();
        this.posicionActual = random.nextInt();
        this.posicionAgua = random.nextInt();
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public boolean mojar() {
        boolean exito = false;
        if (posicionActual == posicionAgua) {
            exito = true;
        }
        return exito;
    }

    public int siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }
        return posicionActual;
    }

    @Override
    public String toString() {
        return "Posicion Actual: " + posicionActual + " Posicion Agua: " + posicionAgua;
    }
}
