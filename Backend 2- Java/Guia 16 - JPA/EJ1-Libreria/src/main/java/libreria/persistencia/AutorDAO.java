package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Gonzalo Bravo
 */
public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    @Override
    public void editar(Autor autor){
        super.editar(autor);
    }

    @Override
    public void eliminar(Autor autor) {
        super.eliminar(autor);
    }

    public List<Autor> listarTodos() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }

    public Autor buscarPorID(Integer id) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }

    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }
}
