import java.util.Scanner;

/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class GuiaEJ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Ingrese una nota.");
        int nota = input.nextInt();
       while (nota > 10) {
        System.out.println("Ingrese nuevamente una nota.");
       nota = input.nextInt();
       }
       input.close();
    }
}
