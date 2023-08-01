package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Gonzalo Bravo
 */
public class FabricanteDAO extends DAO {

    public void ingresarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String sql = "INSERT INTO fabricante (codigo, nombre)" + "VALUES (" + fabricante.getCodigo() + " , ' " + fabricante.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String sql = "UPDATE fabricante SET " + "codigo = " + fabricante.getCodigo() + " WHERE nombre = '" + fabricante.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricantePorNombre(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre del Fabricante a eliminar");
            }

            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
