package Principal;

import java.util.Date;

import Servicios.FechaService;

public class Main {
    public static void main(String[] args) {
        Date fechaNacimiento = FechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        Date fechaActual = FechaService.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);
        FechaService input = new FechaService();

        System.out.println("La diferencia de años que hay son: " + input.diferencia(fechaNacimiento, fechaActual));
    }
}
