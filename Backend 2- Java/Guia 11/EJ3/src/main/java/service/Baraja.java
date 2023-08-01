/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author GonzaletoKun
 */
public class Baraja {

    private ArrayList<Carta> baraja;
    private ArrayList<Carta> cartasMonton;
    private int posicionCarta;

    public Baraja() {
        this.baraja = new ArrayList<>();
        this.cartasMonton = new ArrayList<>();
        this.posicionCarta = 0;

        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    ArrayList<Integer> numeros = new ArrayList<>();
                    numeros.add(numero);
                    Carta carta = new Carta(numeros, new String[]{palo});
                    baraja.add(carta);
                }
            }
        }
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void barajar() {
        Collections.shuffle(baraja);

    }

    public Carta siguienteCarta() {

        if (posicionCarta >= baraja.size()) {
            System.out.println("Usted se ha quedado sin cartas");
            return null;
        }

        Carta carta = baraja.get(posicionCarta);
        cartasMonton.add(carta);
        posicionCarta++;
        return carta;
    }

    public void cartasDisponibles() {
        for (Carta cartas : baraja) {
            System.out.println(cartas);
        }
    }

    public ArrayList<Carta> darCartas(int cant) {
        if (cant > baraja.size()) {
            System.out.println("No hay cartas disponibles");
            return new ArrayList<>();
        }

        ArrayList<Carta> cartasPerdidas = new ArrayList<>();
        for (int i = 0; i < cant; i++) {
            Carta carta = baraja.get(posicionCarta);
            cartasPerdidas.add(carta);
            posicionCarta++;
        }
        baraja.removeAll(cartasPerdidas);
        return cartasPerdidas;
    }

    public ArrayList<Carta> cartasMonton() {

        if (cartasMonton.isEmpty()) {
            System.out.println("No ha salido ninguna carta... aun");
        } else {
            System.out.println("Cartas en el monton.");
            for (Carta cartas : cartasMonton) {
                System.out.println(cartas);
            }
        }

        return cartasMonton;
    }

    public void mostrarBaraja() {
        System.out.println("Las cartas que están son:");
        if (baraja.isEmpty()) {
            System.out.println("No hay cartas disponibles");
        } else {
            for (int i = posicionCarta; i < baraja.size(); i++) {
                System.out.println(baraja.get(i));
            }
        }
    }
}
