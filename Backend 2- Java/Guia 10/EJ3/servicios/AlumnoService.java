package servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entidades.Alumno;

public class AlumnoService {
    Scanner input = new Scanner(System.in);
    // "lista" almacena los alumnos
    ArrayList<Alumno> lista = new ArrayList<>();

    // Crea el alumno
    public void crearAlumnos() {
        do {
            System.out.println("Ingrese el nombre del alumno.");
            String nombre = input.nextLine().toLowerCase();

            ArrayList<Integer> nota = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota del alumno " + i + " ");
                int notas = input.nextInt();
                input.nextLine();
                nota.add(notas);
            }
            Alumno alumno = new Alumno(nombre, nota);
            lista.add(alumno);

            System.out.println("¿Desea seguir agregando alumnos?");
            String respuesta = input.nextLine().toLowerCase(); 
            if (respuesta.equals("no")) {
                break;
            }

        } while (true);

    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que quiere saber su nota final...");
        String aBuscar = input.nextLine();
        Iterator<Alumno> buscar = lista.iterator();

        while (buscar.hasNext()) {
            Alumno alumno = buscar.next();
            if (alumno.getNombre().equalsIgnoreCase(aBuscar)) {
                double promedio = alumno.notaFinal();
                System.out.println("La nota de " + alumno.getNombre() + " es " + promedio);
            }
        }

    }
}
