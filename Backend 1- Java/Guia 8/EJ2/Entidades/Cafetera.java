package Entidades;

public class Cafetera {
    public double capacidadMaxima;
    public double capacidadActual;

    public Cafetera(){
        this.capacidadActual = 0;
        this.capacidadMaxima = 1000;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual){
        this.capacidadActual = capacidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setcapacidadMaxima(double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setcapacidadActual(double capacidadActual){
        this.capacidadActual = capacidadActual;
    }

    public  double getcapacidadActual(){
        return capacidadActual;
    }

    public double getcapacidadMaxima(){
        return capacidadMaxima;
    }
    
}
