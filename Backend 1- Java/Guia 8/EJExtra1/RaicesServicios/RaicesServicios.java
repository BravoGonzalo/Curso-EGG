package RaicesServicios;

import Raices.Raices;

public class RaicesServicios {
    
    public double getDiscriminante(Raices rai) {
        return Math.pow(rai.getb(), 2) - 4 * rai.geta() * rai.getc();
    }

    public boolean tieneRaices(Raices rai) {
        if (getDiscriminante(rai) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices rai) {
        if (getDiscriminante(rai) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Raices rai) {
        double discri = getDiscriminante(rai);
        if (tieneRaices(rai)) {
            double x1 = (-rai.getb() + Math.sqrt(discri)) / (2 * rai.geta());
            double x2 = (-rai.geta() - Math.sqrt(discri)) / (2 * rai.geta());
            System.out.println("Las soluciones son: primera=" + x1 + " y segunda=" + x2);
        } else {
            System.out.println("El programa no tiene solucion.");
        }
    }

    public void obtenerRaiz(Raices rai) {
        double discri = getDiscriminante(rai);
        if (tieneRaiz(rai)) {
            double unica = (-rai.getb() + Math.sqrt(discri)) / (2 * rai.geta());
            System.out.println("La unica solucion posible es: " + unica);
        } else {
            System.out.println("El programa no tiene solucion");
        }
    }

    public void calcular(Raices rai) {
        if (tieneRaices(rai)) {
            obtenerRaices(rai);
        } else if (tieneRaiz(rai)) {
            obtenerRaiz(rai);
        } else {
            System.out.println("No se encontró solucion.");
        }
    }
}
