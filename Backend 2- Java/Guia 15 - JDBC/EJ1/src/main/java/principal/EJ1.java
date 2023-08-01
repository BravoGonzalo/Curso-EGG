package principal;

import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Gonzalo Bravo
 */
public class EJ1 {

    public static void main(String[] args) throws Exception {
        ProductoDAO p = new ProductoDAO();
        p.listarProductos().toString();
    }
}