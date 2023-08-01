/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Electrodomestico;
import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author GonzaletoKun
 */
public class TelevisorService extends Electrodomestico {

    public Televisor tv;

    public void crearTelevisor() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        tv = new Televisor();

        System.out.println("Ingrese el precio del producto.");
        tv.setPrecio(input.nextDouble());
        if (tv.getPrecio() < 1000.0) {
            System.out.println("El precio base es de $1000. Por ende se le ha puesto default.");
            tv.setPrecio(1000.0);
        }

        System.out.println("Ingrese el color del producto.");
        comprobarColor(input.next());

        System.out.println("¿Cual es el consumo del electrodomestico?");
        tv.setConsumoEnergetico(input.next().charAt(0));
        comprobarConsumoEnergetico(tv.getConsumoEnergetico());

        System.out.println("¿Cual es el peso del producto?");
        tv.setPeso(input.nextDouble());

        System.out.println("¿Que resolucion tiene su TV? pongalo en pulgadas.");
        tv.setResolucion(input.nextDouble());

        while (true) {
            System.out.println("¿Tiene sincronizacion TDT?");
            System.out.println("Solo se aceptará si o no.");
            String condi = input.next();
            if (condi.equals("si") || condi.equals("no")) {
                if (condi.equals("si")) {
                    tv.setSinconizadorTDT(true);
                    break;
                } else if (condi.equals("no")) {
                    tv.setSinconizadorTDT(false);
                    break;
                }
                break;
            } else {
                System.out.println("Error. Ponga una opcion valida...");
            }
        }
    }

    @Override
    public double precioFinal() {
        double precioFinal = tv.getPrecio();

        switch (tv.getConsumoEnergetico()) {
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

        if (tv.getPeso() >= 1 && tv.getPeso() <= 19) {
            precioFinal += 100;
        } else if (tv.getPeso() >= 20 && tv.getPeso() <= 49) {
            precioFinal += 500;
        } else if (tv.getPeso() >= 50 && tv.getPeso() <= 79) {
            precioFinal += 800;
        } else if (tv.getPeso() >= 80) {
            precioFinal += 1000;
        }

        if (tv.getResolucion() > 40) {
            precioFinal = (precioFinal * 0.30) + precioFinal;
        }

        if (tv.isSinconizadorTDT()) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}
