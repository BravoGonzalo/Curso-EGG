package entidades;

public class Arreglos {
    public int[] vec;

    public Arreglos(){

    }

    public Arreglos(int num, int num2, int num3){
        this.vec = new int[3];
        vec[0] = num;
        vec[1] = num2;
        vec[2] = num3;
    }

    public int getValor(int indice){
        return vec[indice];
    }
}
