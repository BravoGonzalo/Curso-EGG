package paisesApp;

import service.PaisesService;

public class PaisesApp {
    public static void main(String[] args) {
        PaisesService program = new PaisesService();

        program.crearPaises();
        program.Eliminar();
    }
}
