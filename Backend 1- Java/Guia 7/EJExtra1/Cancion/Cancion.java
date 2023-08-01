package Cancion;

public class Cancion {
    public String titulo;
    public String autor;

    public Cancion(){

    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void Cancion2(){
        this.titulo = "Ejemplo";
        this.autor = "Gonzalo Bravo";
    }
}
