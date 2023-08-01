package Principal;


import PersonaService.PersonaService;

public class MetodoMain {
    public static void main(String[] args) {
        PersonaService ver = new PersonaService();
        
        ver.llenar("Gonzalo", "Bravo", 22);
    }
}
