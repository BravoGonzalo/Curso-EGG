/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GonzaletoKun
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;
    
    public Animal(String nombre, String alimento, Integer edad, String raza){
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void Alimentarse(){
        System.out.println(nombre + " se alimenta de: " + alimento);
    }
}
