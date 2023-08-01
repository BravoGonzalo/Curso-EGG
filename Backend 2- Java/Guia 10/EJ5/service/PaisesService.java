package service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesService{
    Scanner input = new Scanner(System.in);
    TreeSet<String> paises = new TreeSet<>();
    public void crearPaises(){
        while(true){
            System.out.println("Ingrese el pais que desee...");
            String pais = input.nextLine();
            paises.add(pais);
            
            System.out.println("¿Desea agregar otro pais? o salir?");
            String respuesta = input.nextLine().toLowerCase();
            if(respuesta.equals("salir")){
                break;
            }
        }
        System.out.println("Paises ordenados alfabeticamente.");
        for(String mostrar : paises){
            System.out.println("Los paises ingresados son: " + mostrar);
        }
    }

    public void Eliminar(){
        System.out.println("¿Que pais desea eliminar?");
        String borrar = input.nextLine();
        Iterator<String> buscar = paises.iterator();

        while(buscar.hasNext()){
            String paises = buscar.next();
            if(paises.equals(borrar)){
                buscar.remove();
            }
        }
        System.out.println("Paises ordenados alfabeticamente sin el pais borrado...");
        for(String mostrar : paises){
            System.out.println("Los paises que quedaron son: " + mostrar);
        }
    }
    
    @Override
    public String toString() {
        return "Paises:" + paises;
    }

}
