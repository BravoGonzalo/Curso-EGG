package alumnosapp;

import servicios.AlumnoService;

public class AlumnoApp {
    public static void main(String[] args) {
        AlumnoService program = new AlumnoService();

        program.crearAlumnos();
        program.notaFinal();
    }
}
