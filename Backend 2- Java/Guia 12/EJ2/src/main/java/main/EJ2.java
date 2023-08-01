/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import service.LavadoraService;
import service.TelevisorService;

/**
 *
 * @author GonzaletoKun
 */
public class EJ2 {

    public static void main(String[] args) {
        LavadoraService lavadora1 = new LavadoraService();
        LavadoraService lavadora2 = new LavadoraService();
        
        TelevisorService tv1 = new TelevisorService();
        TelevisorService tv2 = new TelevisorService();
        
        /////////////////////////////////////////////
        System.out.println("Lavadora1");
        lavadora1.crearLavadora();
        System.out.println("Lavadora2");
        lavadora2.crearLavadora();
        System.out.println("TV1");
        tv1.crearTelevisor();
        System.out.println("TV2");
        tv2.crearTelevisor();
        /////////////////////////////////////////////
        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>();
        electrodomestico.add(lavadora1);
        electrodomestico.add(lavadora2);
        electrodomestico.add(tv1);
        electrodomestico.add(tv2);
        
        for(Electrodomestico aux : electrodomestico){
            System.out.println("El precio final es: " + aux.precioFinal());
        }
    }
}
