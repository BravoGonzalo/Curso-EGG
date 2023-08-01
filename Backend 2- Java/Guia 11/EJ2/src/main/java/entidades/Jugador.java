/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GonzaletoKun
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador" + id;
        this.mojado = false;
    }

    public boolean disparo(Revolver r) {
        System.out.println("El " + nombre + " se apunta con la pistola.");

        if (r.mojar()){
            System.out.println("El " + nombre + " se ha mojado...");
            return mojado = true;
        } else {
            r.siguienteChorro();
            System.out.println("El " + nombre + " sigue en pie :)");
            return mojado = false;

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

}
