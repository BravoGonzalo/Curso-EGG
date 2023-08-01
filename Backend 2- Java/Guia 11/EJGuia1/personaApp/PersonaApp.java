package personaApp;

import personas.DNI;
import personas.Persona;

public class PersonaApp {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Gonzalo");
        persona.setApellido("Bravo");
        DNI dni = new DNI();
        dni.setNumero(43149914);
        dni.setSerie("IDARG");
        persona.setDni(dni);
    }
}
