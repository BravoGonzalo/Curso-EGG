import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero.");
        int num = input.nextInt();
        numprimo(num);
        input.close();
    }
    public static boolean numprimo(int num){

        if (num == 0 ) {
            System.out.println("false");
            return false;
        }
        
        
        if (num == 1){
            System.out.println("True");
            return true;
        }
        for (int i = 2; i < num; i++){
            if (num/i == 0){
                System.out.println("El numero " + num + " NO es primo.");
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
