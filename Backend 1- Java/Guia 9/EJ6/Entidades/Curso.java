package Entidades;

import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {

    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno,
            int precioPorHora, String[] alumnos) {

        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public void setnombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setcantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setcantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setturno(String turno) {
        this.turno = turno;
    }

    public void setprecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setalumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getnombreCurso() {
        return nombreCurso;
    }

    public int getcantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getcantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getturno() {
        return turno;
    }

    public int getprecioPorHora() {
        return precioPorHora;
    }

    public String[] getalumnos() {
        return alumnos;
    }

    ///////////////////////////////////////////////////////////////////////////////

    
    public String[] cargarAlumnos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digame el nombre de sus alumnos.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el alumno.");
            alumnos[i] = input.nextLine();
        }
        return alumnos;
    }

}