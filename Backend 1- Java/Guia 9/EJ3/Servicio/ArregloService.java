package Servicio;

import java.util.Arrays;

public class ArregloService {
    public double[] inicializarA(double[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (double) (Math.random() * 10);
        }
        return A;
    }

    public void mostrarA(double[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%.2f\n", A[i]);
        }
    }

    public void ordenar(double[] A) {
        Arrays.sort(A);
    }

    public double[] inicializarB(double[] B, double[] A){
        for(int i = 0; i < 10; i++){
            B[i] = A[i];
        }
        for(int i = 10; i < 20; i++ ){
            B[i] = 0.5;
        }
        return B;
    }

    public void mostrarB(double[] B){
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%.2f\n", B[i]);
        }
    }
}
