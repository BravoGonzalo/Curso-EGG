package Rectangulo;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public void setbase(int base){
        this.base = base;
    }
    public void setaltura(int altura){
        this.altura = altura;
    }

    public void crearRectangulo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la base.");
        setbase(input.nextInt());

        System.out.println("Ingrese la altura.");
        setaltura(input.nextInt());

        input.close();
    }

    public void calcularSuperficie(){
        double superficie = base * altura;
        System.out.println("La superficie es: " + superficie);
    }

    public void calcularPerimetro(){
        double perimetro = Math.pow(base + altura, 2);
        System.out.println("El perimetro es: " + perimetro);
    }

    public void dibujar(){

        for(int i = 0; i < base; i++){
            for(int j = 0; j < altura; j++){
                if(i == 0 || i == base -1 || j == 0 || j == altura-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
