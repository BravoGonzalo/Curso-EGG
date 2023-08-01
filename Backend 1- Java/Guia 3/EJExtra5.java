import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los 
socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del 
tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
public class EJExtra5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese que clase de socio es: ");
        System.out.println("|A|");
        System.out.println("|B|");
        System.out.println("|C|");
        String letra = input.nextLine().toUpperCase();
       System.out.println("Ingrese el coste del tratamiento.");
       int tratamiento = input.nextInt();

       switch(letra){
        case "A": 
        System.out.println("usted debe pagar: " + (50*tratamiento)/100 + " por descuento del 50%" );
        break;
        case "B": 
        System.out.println("usted debe pagar: " + (32*tratamiento)/100 + " por descuento del 35%" );
        break;
        case "C": 
        System.out.println("usted debe pagar: " + tratamiento + "." );
        System.out.println("Usted no es un socio con descuento...");
        break;
       }
       input.close();
 
    }
}
