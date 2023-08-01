package Servicios;

import java.util.Scanner;

import Entidades.Persona;

public class PersonaServicio {
    Persona ped = new Persona();
    Scanner input = new Scanner(System.in);
    public Persona persona;

    public boolean esMayorDeEdad(Persona ped) {
        return ped.getedad() <= 18;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona.");
        ped.setnombre(input.nextLine());

        System.out.println("Ingrese la edad.");
        ped.setedad(input.nextInt());

        System.out.println("Ingrese el sexo. (M) (F) (O)");
        ped.setsexo(input.nextLine());
        while (ped.getsexo() != "M" || ped.getsexo() != "F" || ped.getsexo() != "O") {
            System.out.println("El caracter ingresado no es valido. Vuelva a intentarlo");
        }

        System.out.println("Ingrese el peso.");
        ped.setpeso(input.nextDouble());

        System.out.println("Ingrese la altura.");
        ped.setaltura(input.nextDouble());
        this.persona = ped;
    }

    public int calcularIMC() {
        double ideal = ped.getpeso() / (Math.pow(ped.getaltura(), 2));
        if (ideal > 20) {
            System.out.println("¡Usted está por debajo del peso ideal!");
            return -1;
        } else if (ideal >= 20 || ideal <= 25) {
            System.out.println("¡Usted esta en el peso ideal!");
            return 0;
        } else {
            System.out.println("Usted tiene sobrepeso :C");
            return 1;
        }
    }

    public void calcularPorcentajes(Persona[] personas) {
        int porDebajo = 0;
        int enPesoIdeal = 0;
        int porEncima = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        for (int i = 0; i < personas.length; i++) {
            persona = personas[i];
            int resultadoIMC = calcularIMC();
            switch (resultadoIMC) {
                case -1:
                    porDebajo++;
                    break;
                case 0:
                    enPesoIdeal++;
                    break;
                case 1:
                    porEncima++;
                    break;
            }

            if (esMayorDeEdad(persona)) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        double porcentajeDebajo = (double) porDebajo / personas.length * 100;
        double porcentajePesoIdeal = (double) enPesoIdeal / personas.length * 100;
        double porcentajeEncima = (double) porEncima / personas.length * 100;
        double porcentajeMayores = (double) mayoresDeEdad / personas.length * 100;
        double porcentajeMenores = (double) menoresDeEdad / personas.length * 100;
    }
}