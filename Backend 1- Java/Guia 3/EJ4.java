import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class EJ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase que comience con A.");
        String frase = input.nextLine();
        if (frase.substring(0, 1).toUpperCase().equals("A")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
        input.close();
    }
}
