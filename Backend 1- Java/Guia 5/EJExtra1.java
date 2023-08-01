import java.util.Scanner;

public class EJExtra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int t = input.nextInt();
        int [] vector = new int [t];
        int suma = 0;
        System.out.println("Rellene el vector.");
        for (int i = 0; i < t; i++){
            vector[i] = input.nextInt();
        }

        for (int i = 0; i < t; i++){
            suma += vector[i];
        }

        System.out.println("La suma del vector es: " + suma);
        input.close();
    }
}
