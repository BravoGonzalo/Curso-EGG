package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entidades.Peliculas;

public class PeliculasService {
    Scanner input = new Scanner(System.in);
    ArrayList<Peliculas> peli = new ArrayList<>();

    public void datosPelicula() {
        do {
            System.out.println("¿Cual es el nombre de la pelicula?");
            String titulo = input.nextLine();
            System.out.println("¿Quien es el director?");
            String director = input.nextLine();
            System.out.println("¿Cuanto dura la pelicula?");
            Double duracion = input.nextDouble();
            input.nextLine();
            //////////////////////////////////////
            Peliculas pelicula = new Peliculas(titulo, director, duracion);
            peli.add(pelicula);
            //////////////////////////////////////
            System.out.println("¿Desea crear otra pelicula?");
            String respuesta = input.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                break;
            }
        } while (true);

    }

    public void mostrarPelicula() {
        for (Peliculas mostrar : peli) {
            System.out.println(mostrar);
        }
    }

    public void duracionHS() {
        for (Peliculas mostrar : peli) {
            if (mostrar.getDuracion() > 1) {
                System.out.println("Titulo= " + mostrar.getTitulo() + " Director= " + mostrar.getDirector()
                        + " Duracion= " + mostrar.getDuracion());
            }
        }
    }

    public void order1(){
        Collections.sort(peli, Peliculas.mayorAmenor);
        for(Peliculas mostrar : peli){
            System.out.println(mostrar);
        }
    }

    public void order2(){
        Collections.sort(peli, Peliculas.menorAMayor);
        for(Peliculas mostrar : peli){
            System.out.println(mostrar);
        }
    }

    public void orderAlfa(){
        Collections.sort(peli, Peliculas.tituloAlfa);
        for(Peliculas mostrar : peli){
            System.out.println(mostrar);
        }
    }
    
    public void orderAlfaDirector(){
        Collections.sort(peli, Peliculas.directorAlfa);
        for(Peliculas mostrar : peli){
            System.out.println(mostrar);
        }
    }

}
