import java.util.Scanner;
/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
 si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class EJExtra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los minutos a convertir.");
        int minutos = input.nextInt();
        System.out.println(minutos + " son " + minutos/1440 + " dias");
        System.out.println(minutos + " son " + minutos/60 + " horas.");
        input.close();
    }
}
