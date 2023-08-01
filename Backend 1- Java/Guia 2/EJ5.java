import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt(). 
*/
public class EJ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero.");
        double num = input.nextInt();
        System.out.println("El doble es: " + num*2);
        System.out.println("El triple es: " + num*3);
        System.out.println("Y la raiz cuadrada es: " + Math.sqrt(num));
        input.close();
    }
}
