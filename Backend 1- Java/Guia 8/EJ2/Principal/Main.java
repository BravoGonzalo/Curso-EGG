package Principal;

import java.util.Scanner;

import Servicios.CafeteraServicio;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CafeteraServicio caf = new CafeteraServicio();

        System.out.println("¿Que desea hacer?");
        System.out.println("1- Llenar la cafetera");
        System.out.println("2- Servir en una taza");
        System.out.println("3- Vaciar la cafetera.");
        System.out.println("4- Agregar café a la cafetera.");
        System.out.println("5- Salir.");
        int respuesta = input.nextInt();
        do {
            switch (respuesta) {
                case 1:
                    caf.llenarCafetera();
                case 2:
                    caf.servirTaza();
                case 3:
                    caf.vaciarCafetera();
                case 4:
                    caf.agregarCafe();
                case 5:
                    break;
            }
        } while (respuesta == 5);
        input.close();
    }
}
