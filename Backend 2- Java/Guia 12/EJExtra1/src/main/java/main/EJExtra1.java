/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Alquiler;
import entidades.Barco;
import entidades.Veleros;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author GonzaletoKun
 */
public class EJExtra1 {

    public static void main(String[] args) {
        Barco barco = new Veleros(5, 14440, 90, 1990);
        
        LocalDate fechaAlquiler = LocalDate.of(2023, Month.JUNE, 7);
        LocalDate fechaDevolucion = LocalDate.of(2023, Month.JUNE, 9);
        
        Alquiler alquiler = new Alquiler("Gonzalo", 43149914, fechaAlquiler, fechaDevolucion, 4, barco);
        
        System.out.println("El costo del alquiler va a ser de: " + alquiler.calcularAlquiler());
    }
}
