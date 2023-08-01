import java.util.Scanner;

public class GuiaEJ11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los caracteres que desee. |Debe terminar en .(punto)|");
        String letras = input.nextLine();
    
        System.out.println(retorno(letras));

        input.close();
    }
    public static String retorno(String letras){
        Scanner input = new Scanner(System.in);
        letras.toLowerCase();
        String aux = "";
        for (int i = 0; i < letras.length(); i++){
            
            switch (letras.substring(i,i+1).toLowerCase()){
            case "a":
            aux = aux + "@";
            break;
            case "e":
            aux = aux + "#";
            break;
            case "i":
            aux = aux + "$";
            break;
            case "o":
            aux = aux + "%";
            break;
            case "u":
            aux = aux + "*";
            default :
            aux = aux + letras.substring(i,i+1);
            break;
            }
                
        }
        input.close();
        return(aux); 
    }
 
}