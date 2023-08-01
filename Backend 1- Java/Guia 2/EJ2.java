import java.util.Scanner;

/*
 Escribir un programa que pida tu nombre, lo guarde en una variable
 y lo muestre por pantalla.
 */
public class EJ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre.");
        String nombre = input.nextLine();
        System.out.println("Te llamas " + nombre);
        input.close();
    }
}
