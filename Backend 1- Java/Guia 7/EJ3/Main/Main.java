package Main;

import java.util.Scanner;

import Operacion.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion input = new Operacion();
        Scanner entrada = new Scanner(System.in);
        
        input.crearOperacion();
        System.out.println("----------------");
        System.out.println("¿Que desea hacer?");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        int respuesta = entrada.nextInt();
        do {
            switch (respuesta) {
                case 1:
                System.out.println("La suma es: " + input.sumar());
                    break;
                case 2:
                System.out.println("La resta es: " + input.restar());
                    break;
                case 3:
                    input.multiplicar();
                    break;
                case 4:
                    input.dividir();
                    break;
            }
        } while (respuesta != 5);
        entrada.close();

    }
}
