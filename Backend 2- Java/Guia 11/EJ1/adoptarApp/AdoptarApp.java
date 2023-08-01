package adoptarApp;

import entidades.Perro;
import entidades.Persona;

public class AdoptarApp {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gonzalo", "Bravo", 22, 12345678);
        Persona persona2 = new Persona("Bautista", "Gorosito", 5, 87654321);

        Perro perro1 = new Perro("Bruno", "Caniche", 4, 0.5);
        Perro perro2 = new Perro("Rafael", "Pitbull", 10, 1);

        persona1.setPerro(perro2);
        persona2.setPerro(perro1);
        
        System.out.println("Persona1: ");
        System.out.println(persona1.toString());
        System.out.println("Persona2: ");
        System.out.println(persona2.toString());
    }
}
