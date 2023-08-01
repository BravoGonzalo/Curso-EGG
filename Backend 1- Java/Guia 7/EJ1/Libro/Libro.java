package Libro;

import java.util.Scanner;

public class Libro {
    public long ISBN;
    public String Titulo;
    public String Autor;
    public int NumerodePagina;

    public Libro(){

    }
    
    public Libro(long ISBN, String Titulo, String Autor, int NumerodePagina){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumerodePagina = NumerodePagina;
    }

    public void cargarLibro(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro.");
        this.Titulo = input.nextLine();

        System.out.println("Ingrese el autor del libro.");
        this.Autor = input.nextLine();

        System.out.println("Ingrese el ISBN.");
        this.ISBN = input.nextLong();

        System.out.println("Ingrese el numero de paginas.");
        this.NumerodePagina = input.nextInt();

        input.close();
    }

    public void mostrar(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Numero de paginas: " + NumerodePagina);
    }
}
