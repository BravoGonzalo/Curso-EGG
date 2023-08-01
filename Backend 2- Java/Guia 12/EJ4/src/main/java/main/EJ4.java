/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author GonzaletoKun
 */
public class EJ4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10, 5);
        Rectangulo rectangulo = new Rectangulo(6, 4);
        
        System.out.println("El area del circulo es: " + circulo.Área());
        System.out.println("El perimetro del circulo es: " + circulo.Perimetro());
        
        System.out.println("El area del rectangulo es: " + rectangulo.Área());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.Perimetro());
    }
}
