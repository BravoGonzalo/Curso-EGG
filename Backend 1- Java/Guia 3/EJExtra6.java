import java.util.Scanner;

/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
 y el promedio de estaturas en general.
 */
public class EJExtra6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas a medir.");
        int personas = input.nextInt();
        
        double total = 0;
        double bajos = 0;
        int contadorbajos = 0;
        
        for (int i = 1; i<= personas; i++){
            System.out.println("Ingrese la altura de la persona " + i );
            double altura = input.nextDouble();

            total+= altura;
            if (altura < 1.60){
                bajos += altura;
                contadorbajos++;
            }
        }
        double promedioG = total/ personas;
        double promedioB = 0;
        if (contadorbajos>0){
            promedioB = bajos / contadorbajos;
        }
        System.out.println("El promedio de alturas en general es: " + promedioG + "mts.");
        if (bajos > 0){
            System.out.println("El promedio de alturas por debajo de 1.60 mts. Es" + promedioB + " mts.");
        
        }
        input.close();
    }
}
