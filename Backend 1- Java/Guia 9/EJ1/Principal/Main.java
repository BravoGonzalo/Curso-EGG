package Principal;

import java.util.Scanner;

import Servicios.CadenaServicio;

public class Main {
    public static void main(String[] args) {
        CadenaServicio mostrar = new CadenaServicio();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una frase para las otras consignas.");
        String frase = input.nextLine();

        System.out.println("La frase predeterminada es ''casa blanca'''.");
        mostrar.mostrarVocales();

        System.out.println("La palabra invertida es: " + mostrar.invertirFrase());

        System.out.println("Ingrese un caracter");
        mostrar.vecesRepetido(input.nextLine());

        System.out.println("Ingrese una frase para comprar");
        mostrar.compararLongitud(frase);
        
        mostrar.unirFrases(frase);

        System.out.println("Ingrese el caracter que desee reemplazar la ''a'' ");
        mostrar.reemplazar(input.nextLine());

        input.close();
    }
}
