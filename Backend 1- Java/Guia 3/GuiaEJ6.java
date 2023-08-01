import java.util.Scanner;

/*
 Implementar un programa que le pida dos números enteros al usuario
y determine si ambos o alguno de ellos es mayor a 25.
 */
public class GuiaEJ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Ingrese un numero.");
                        int num1 = input.nextInt();
                        System.out.println("Ingrese otro numero.");
                        int num2 = input.nextInt();
                        
                        if (num1 > 25){
                        System.out.println("El numero 1: " + num1 + " es mayor a 25");
    }
                        else if (num1 < 25){
                            System.out.println("El numero 1: " + num1 + " es menor a 25");
                                }
                      if (num2 > 25){
                        System.out.println("El numero 2: " + num2 + " es mayor a 25");
    }
                        else if (num2 < 25){
                            System.out.println("El numero 2: " + num2 + " es menor a 25");
                                }
                                input.close();
    }
}
