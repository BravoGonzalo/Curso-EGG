package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    Scanner input = new Scanner(System.in);
    Curso cc = new Curso();

    public Curso crearCurso() {
        System.out.println("¿Cual es el nombre del curso?.");
        String nombreCurso = input.nextLine();
        System.out.println("¿Cuantas horas por dia hace?");
        int cantidadHorasPorDia = input.nextInt();
        System.out.println("¿Cuantos dias por semana trabaja?");
        int cantidadDiasPorSemana = input.nextInt();
        System.out.println("¿Que turno hace?");
        String turno = input.nextLine();
        System.out.println("¿Cuanto cobra por hora?");
        int precioPorHora = input.nextInt();
        
        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, cc.cargarAlumnos());
    }

    public void calcularGananciaSemana(){
        Curso curso = crearCurso();
        int Semanal = curso.getcantidadHorasPorDia() * curso.getprecioPorHora() * 5 * curso.getcantidadDiasPorSemana();
        System.out.println("La ganancia semanal es de: $" + Semanal);
    }
}
