package Main;

import Libro.Libro;

public class Main {
    public static void main(String[] args) {
        Libro llamar = new Libro();

        llamar.cargarLibro();
        llamar.mostrar();
    }
}
