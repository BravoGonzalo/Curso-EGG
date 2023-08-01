/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package EJ3;

import entidades.Carta;
import java.util.Scanner;
import service.Baraja;

/**
 *
 * @author GonzaletoKun
 */
public class EJ3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Baraja baraja = new Baraja();
        boolean condi = true;
        System.out.println("¿Cuantas cartas desea?");
        int cantCartas = input.nextInt();
        baraja.darCartas(cantCartas);
        System.out.println("Se han repartido las cartas.");
        while (condi) {
            System.out.println("¿Que desea hacer?");
            System.out.println("1- barajar.");
            System.out.println("2- siguiente carta.");
            System.out.println("3- Indicar cuantas cartas estan disponibles.");
            System.out.println("4- Mostar cartas del monton.");
            System.out.println("5- Mostrar baraja.");
            System.out.println("6- salir");
            int resp = input.nextInt();
            switch (resp) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    baraja.siguienteCarta();
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    baraja.cartasMonton();
                    break;
                case 5:
                    baraja.mostrarBaraja();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    condi = false;
                    break;

            }
        }
    }
}
