package Servicios;

import Entidad.ParDeNumeros;

public class ParDeNumerosService {
    ParDeNumeros nn = new ParDeNumeros();

    public void mostrarValores(){
        System.out.println(nn.getNum1());
        System.out.println(nn.getNum2());
    }

    public long devolverMayor(){
        return Math.max(nn.getNum1(),nn.getNum2());
    }

    public long calcularPotencia(){
        double num1 = nn.getNum1();
        double num2 = nn.getNum2();
        return (long) Math.pow(num1, num2);
    }

    public long calculaRaiz(){
        double num1 = nn.getNum1();
        double num2 = nn.getNum2();
        return (long) Math.sqrt(Math.min(num1, num2));
    }
}
