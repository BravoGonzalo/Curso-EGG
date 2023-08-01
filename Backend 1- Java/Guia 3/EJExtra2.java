import java.util.Scanner;

/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
 A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el 
 valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores 
 finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class EJExtra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
        System.out.println("C = "+ C);
        System.out.println("D = "+ D);
        
        System.out.println("");
        System.out.println("Los valores cambiados son: ");
        System.out.println("");
        
        System.out.println("A = "+ D);
        System.out.println("B = "+ C);
        System.out.println("C = "+ A);
        System.out.println("D = "+ B);
        
        input.close();
    }
}
