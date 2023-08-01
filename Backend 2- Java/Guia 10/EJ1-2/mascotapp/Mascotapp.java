package mascotapp;

import java.util.Iterator;
import java.util.Scanner;

import servicios.MascotaService;

public class Mascotapp {
    public static void main(String[] args) {
        MascotaService mascota = new MascotaService();
        Scanner input = new Scanner(System.in);

        while (true) {
            mascota.crearPerro();
            System.out.println("¿Quiere agregar otro perro?-(Ponga salir si quiere salir del bucle)");
            String respuesta = input.nextLine().toLowerCase();
            if (respuesta.equals("salir")) {
                break;
            }
        }
        mascota.mostrarPerros();

        System.out.println("Ingrese el perro que quiere eliminar...");
        String pEliminar = input.next();
        Iterator buscar = mascota.perros.iterator();
        boolean encontrar = false;
        while (buscar.hasNext()) {
            if (buscar.next().equals(pEliminar)) {
                buscar.remove();
                mascota.mostrarPerros();
                encontrar = true;
            }
        }
        if(encontrar){
            System.out.println("Se ha elimado el perro seleccionado.");
        }else{
            System.out.println("No se ha encontrado el perro seleccionado.");
            mascota.mostrarPerros();
        }
        input.close();
    }
}
