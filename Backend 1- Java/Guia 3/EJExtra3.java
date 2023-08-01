import java.util.Scanner;

/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
 Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class EJExtra3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una letra.");
        String letra = input.nextLine().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra: " + letra + " es vocal.");
        } else {
            System.out.println("La letra: " + letra + " NO es una vocal.");
        }
        input.close();
    }
}
