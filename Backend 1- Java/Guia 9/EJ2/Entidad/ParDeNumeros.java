package Entidad;

public class ParDeNumeros {
    private long num1;
    private long num2;

    public ParDeNumeros(){
        this.num1 = (long) (Math.random() * 10);
        this.num2 = (long) (Math.random() * 10);
    }

    public ParDeNumeros(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public long getNum1(){
        return num1;
    }
    public long getNum2(){
        return num2;
    }

}
