package Principal;

import Servicios.NIFService;

public class Main {
    public static void main(String[] args) {
        NIFService input = new NIFService();

        input.crearNif();
        input.mostrar();
    }
}
