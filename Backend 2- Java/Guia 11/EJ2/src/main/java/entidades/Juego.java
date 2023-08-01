/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author GonzaletoKun
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver r;
    
    public void llenarJuego(int cantJugadores){
        
        if(cantJugadores < 1 && cantJugadores > 6){
            cantJugadores = 6;
        }
        
        this.jugadores = new ArrayList<>(cantJugadores);
        
        for(int i = 0; i < cantJugadores; i++){
            jugadores.add(new Jugador(i));
        }
        
        this.r = new Revolver();
    }
    
    public void ronda(){
       
        for(int i = 0; i < jugadores.size(); i++){
            jugadores.get(i).disparo(r);
        }
        
    }
}
