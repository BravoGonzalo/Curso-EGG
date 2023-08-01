package services;

import java.util.HashMap;
import java.util.Map;

public class TiendaService {
    HashMap<String, Double> productos = new HashMap<>();

    public void ingresarProducto(String nombre, Double precio) {
        System.out.println("------------------------------");
        productos.put(nombre, precio);
        System.out.println("Producto agregado exitosamente.");
        System.out.println("------------------------------");
    }

    public void modificarPrecio(String nombre, Double precio) {
        System.out.println("------------------------------");
        if (productos.containsKey(nombre)) {
            productos.put(nombre, precio);
            System.out.println("El precio se ha reemplazado con exito.");
        } else {
            System.out.println("El nombre del producto no se ha encontrado.");
        }
        System.out.println("------------------------------");
    }

    public void eliminar(String nombre) {
        System.out.println("------------------------------");
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("El producto se eliminó con exitos.");
        } else {
            System.out.println("El nombre del producto ingresado no se ha encontrado.");
        }
        System.out.println("------------------------------");
    }

    public void mostrar() {
        System.out.println("------------------------------");
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Producto: " + key + " Precio: " + value);
        }
        System.out.println("------------------------------");
    }

    @Override
    public String toString() {
        return "TiendaService [productos=" + productos + "]";
    }
}
