package PersonaService;

import Persona.Persona;

public class PersonaService {
    
    public Persona llenar(String nombre, String apellido, int edad){
        nombre = "Gonzalo";
        System.out.println("El nombre es: " + nombre);

        apellido = "Bravo";
        System.out.println("El apellido es: " + apellido);

        edad = 22;
        System.out.println("La edad que tiene: " + edad);

        return new Persona();
    }
}
