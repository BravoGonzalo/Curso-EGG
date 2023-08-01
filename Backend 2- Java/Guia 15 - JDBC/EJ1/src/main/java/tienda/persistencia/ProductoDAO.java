package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author Gonzalo Bravo
 */
public class ProductoDAO extends DAO {

    public void eliminarProductoPorNombre(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre del Fabricante a eliminar");
            }

            String sql = "DELETE FROM producto WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto listarProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto;";
            consultarBaseDeDatos(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
            }
            desconectarBase();
            return producto;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductoPorNombreYPrecio() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto;";
            consultarBaseDeDatos(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductoPorPrecioIndicado() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE precio BETWEEN 120 AND 202;";
            consultarBaseDeDatos(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portátil%';";
            consultarBaseDeDatos(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto ORDER BY precio asc LIMIT 1;";
            consultarBaseDeDatos(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "INSERT INTO producto (codigo, nombre,precio,codigoFabricante)" + "VALUES (" + producto.getCodigo() + " , ' " + producto.getNombre() + "' , " + producto.getPrecio() + " , " + producto.getCodigoFabricante() + " );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "UPDATE producto SET " + "codigo = " + producto.getCodigo() + " nombre = '" + producto.getNombre() + "' precio = " + producto.getPrecio() + " codigoFabricante = " + producto.getCodigoFabricante() + " WHERE nombre = '" + producto.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
