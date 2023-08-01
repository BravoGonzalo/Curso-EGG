package servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class MascotaService {
    Scanner input = new Scanner(System.in);
    public ArrayList<String> perros = new ArrayList<>();

    public void crearPerro() {

        System.out.println("¿Que raza es su perro?");
        String raza = input.nextLine();

        perros.add(raza);
    }

    public void mostrarPerros(){
        for(String ver : perros){
            System.out.println("La raza de su perro es: " + ver.toString());
        }
    }

}
