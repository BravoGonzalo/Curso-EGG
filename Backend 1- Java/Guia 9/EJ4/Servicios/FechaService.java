package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Date fechas = new Date(0, 0, 0);

    public static Date fechaNacimiento() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el dia de su nacimiento.");
        int dia = input.nextInt();

        System.out.println("Ingrese un mes de su nacimiento.");
        int mes = input.nextInt();

        System.out.println("Ingrese el año de nacimiento.");
        int año = input.nextInt();

        input.close();

        return new Date(año -1900, mes -1, dia);
    }

    public static Date fechaActual() {
        Date fecha = new Date();
        return fecha;
    }

    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        int fecha1 = fechaNacimiento.getYear();
        int fecha2 = fechaActual.getYear();
        int dif = fecha2 - fecha1;
        return dif;
    }

}
