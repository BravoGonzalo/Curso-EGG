import java.util.Scanner;

/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un 
 * número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
public class EJ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int T = input.nextInt();

        int [] V = new int [T];
        int c = 0;

        System.out.println("Ingrese el numero a buscar en el vector.");
        int num = input.nextInt();
        int i;
        
        for (i = 0; i < T; i++){
            V[i]= (int)(Math.random() * 10); 
            System.out.println(" [ " + V[i] + " ] ");
        }

        for (i = 0; i < T; i++){
            if (V[i] == num){
                c ++; 
                 
                System.out.println("el numero ingresado se repitió " + c + " veces. Y estan el vector " + i );
                
            }
            
        }
        
      input.close();
    }
    
}
