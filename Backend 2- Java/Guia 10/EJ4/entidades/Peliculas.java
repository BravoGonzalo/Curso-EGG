package entidades;

import java.util.Comparator;

public class Peliculas {
    private String titulo;
    private String director;
    private Double duracion;

    public Peliculas(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Peliculas() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas Ingresadas: Titulo= " + titulo + ", Director=" + director + " Duracion= " + duracion + " hs";
    }

    public static Comparator<Peliculas> mayorAmenor = new Comparator<Peliculas>() {

        public int compare(Peliculas pelicula1, Peliculas pelicula2) {
            return Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion());
        }
    };
    public static Comparator<Peliculas> menorAMayor = new Comparator<Peliculas>() {

        public int compare(Peliculas pelicula1, Peliculas pelicula2) {
            return Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion());
        }
    };
    public static Comparator<Peliculas> tituloAlfa = new Comparator<Peliculas>() {

        public int compare(Peliculas pelicula1, Peliculas pelicula2) {
            return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
        }
    };
    public static Comparator<Peliculas> directorAlfa = new Comparator<Peliculas>() {

        public int compare(Peliculas pelicula1, Peliculas pelicula2) {
            return pelicula1.getDirector().compareTo(pelicula2.getDirector());
        }
    };
}
