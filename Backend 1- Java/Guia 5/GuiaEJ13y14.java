import java.util.Scanner;

/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
 * define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
public class GuiaEJ13y14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] Equipo = new String[4];
        for (int i = 0; i < 4; i++){
            System.out.println("Ingrese los nombres de su equipo.");
            Equipo[i] = input.nextLine();
        }
        input.close();
    }
}