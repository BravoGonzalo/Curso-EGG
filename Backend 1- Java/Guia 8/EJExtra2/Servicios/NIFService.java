package Servicios;

import java.util.Scanner;

import NIF.NIF;

public class NIFService {
    Scanner input = new Scanner(System.in);

    NIF iff = new NIF();

    public void crearNif() {

        System.out.println("Ingrese el DNI.");
        iff.setNumeroDNI(input.nextLong());

        iff.mostrarletra();
    }

    public void mostrar() {
        System.out.println(iff.getNumeroDNI() + "-" + iff.mostrarletra());
    }

}
