package Principal;

import java.util.Scanner;

import Raices.Raices;
import RaicesServicios.RaicesServicios;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = input.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double b = input.nextDouble();
        System.out.print("Introduce el valor de c: ");
        double c = input.nextDouble();

        Raices ver = new Raices(a, b, c);

        RaicesServicios servicio = new RaicesServicios();

        double discriminante = servicio.getDiscriminante(ver);
        System.out.println("El discriminante es: " + discriminante);

        if (servicio.tieneRaices(ver)) {
            servicio.obtenerRaices(ver);
        } else if (servicio.tieneRaiz(ver)) {
            servicio.obtenerRaiz(ver);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        input.close();
    }
}
