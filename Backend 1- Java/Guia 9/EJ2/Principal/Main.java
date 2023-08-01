package Principal;

import Servicios.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {
        ParDeNumerosService mostrar = new ParDeNumerosService();

        mostrar.mostrarValores();
        System.out.println("el mayor es: " + mostrar.devolverMayor());
        System.out.println("La potencia es: " + mostrar.calcularPotencia());
        System.out.println("La raiz del menor es: " + mostrar.calculaRaiz());
    }
}
