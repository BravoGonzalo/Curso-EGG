import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class EJ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = input.nextLine();
        System.out.println("La frase que usted puso en mayusculas es :" + frase.toUpperCase());
        System.out.print("Y en minusculas :" + frase.toLowerCase());
        input.close();
    }
}
