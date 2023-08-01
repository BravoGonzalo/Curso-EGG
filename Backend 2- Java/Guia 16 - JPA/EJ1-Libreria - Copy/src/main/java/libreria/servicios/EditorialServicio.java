package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Gonzalo Bravo
 */
public class EditorialServicio {
   public final EditorialDAO DAO;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }
    
    public Editorial crearEditorial(Integer id, String nombre, Boolean alta){
        Editorial editorial = new Editorial();
        try{
            editorial.setId(id);
            editorial.setNombre(nombre);
            editorial.setAlta(alta);
            DAO.guardar(editorial);
            return editorial;
        }catch(Exception e){
            System.out.println("Error al crear la editorial...");
            return null;
        }
    }
    
    public Editorial editarEditorial(Editorial editorial){
        try{
            DAO.editar(editorial);
            return editorial;
        }catch(Exception e){
            System.out.println("Error al editar la editorial.");
            return null;
        }
    }
    
    public void eliminarEditorial(Editorial editorial){
        try{
            DAO.eliminar(editorial);
        }catch(Exception e){
            System.out.println("Error al tratar de eliminar la editorial.");
        }
    }
    
    public List<Editorial> listarTodos(){
        try{
            return DAO.listarTodos();
        }catch(Exception e){
            System.out.println("Error al listar...");
            return null;
        }
    }
    
    public Editorial buscarPorID(Integer id){
        try{
            return DAO.buscarPorID(id);
        }catch(Exception e){
            System.out.println("Error al buscar por id: " + id);
            return null;
        }
    }
    
    public Editorial buscarPorNombre(String nombre){
        try{
            return DAO.buscarPorNombre(nombre);
        }catch(Exception e){
            System.out.println("Error al encontral la editorial con el nombre " + nombre);
            return null;
        }
    }
}
