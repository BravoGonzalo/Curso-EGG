package EntidadesService;

import java.util.Scanner;

import Entidades.CuentaBancaria;

public class CuentaBancariaServicio {
    CuentaBancaria c1 = new CuentaBancaria();
    Scanner input = new Scanner(System.in);

    public CuentaBancaria CrearCuenta() {
        System.out.println("Ingrese el numero de cuenta.");
        int numeroCuenta= input.nextInt();

        System.out.println("Ingrese el DNI del cliente.");
        long dniCliente = input.nextLong();

        System.out.println("Ingrese el saldo actual.");
        double saldoActual = input.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(double ingresar) {
        System.out.println("¿Cuanto quieres ingresar?");
        ingresar = input.nextDouble();
        c1.setsaldoActual(c1.getsaldoActual() + ingresar);
        System.out.println("Ahora tiene: " + c1.getsaldoActual());
    }

    public void retirar() {
        System.out.println("¿Cuanto quieres retirar?");
        double ret = input.nextDouble();
        if (ret > c1.getsaldoActual()) {
            ret = c1.getsaldoActual();
            c1.setsaldoActual(0);
        } else {
            c1.setsaldoActual(c1.getsaldoActual() - ret);
        }
        
    }

    public void extraccionRapida() {
       double M = c1.getsaldoActual() * 0.2;
        System.out.println("Solo puedes retirar el 20%.");
        
        System.out.println("¿Cuanto quieres retirar?");
        double reti = input.nextDouble();
        
        if (reti <= M){
            retirar();
        } else{
            System.out.println("No puedes retirar tanto...");
        }
    }

    public double consultarSaldo() {
        return c1.getsaldoActual();
    }

    public void consultarDatos() {
        System.out.println("El numero de cuenta es: " + c1.numeroCuenta);
        System.out.println("El dni de la cuenta es: " + c1.dniCliente);
        System.out.println("el saldo actual es: " + c1.getsaldoActual());
    }
}
