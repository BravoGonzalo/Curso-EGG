package Operacion;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }

    public double getNumero1(double numero1){
        return numero1;
    }
    public double getNumero2(double numero2){
        return numero2;
    }

    public void crearOperacion(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1.");
        this.numero1= input.nextInt();

        System.out.println("Ingrese el numero 2.");
        this.numero2 = input.nextInt();

        input.close();
    }

    public double sumar(){
        return numero1 + numero2;
    }

    public double restar(){
        return numero1 - numero2;
    }

    public void multiplicar(){
       
        if(this.numero2 == 0){
            double multiplicar = 0;
            System.out.println("error" + multiplicar);
        } else{
            double multiplicar = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es: " + multiplicar);
        }
    }

    public void dividir(){
        
        if(this.numero2 == 0){
            double dividir = 0;
            System.out.println("error" + dividir);
        } else{
            double dividir = numero1 / numero2;
            System.out.println("El resultado de la divicion es: " + dividir);
        }
    }

}
