import java.util.Scanner;

public class EJExtra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector 1");
        int num = input.nextInt();
        System.out.println("Ingrese el tamaño del vector 2.");
        int num2 = input.nextInt();

        int [] v = new int [num];
        int [] v2 = new int [num2];
        for (int i = 0; i < num; i++){
            v[i] = input.nextInt();
        }
        for (int i = 0; i < num2; i++){
            v2[i] = input.nextInt();
        }
        input.close();
    }
}
