package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Gonzalo Bravo
 */
public class LibroServicio {
    public final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }
    public Libro crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        
        try{
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(alta);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            DAO.guardar(libro);
            return libro;
        }catch(Exception e){
            System.out.println("Error al intentar crear el libro");
            return null;
        }
    }
    
    public Libro editarLibro(Libro libro){
        try{
            DAO.editar(libro);
            return libro;
        }catch(Exception e){
            System.out.println("Error al editar el libro.");
            return null;
        }
    }
    
    public void eliminarLibro(Libro libro){
        try{
            DAO.eliminar(libro);
        }catch(Exception e){
            System.out.println("Error al eliminar el libro...");
        }
    }
    
    public List<Libro> listarTodos(){
        try{
            return DAO.listarTodos();
        }catch(Exception e){
            System.out.println("Error al listar todos los libros.");
            return null;
        }
    }
    
    public Libro bucarPorISBN(Long isbn){
        try{
            return DAO.buscarPorISBN(isbn);
        }catch(Exception e){
            System.out.println("Error al buscar libro por isbn " + isbn);
            return null;
        }
    }
    
    public Libro buscarPorTitulo(String titulo){
        try{
            return DAO.buscarPorTitulo(titulo);
        }catch(Exception e){
            System.out.println("Error al buscar libro " + titulo);
            return null;
        }
    }
    
    public List<Libro> buscarPorAutor(String nombre){
        try{
            return DAO.buscarPorAutor(nombre);
        }catch(Exception e){
            System.out.println("Error, no existe el autor " + nombre);
            return null;
        }
    }
    
    public List<Libro> buscarPorEditorial(String nombre){
        try{
            return DAO.buscarPorEditorial(nombre);
        }catch(Exception e){
            System.out.println("Error, no se encontró la editorial " + nombre);
            return null;
        }
    }
}
