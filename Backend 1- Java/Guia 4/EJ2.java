import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        String nombre = "a";
        int edad = 1;
        nye(nombre,edad);
    }

    public static void nye(String nombre, int edad) {
        Scanner input = new Scanner(System.in);
        String opcion = "si";
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre = input.nextLine();

            System.out.println("Ingrese la edad de la persona.");
            edad = input.nextInt();
            input.nextLine();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            System.out.println("¿Desea continuar?");
            opcion = input.nextLine();
        } while (!opcion.equalsIgnoreCase("no"));
        input.close();
    }
}
