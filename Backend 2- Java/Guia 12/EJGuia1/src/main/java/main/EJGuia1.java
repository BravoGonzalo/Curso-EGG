/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GonzaletoKun
 */
public class EJGuia1 {

    public static void main(String[] args) {
       List<Animal> animales = new ArrayList<>();
       
       Animal a = new Animal();
       Animal b = new Perro();
       Animal c = new Gato();
       
       animales.add(a);
       animales.add(b);
       animales.add(c);
       
       for(Animal aux : animales){
           aux.hacerRuido();
       }
       
    }
}
