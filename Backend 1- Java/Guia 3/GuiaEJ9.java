import java.util.Scanner;

/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de
la sentencia break.
 */
public class GuiaEJ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        do {
         if (num != 0 ){
             System.out.println("Ingrese otro numero");
            num = input.nextInt();
         }
            else{
                    break;
                    }
            
        }while (num != 0);
        System.out.println("Se capturó el numero cero");
        
        input.close();
  
    }
}

