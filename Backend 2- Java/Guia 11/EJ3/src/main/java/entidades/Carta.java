/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author GonzaletoKun
 */
public class Carta {
    private ArrayList<Integer> numeros;
    private String[] palo;

    public Carta() {
    }

    public Carta(ArrayList<Integer> numeros, String[] palo){
        this.numeros = numeros;
        this.palo = palo;
        
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public String[] getPalo() {
        return palo;
    }

    public void setPalo(String[] palo) {
        this.palo = palo;
    }
    
    @Override
    public String toString() {
        return "Carta = " + numeros.get(0) + " Palo = " + palo[0];
    }
    
}
