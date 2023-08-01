package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Gonzalo Bravo
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }
    
    
    public void editar(Libro libro){
        super.editar(libro);
    }

    public void eliminar(Long isbn) {
        Libro libro = buscarPorISBN(isbn);
        super.eliminar(libro);
    }

    public List<Libro> listarTodos() {
        conectar();
        List<Libro> libro = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libro;
    }

    public Libro buscarPorISBN(Long isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> buscarPorAutor(String nombre) {
        conectar();
        List<Libro> libro = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libro;
    }

    public List<Libro> buscarPorEditorial(String nombre) {
        conectar();
        List<Libro> libro = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libro;
    }
}
