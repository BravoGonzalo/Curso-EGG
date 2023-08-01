import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad deseada de EUROS a convertir:");
        int euro = input.nextInt();
        System.out.println("¿A que moneda quiere convertirlo?");
        System.out.println("|1-libras|");
        System.out.println("|2-dolar |");
        System.out.println("|3-yenes |");
        int resp = input.nextInt();
        conversor(euro,resp);
        input.close();
    }
    public static void conversor(int euro, int resp ){
        switch(resp){
            case 1: 
            System.out.println("los Euros " +euro+ "convertidos a libras son: " + euro * 0.86 );
            break;
            case 2: 
            System.out.println("los Euros " +euro+ "convertidos a dolares son: " + euro * 1.28611 );
            break;
            case 3: 
            System.out.println("los Euros " +euro+ "convertidos a libras son: " + euro * 129.852 );
            break;
        }
        
    }
}
