package tiendaAPP;

import java.util.Scanner;

import services.TiendaService;

public class TiendaAPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TiendaService tienda = new TiendaService();
        boolean logico = true;
        System.out.println("-------Bienvenido-------");
        System.out.println("---¿Que desea hacer?---");

        while (logico) {
            System.out.println("1-Ingresar productos.");
            System.out.println("2-Modificar su precio.");
            System.out.println("3-Eliminar un producto.");
            System.out.println("4-Mostar los productos que ingresaste anteriormente.");
            System.out.println("5-Salir.");
            int resp = input.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("---Usted ingresará un producto----");
                    System.out.println("Nombre del producto.");
                    String nombre = input.next();
                    System.out.println("¿Que precio tiene?");
                    Double precio = input.nextDouble();
                    tienda.ingresarProducto(nombre, precio);
                    break;
                case 2:
                    System.out.println("---Se modificará el precio del producto---");
                    System.out.println("Ingrese el nombre del producto al cual va a reemplazar.");
                    nombre = input.next();
                    System.out.println("Ingrese el precio por el cual va a reemplazar.");
                    precio = input.nextDouble();
                    tienda.modificarPrecio(nombre, precio);
                    break;
                case 3:
                    System.out.println("---Se eliminará el producto que desee---");
                    System.out.println("Ingrese el nombre del producto a eliminar.");
                    nombre = input.next();
                    tienda.eliminar(nombre);
                    break;
                case 4:
                    System.out.println("---Productos ingresados---");
                    tienda.mostrar();
                    break;
                case 5:
                    System.out.println("saliendo...");
                    logico = false;
                    ;
                    break;
                default:
                    System.out.println("Numero no reconocido.");
                    break;
            }

        }
        input.close();
    }
}
