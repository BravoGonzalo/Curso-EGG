package principal;

import java.util.Scanner;

import entidades.Estudiante;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[8];

        for(int i = 0; i < estudiantes.length; i++){
            System.out.println("Ingrese el nombre del estudiante.");
            String nombre = input.nextLine();
            System.out.println("Ingrese la nota del estudiante antes mencionado...");
            int nota = input.nextInt();
            input.nextLine();
            estudiantes[i] = new Estudiante(nombre, nota);
        }

        int sumaPromedio = 0;
        for(int i = 0; i < estudiantes.length; i++){
            sumaPromedio+= estudiantes[i].getNota();
        }
        int suma = sumaPromedio / estudiantes.length;
        System.out.println("La nota promedio es: " + suma);
        int contador = 0;

        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i].getNota() > suma){
                contador++;
            }
        }
        
        String[] nombresAlumnos = new String[contador];
        contador = 0;
        
        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i].getNota() > suma){
                nombresAlumnos[contador] = estudiantes[i].getNombre();
                contador++;
            }
        }

        for(int i = 0; i < nombresAlumnos.length; i++){
            System.out.println("El alumno " + nombresAlumnos[i] + " tiene una nota mayor al promedio.");
        }
        input.close();
    }
}
