package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Gonzalo Bravo
 */
public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
    
    public void editar(Editorial editorial){
        super.editar(editorial);
    }

    public void eliminar(Integer id) {
        Editorial editorial = buscarPorID(id);
        super.eliminar(editorial);
    }

    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editorial = em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar();
        return editorial;
    }

    public Editorial buscarPorID(Integer id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id = :id").setParameter("id", id).getSingleResult();
        desconectar();
        return editorial;
    }

    public Editorial buscarPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
}
