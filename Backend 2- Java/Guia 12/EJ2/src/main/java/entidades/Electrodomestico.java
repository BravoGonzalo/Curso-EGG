/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author GonzaletoKun
 */
public class Electrodomestico {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color.toLowerCase();
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        if (!(consumoEnergetico >= 'a') && !(consumoEnergetico <= 'f')) {
            this.consumoEnergetico = 'f';
        }
    }

    public void comprobarColor(String color) {
        if (!color.equals("blanco") && !color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris")) {
            this.color = "blanco";
        }
    }
    
    public void crearElectrodomestico(){}
    
    public double precioFinal(){
        double precioFinal = precio;
        return precioFinal;
    }
}
