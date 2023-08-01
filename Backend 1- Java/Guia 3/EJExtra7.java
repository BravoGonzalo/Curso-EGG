import java.util.Scanner;

/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
 El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
 */
public class EJExtra7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de elementos: ");
        int n = input.nextInt();

        double suma = 0;
        double maximo = 0;
        double minimo = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = input.nextDouble();

            suma += numero;
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        double promedio = suma / n;

        System.out.println("El valor maximo es: " + maximo);
        System.out.println("El valor minimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);
        input.close();
    }
}
