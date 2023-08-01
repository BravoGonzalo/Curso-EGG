package libreria.principal;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author Gonzalo Bravo
 */
public class EJ1Libreria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AutorServicio a1 = new AutorServicio();
        EditorialServicio e1 = new EditorialServicio();
        LibroServicio l1 = new LibroServicio();
        boolean condi = true;

        while (condi) {
            System.out.println("-------------------");
            System.out.println("|¿Que desea hacer?|");
            System.out.println("|1-Insertar.      |");
            System.out.println("|2-Modificar.     |");
            System.out.println("|3-Eliminar.      |");
            System.out.println("|4-Buscar.        |");
            System.out.println("|5-Mostrar todos. |");
            System.out.println("|6-Salir.         |");
            System.out.println("-------------------");
            int resp = input.nextInt();
            boolean condi2 = true;
            switch (resp) {
                case 1:
                    while (condi2) {
                        System.out.println("¿Que desea insertar?");
                        System.out.println("1-Autor 2-Editorial 3-Libro 4-Salir");
                        int resp2 = input.nextInt();
                        switch (resp2) {
                            case 1:
                                System.out.println("Ingrese el ID.");
                                int idAutor = input.nextInt();
                                input.nextLine();
                                System.out.println("Ahora necesito el nombre del Autor.");
                                String nomAutor = input.nextLine();
                                a1.crearAutor(idAutor, nomAutor, Boolean.FALSE);
                                System.out.println("El autor se ha creado con exito.");
                                break;
                            case 2:
                                System.out.println("Ingrese el ID.");
                                int idEditorial = input.nextInt();
                                input.nextLine();
                                System.out.println("Ahora necesito el nombre de la Editorial.");
                                String nomEditorial = input.nextLine();
                                e1.crearEditorial(idEditorial, nomEditorial, Boolean.FALSE);
                                System.out.println("Editorial creada con exito..");
                                break;
                            case 3:
                                System.out.println("Ingrese el ISBN del Libro");
                                long isbn = input.nextLong();
                                input.nextLine();
                                System.out.println("Necesito el titulo...");
                                String nomLibro = input.nextLine();
                                System.out.println("¿De que año es?");
                                int anio = input.nextInt();
                                System.out.println("¿Cuantos ejemplares tiene?");
                                int ejem = input.nextInt();
                                System.out.println("¿Cuantos prestó?");
                                int ejemPrest = input.nextInt();
                                System.out.println("¿Cuantos les quedaron?");
                                int ejemRest = input.nextInt();
                                System.out.println("Se va a buscar el autor y la editorial para agregarselo al libro...");
                                System.out.println("¿Cual es el nombre del autor?");
                                Autor autor = a1.buscarPorNombre(input.next());
                                System.out.println("Por ultimo, ¿Cual es el nombre de la editorial?");
                                Editorial editorial = e1.buscarPorNombre(input.next());
                                l1.crearLibro(isbn, nomLibro, anio, ejem, ejemPrest, ejemRest, Boolean.FALSE, autor, editorial);
                                System.out.println("Se ha creado el libro con exito.");
                                break;
                            case 4:
                                condi2 = false;
                                break;
                        }
                        condi2 = true;
                    }
                case 2:
                    while (condi2) {
                        System.out.println("¿Que desea modificar?");
                        System.out.println("1-Autor 2-Editorial 3-Libro 4-Salir");
                        int resp3 = input.nextInt();
                        input.nextLine();
                        switch (resp3) {
                            case 1:
                                System.out.println("Se buscará el autor por nombre. Pongalo acontinuacion.");
                                Autor autorModificar = a1.buscarPorNombre(input.next());

                                System.out.println("Ahora el nuevo nombre.");
                                autorModificar.setNombre(input.next());

                                a1.editarAutor(autorModificar);
                                System.out.println("Se ha modificado el autor con exito.");
                                break;
                            case 2:
                                System.out.println("Se buscará la editorial por nombre. Pongalo acontinuacion.");
                                Editorial editorialBuscar = e1.buscarPorNombre(input.next());

                                System.out.println("Ahora el nuevo nombre.");
                                editorialBuscar.setNombre(input.next());
                                e1.editarEditorial(editorialBuscar);
                                System.out.println("Se ha modificado la editorial con exito.");
                                break;
                            case 3:
                                System.out.println("Se buscará el libro por ISBN. Pongalo acontinuacion.");
                                Libro libroNuevo = l1.bucarPorISBN(input.nextLong());
                                System.out.println("Ingrese el nuevo titulo.");
                                libroNuevo.setTitulo(input.next());
                                System.out.println("Ingrese los ejemplares que tiene.");
                                libroNuevo.setEjemplares(input.nextInt());
                                System.out.println("Ingrese los ejemplares prestados.");
                                libroNuevo.setEjemplaresPrestados(input.nextInt());
                                System.out.println("Ingrese los ejemplares que le quedaron");
                                libroNuevo.setEjemplaresRestantes(input.nextInt());
                                l1.editarLibro(libroNuevo);
                                break;
                            case 4:
                                condi2 = false;
                        }
                        condi2 = true;

                    }
                case 3:
                    while (condi2) {
                        System.out.println("¿Que desea eliminar?");
                        System.out.println("1-Autor 2-Editorial 3-Libro 4-Salir");
                        int resp4 = input.nextInt();
                        switch (resp4) {
                            case 1:
                                System.out.println("Se buscará un autor según su id para poder eliminarlo.");
                                System.out.println("Indique el id...");
                                Autor autorBuscar = a1.buscarPorID(input.nextInt());
                                a1.eliminarAutor(autorBuscar);
                                break;
                            case 2:
                                System.out.println("Se buscará una editorial según su id para poder eliminarlo.");
                                System.out.println("Indique el ¿id.");
                                Editorial editorialEliminar = e1.buscarPorID(input.nextInt());
                                e1.eliminarEditorial(editorialEliminar);
                                break;
                            case 3:
                                System.out.println("Se buscará el libro según su isbn para poder eliminarlo.");
                                System.out.println("Indique el isbn.");
                                Libro libroEliminar = l1.bucarPorISBN(input.nextLong());
                                l1.eliminarLibro(libroEliminar);
                                break;
                            case 4:
                                condi2 = false;
                        }
                        condi2 = true;
                    }
                case 4:
                    while (condi2) {
                        System.out.println("¿Que desea buscar?");
                        System.out.println("1-Autor 2-Editorial 3-Libro 4-Salir");
                        int resp2 = input.nextInt();
                        boolean condi3 = true;
                        if (resp2 == 1) {
                            System.out.println("¿Como desea buscar?");
                            System.out.println("Por: 1-ID 2-Nombre 3-Salir");
                            int resp1o2 = input.nextInt();
                            if (resp1o2 == 1) {
                                System.out.println("Ingrese el id a buscar.");
                                int buscarID = input.nextInt();
                                Autor autor = a1.buscarPorID(buscarID);
                                System.out.println(autor.toString());
                                break;
                            }
                            if (resp1o2 == 2) {
                                System.out.println("Ingrese el nombre a buscar.");
                                String buscarNombre = input.next();
                                Autor autor = a1.buscarPorNombre(buscarNombre);
                                System.out.println(autor.toString());
                                break;
                            }
                            if (resp1o2 == 3) {
                                condi3 = false;
                            }
                            condi3 = true;
                        }
                        if (resp2 == 2) {
                            System.out.println("¿Como desea buscar?");
                            System.out.println("Por: 1-ID 2-Nombre 3-Salir");
                            int resp1o2 = input.nextInt();
                            if (resp1o2 == 1) {
                                System.out.println("Ingrese el id a buscar.");
                                int buscarID = input.nextInt();
                                Editorial edi = e1.buscarPorID(buscarID);
                                System.out.println(edi.toString());
                                break;
                            }
                            if (resp1o2 == 2) {
                                System.out.println("Ingrese el nombre a buscar.");
                                String buscarNombre = input.next();
                                Editorial edi = e1.buscarPorNombre(buscarNombre);
                                System.out.println(edi.toString());
                                break;
                            }
                            if (resp1o2 == 3) {
                                condi3 = false;
                            }
                            condi3 = true;
                        }
                        if (resp2 == 3) {
                            System.out.println("¿Como desea buscar?");
                            System.out.println("Por 1-ISBN 2-Titulo 3-Autor 4-Editorial 5-Salir");
                            int responder = input.nextInt();
                            if (responder == 1) {
                                System.out.println("Indique el ISBN");
                                Libro libro = l1.bucarPorISBN(input.nextLong());
                                System.out.println(libro.toString());
                            }
                            if (responder == 2) {
                                System.out.println("Indique el Titulo");
                                Libro libro = l1.buscarPorTitulo(input.next());
                                System.out.println(libro.toString());
                            }
                            if (responder == 3) {
                                System.out.println("Indique el nombre del autor");
                                List<Libro> libros = l1.buscarPorAutor(input.next());
                                for (Libro libro : libros) {
                                    System.out.println(libro.toString());
                                }
                            }
                            if (responder == 4) {
                                System.out.println("Indique el nombre de la Editorial.");
                                List<Libro> libros = l1.buscarPorEditorial(input.next());
                                for (Libro libro : libros) {
                                    System.out.println(libro.toString());
                                }
                            }
                            if (responder == 5) {
                                condi3 = false;
                            }
                            condi3 = true;
                        }
                        if (resp2 == 4) {
                            condi2 = false;
                        }
                        condi2 = true;
                    }
                case 5:
                    while (condi2) {
                        System.out.println("¿Que desea mostrar?");
                        System.out.println("1-Autores 2-Editoriales 3-Libros 4-Salir");
                        int resp5 = input.nextInt();
                        if (resp5 == 1) {
                            List<Autor> autor = a1.listarTodos();
                            for (Autor autorr : autor) {
                                System.out.println(autorr.toString());
                            }
                            break;
                        }
                        if (resp5 == 2) {
                            List<Editorial> edi = e1.listarTodos();
                            for (Editorial edii : edi) {
                                System.out.println(edii.toString());
                            }
                            break;
                        }
                        if (resp5 == 3) {
                            List<Libro> libro = l1.listarTodos();
                            for (Libro libroo : libro) {
                                System.out.println(libroo.toString());
                            }
                            break;
                        }
                        if (resp5 == 4) {
                            condi2 = false;
                        }
                        condi2 = true;
                    }
            }
        }
    }
}
