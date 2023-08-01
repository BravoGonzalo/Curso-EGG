/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author GonzaletoKun
 */
public class EJExtra2 {

    public static void main(String[] args) {
        Polideportivo poli1 = new Polideportivo("abierto", 18, 90, 20);
        Polideportivo poli2 = new Polideportivo("cerrado", 90, 100, 50);
        Polideportivo poli3 = new Polideportivo("abierto", 19, 222, 55);
        
        EdificioDeOficinas edi1 = new EdificioDeOficinas(5, 18, 2, 18, 90, 20);
        EdificioDeOficinas edi2 = new EdificioDeOficinas(20, 10, 5, 90, 100, 50);
        
        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(poli3);
        edificios.add(edi1);
        edificios.add(edi2);
        
        for(Edificio aux : edificios){
            aux.calcularSuperficie();
            aux.calcularVolumen();
            System.out.println("----------------------");
        }
        
        ArrayList<Polideportivo> poliD = new ArrayList<>();
        poliD.add(poli1);
        poliD.add(poli2);
        poliD.add(poli3);
        
        int abierto = 0;
        int cerrado = 0;
        for(Polideportivo aux : poliD){
            if(aux.getAbiertOtechado().equals("abierto")){
                abierto++;
            }else{
                cerrado++;
            }
        }
        System.out.println("La cantidad de Polideportivos que hay abierto son: " + abierto);
        System.out.println("La cantidad de Polideportivos que hay cerrados son: " + cerrado);
        
        ArrayList<EdificioDeOficinas> Ofi = new ArrayList<>();
        Ofi.add(edi1);
        Ofi.add(edi2);
        
        int i = 1;
        for(EdificioDeOficinas aux : Ofi){
            i++;
            System.out.println("La cantidad de personas en el edificio " + i + " son: " + aux.cantPersonas());
        }
    }
}
