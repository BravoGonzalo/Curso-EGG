package Principal;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio service = new PersonaServicio();
        try {
            Persona persona = null;
            service.esMayorDeEdad(persona);
        } catch (NullPointerException e) {
            System.out.println("Error. Persona es nulo." + e.getMessage());
        }
    }
}
