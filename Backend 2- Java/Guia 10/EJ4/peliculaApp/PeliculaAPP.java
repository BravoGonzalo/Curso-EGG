package peliculaApp;

import servicios.PeliculasService;

public class PeliculaAPP {
    public static void main(String[] args) {
        PeliculasService program = new PeliculasService();

        program.datosPelicula();
        System.out.println("Se muestran las peliculas ingresadas.");
        program.mostrarPelicula();
        System.out.println("---------------------------");
        System.out.println("Se muentran las que duran mas de 1hr..");
        program.duracionHS();
        System.out.println("---------------------------");
        System.out.println("Ordenado de mayor a menor por HS.");
        program.order1();
        System.out.println("---------------------------");
        System.out.println("Se Ordenado de menor a mayor por HS.");
        program.order2();
        System.out.println("---------------------------");
        System.out.println("Se ordenan por titulo alfabeticamente.");
        program.orderAlfa();
        System.out.println("---------------------------");
        System.out.println("Se ordena por director alfabeticamente.");
        program.orderAlfaDirector();

    }
}
