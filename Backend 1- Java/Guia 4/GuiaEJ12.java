import java.util.Scanner;

/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer 
número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
 */
public class GuiaEJ12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero.");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();
        EsMultiplo(num1, num2);
        input.close();
    }
    public static void EsMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("El numero "+num1+" es multiplo de "+num2);
        } else{
            System.out.println("El numero "+num1+" es NO es multiplo de "+num2);
        }
    }
}
