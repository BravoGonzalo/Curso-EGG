import java.util.Scanner;

/*
 *Escribir un programa que pida dos números enteros por teclado y calcule la
 *suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class EJ1 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero a sumar.");
    int num1 = input.nextInt();
    System.out.println("Ingrese otro numero para sumar.");
    int num2 = input.nextInt();
    int total = num1 + num2;
    System.out.println("El resultado de la suma es de: " + total);
    input.close();
}
}
