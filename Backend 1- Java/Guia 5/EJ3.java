import java.util.Scanner;

/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, 
 * etcétera (hasta 5 dígitos).
 */
public class EJ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese de cuantos numeros quiere el vector.");
        int t = input.nextInt();
        int[] vector = new int[t];
        int i;
        for (i = 0; i < t; i++) {
            vector[i] = (int) (Math.random() * 10000);
            
        }
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;

        for (i = 0; i <t; i++){
            if ((vector[i]/10) < 1){
                uno = uno + 1;
            } else if ((vector[i]/10) < 10){
                dos = dos + 1;
            } else if ((vector[i]/10) < 100){
                tres = tres + 1;
            }else if ((vector[i]/10) < 1000){
                cuatro = cuatro + 1;
            }
            else if ((vector[i]/10) < 10000){
                cinco = cinco + 1;
            }
        }
        System.out.println("El vector con un digito : " + uno);
        System.out.println("El vector con un dos digitos : " + dos);
        System.out.println("El vector con un tres digitos : " + tres);
        System.out.println("El vector con un cuatro digitos : " + cuatro);
        System.out.println("El vector con un cinco digitos : " + cinco);
        
        input.close();
    }
}
