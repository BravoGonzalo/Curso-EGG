import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
public class EJ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los Grados Centigrados.");
        double centigrados = input.nextInt();
        double F = 32 + (9 * centigrados / 5);
        System.out.println("Los grados convertidos a F, son :" + F);
        input.close();
    }
}
