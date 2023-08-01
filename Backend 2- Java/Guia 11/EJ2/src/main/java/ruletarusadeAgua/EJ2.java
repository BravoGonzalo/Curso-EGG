/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ruletarusadeAgua;

import entidades.Juego;
import entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author GonzaletoKun
 */
public class EJ2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Juego juego = new Juego();
        Revolver r = new Revolver();
        
        System.out.println("Ingrese la cantidad de jugadores.");
        juego.llenarJuego(input.nextInt());
        juego.ronda();
    }
}
