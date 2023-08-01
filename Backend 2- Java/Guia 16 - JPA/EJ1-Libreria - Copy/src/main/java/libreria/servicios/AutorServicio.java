package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Gonzalo Bravo
 */
public class AutorServicio {

    public final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

    public Autor crearAutor(Integer id, String nombre, Boolean alta) {
        Autor autor = new Autor();
        try {
            autor.setId(id);
            autor.setNombre(nombre);
            autor.setAlta(alta);
            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println("Error al crear el usuario.");
            return null;
        }
    }

    public Autor editarAutor(Autor autor) {
        try {
            DAO.editar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println("Error al editar el autor.");
            return null;
        }
    }

    public void eliminarAutor(Autor autor) {
        if (autor != null) {
            try {
                DAO.eliminar(autor);
            } catch (Exception e) {
                System.out.println("Error al tratar de eliminar el autor...");
            }
        } else {
            System.out.println("El autor no existe.");
        }
    }

    public List<Autor> listarTodos() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println("Error al listar autores..");
            return null;
        }
    }

    public Autor buscarPorID(Integer id) {
        try {
            return DAO.buscarPorID(id);
        } catch (Exception e) {
            System.out.println("Error al tratar de buscar el autor.." + id);
            return null;
        }
    }

    public Autor buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error al encontrar el autor " + nombre);
            return null;
        }
    }
}
