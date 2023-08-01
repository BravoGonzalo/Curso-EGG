package Entidades;

public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;

    public Persona(){

    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    public void setsexo(String sexo){
        this.sexo = sexo;
    }
    public void setpeso(double peso){
        this.peso = peso;
    }
    public void setaltura(double altura){
        this.altura = altura;
    }

    public String getnombre(){
        return nombre;
    }
    public int getedad(){
        return edad;
    }
    public String getsexo(){
        return sexo;
    }
    public double getpeso(){
        return peso;
    }
    public double getaltura(){
        return altura;
    }
}
