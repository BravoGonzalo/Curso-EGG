package Main;

import Circunferencia.Circunferencia;

public class Main {
    public static void main(String[] args) {
        Circunferencia nuevo = new Circunferencia();

        nuevo.crearCircunferencia();
        System.out.println("El area de la circunferencia es: " + nuevo.area());
        System.out.println("El perimetro de la circunferencia es: " + nuevo.perimetro());
    }
}
