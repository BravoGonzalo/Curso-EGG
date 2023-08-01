package Servicio;

import java.util.Date;
import java.util.Scanner;

import Entidades.Persona;

public class PersonaService {
    Persona p1 = new Persona();
    Scanner input = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("¿Podria decirme su nombre?");
        String nombre = input.nextLine();
        System.out.println("Ingrese el dia de su nacimiento.");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes de su nacimiento.");
        int mes = input.nextInt();
        System.out.println("Ingrese el año de su nacimiento.");
        int año = input.nextInt();

        Date fecha = new Date(año - 1900, mes - 1, dia);
        p1.setFechaDeNacimiento(fecha);

        return new Persona(nombre, fecha);
    }

    public int calcularEdad() {
        Date fechaDeNacimiento = p1.getFechaDeNacimiento();
        Date actual = new Date();
        int años = actual.getYear() - fechaDeNacimiento.getYear();
        return años;
    }

    public boolean menorQue(Persona p1, Persona p2) {
        Date fechaDeNacimiento1 = p1.getFechaDeNacimiento();
        Date fechaDeNacimiento2 = p2.getFechaDeNacimiento();

        if (fechaDeNacimiento1 == null || fechaDeNacimiento2 == null) {
            System.out.println("Una de las fechas de nacimiento es nula.");
            return false; 
        }

        int año1 = fechaDeNacimiento1.getYear();
        int año2 = fechaDeNacimiento2.getYear();

        if ( año1 < año2){
            return true;
        }else {
            return false;
        }
    }

    public void mostrarPersona(Persona p1, Persona p2){
        System.out.println("Que persona quiere mostrar? 1 o 2?");
        int respuesta = input.nextInt();

        switch(respuesta){
            case 1: 
            System.out.println(p1);
            case 2:
            System.out.println(p2);
        }
    }
}