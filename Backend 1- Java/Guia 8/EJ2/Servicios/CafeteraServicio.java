package Servicios;

import java.util.Scanner;

import Entidades.Cafetera;

public class CafeteraServicio {
    Scanner input = new Scanner(System.in);
    Cafetera caf = new Cafetera();

    public void llenarCafetera(){
        caf.setcapacidadActual(caf.getcapacidadMaxima());
        System.out.println("La capacidad actual es de: " + caf.getcapacidadMaxima());
    }

    public void servirTaza(){
        System.out.println("Ingresar el tamaño de la taza.");
        double tamaño = input.nextDouble();
        if (caf.getcapacidadActual() == tamaño){
            System.out.println("La taza se ha llenado.");
        } else{
            System.out.println("No se ha podido llenar por completo la taza.");
            System.out.println("se ha quedado en " + caf.getcapacidadActual());
        }
    }

    public void vaciarCafetera(){
        caf.setcapacidadActual(0);
    }

    public void agregarCafe(){
        System.out.println("¿Cuanto cafe desea ponerle a la cafetera?");
        double tamaño = input.nextDouble();
        caf.setcapacidadActual(caf.getcapacidadActual() + tamaño);
        System.out.println("Se le llenó " + tamaño + " a la cafetera...");
        System.out.println(caf.getcapacidadActual());
    }
}
