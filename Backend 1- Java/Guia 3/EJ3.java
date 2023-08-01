import java.util.Scanner;

/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class EJ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 de largo.");
        String frase = input.nextLine();
        if (frase.length() == 8){
            System.out.println("Correcto.");
    }else{
            System.out.println("Incorrecto.");
    }
    input.close();
    }
}
