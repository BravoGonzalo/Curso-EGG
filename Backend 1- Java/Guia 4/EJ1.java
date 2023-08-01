import java.util.Scanner;

/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
 */
public class EJ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero.");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero.");
        int num2 = input.nextInt();
        System.out.println("|¿Que quieres?|");
        System.out.println("|1-sumar      |");
        System.out.println("|2-restar     |");
        System.out.println("|3-multiplicar|");
        System.out.println("|4-dividir    |");
        int resp = input.nextInt();
        switch (resp){
            case 1:
            System.out.println("El resultado de la suma es: " + sumar(num1, num2));
            break;
            case 2:
            System.out.println("El resultado de la resta es: " + restar(num1, num2));
            break;
            case 3:
            System.out.println("El resultado de la multiplicacion es: " + multiplicar(num1, num2));
            break;
            case 4:
            System.out.println("El resultado de la divicion es: " + dividir(num1, num2));
            break;
        }
        input.close();
    }
    public static int sumar(int num1, int num2){
        int suma= num1 + num2;
        return(suma);
    }
    public static int restar(int num1, int num2){
        int resta= num1 - num2;
        return(resta);
    }
    public static int multiplicar(int num1, int num2){
        int multi= num1 * num2;
        return(multi);
    }
    public static int dividir(int num1, int num2){
        int divi= num1 / num2;
        return(divi);
    }
}
