/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author GonzaletoKun
 */
public class LavadoraService extends Electrodomestico{
    public Lavadora lava;
    
    public void crearLavadora(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        lava = new Lavadora();
        
        System.out.println("Ingrese el precio del producto.");
        lava.setPrecio(input.nextDouble());
        if (lava.getPrecio() < 1000.0) {
            System.out.println("El precio base es de $1000, por ende se le ha puesto por default");
            lava.setPrecio(1000.0);
        }
        
        System.out.println("Ingrese el color del producto.");
        lava.setColor(input.next());
        comprobarColor(lava.getColor());
        
        System.out.println("¿Cual es el consumo del electrodomestico?");
        lava.setConsumoEnergetico(input.next().charAt(0));
        comprobarConsumoEnergetico(lava.getConsumoEnergetico());
        
        System.out.println("¿Cual es el peso del producto?");
        lava.setPeso(input.nextDouble());
        
        System.out.println("¿Cual es la capacidad de carga?");
        lava.setCarga(input.nextDouble());
    }
    
    @Override
    public double precioFinal(){
        double precioFinal = lava.getPrecio();
        
        switch (lava.getConsumoEnergetico()) {
            case 'a':
                precioFinal += 1000;
                break;
            case 'b':
                precioFinal += 800;
                break;
            case 'c':
                precioFinal += 600;
                break;
            case 'd':
                precioFinal += 500;
                break;
            case 'e':
                precioFinal += 300;
                break;
            case 'f':
                precioFinal += 100;
                break;
        }

        if (lava.getPeso() >= 1 && lava.getPeso() <= 19) {
            precioFinal += 100;
        } else if (lava.getPeso() >= 20 && lava.getPeso() <= 49) {
            precioFinal += 500;
        } else if (lava.getPeso() >= 50 && lava.getPeso() <= 79) {
            precioFinal += 800;
        } else if (lava.getPeso() >= 80) {
            precioFinal += 1000;
        }
        
        if (lava.getCarga() > 30) {
            precioFinal += 500;
        }
        return precioFinal;
    }
    
}
