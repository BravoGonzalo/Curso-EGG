package Principal;

import Entidades.Persona;
import Servicio.PersonaService;

public class Main {
    public static void main(String[] args) {
        PersonaService p1 = new PersonaService();
        PersonaService p2 = new PersonaService();

        System.out.println("------Persona1------");
        Persona persona1 = p1.crearPersona();
        System.out.println("Su edad es: " + p1.calcularEdad());

        System.out.println("----Persona2-----");
        Persona persona2 = p1.crearPersona();
        System.out.println("La persona1 es menor a la persona 2? " + p2.menorQue(persona1, persona2));

        p1.mostrarPersona(persona1, persona2);
    }

}
