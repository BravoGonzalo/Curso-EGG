package Puntos;

import java.util.Scanner;

public class Puntos {
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public void crearPuntos(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el x1");
        this.x1 = input.nextInt();
        System.out.println("Ingrese el y1");
        this.y1 = input.nextInt();
        System.out.println("Ingrese el x2");
        this.x2 = input.nextInt();
        System.out.println("Ingrese el y2");
        this.y2 = input.nextInt();

        input.close();
    }

    public double calcular(){
        double distancia = Math.sqrt(x1);
    }
}
