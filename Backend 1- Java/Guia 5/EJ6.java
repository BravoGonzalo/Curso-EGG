import java.util.Scanner;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
correctos, es decir, están entre el 1 y el 9. */
public class EJ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int referencia = 0;
        int suma = 0;
        boolean magico = true;

        System.out.println("Ingrese 9 numeros entre el 1 y el 9.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; j++) {
                matriz[i][j] = input.nextInt();
                
            }
        }
        for (int i = 0; i < 3; i++) {
            referencia += matriz[0][i];

        }
        do {
            //sumar filas
            for (int i = 1; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    suma += matriz[i][j];
                }
                if (suma != referencia) {
                    System.out.println("El cubo no es magico.");
                    magico = false;
                    break;
                }
            }
            suma = 0;
            //sumar columnas
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    suma += matriz[j][i];
                }
                if(suma != referencia){
                    System.out.println("El cubo no es magico.");
                    magico = false;
                    break;
                }
            }
            //sumo diagonal de izquierda a derecha
            for(int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    if (i == j){
                        suma += matriz[i][j];
                    }
                    if (suma != referencia){
                        System.out.println("El cubo no es magico.");
                        magico = false;
                        break;
                    }
                }
            }
            //sumo diagonal de derecha a izquierda
            for(int i= 0; i < 3; i++){
                for (int j = 0; j < 3; i++){
                    if ((i + j) == 2){
                        suma += matriz[i][j];
                    }
                    if (suma != referencia){
                        System.out.println("El cubo no es magico.");
                        magico = false;
                        break;
                    }
                }
            }
            if (magico){
                System.out.println("El cubo es magico");
            }
            magico = false;
        } while (magico);
        System.out.println("Muchas gracias por hacerme sufrir.");
        input.close();
    }

}
