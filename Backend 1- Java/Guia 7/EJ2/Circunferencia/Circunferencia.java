package Circunferencia;

import java.util.Scanner;

public class Circunferencia {
    private double radio;
    
    public Circunferencia(){
        this.radio = 0;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void crearCircunferencia(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia.");
        this.radio = input.nextDouble();
        input.close();
    }

    public double area(){
        return Math.pow((Math.PI * radio),2);
    }

    public double perimetro(){
        return 2*Math.PI*radio;
    }
}
