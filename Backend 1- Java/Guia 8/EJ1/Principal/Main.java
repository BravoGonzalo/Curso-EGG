package Principal;

import java.util.Scanner;

import EntidadesService.CuentaBancariaServicio;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CuentaBancariaServicio ver = new CuentaBancariaServicio();

        int respuesta;
        System.out.println("-------Crea tu cuenta-------");

        ver.CrearCuenta();

        System.out.println("¿Que desea hacer?");
        System.out.println("1- Ingresar dinero.");
        System.out.println("2- Retirar dinero.");
        System.out.println("3- Extraccion rapida.");
        System.out.println("4- Consultar saldo.");
        System.out.println("5- Consultar datos.");
        System.out.println("6- Salir.");

        respuesta = input.nextInt();

        do {
            switch (respuesta) {
                case 1:
                    ver.ingresar(respuesta);
                    
                case 2:
                    ver.retirar();
                    
                case 3:
                    ver.extraccionRapida();
                    
                case 4:
                    ver.consultarSaldo();
                    
                case 5:
                    ver.consultarDatos();
                    
                case 6:
                break;
            }
        } while (respuesta == 6);
        input.close();
    }
}
