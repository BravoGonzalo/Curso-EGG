package Entidades;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(){
        this.frase = "casa blanca";
        this.longitud = this.frase.length();
    }

    public Cadena(String frase, int longitud){
        this.frase = frase;
        this.longitud = longitud;
    }
    public void setFrase(String frase){
        this.frase = frase;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    public String getFrase(){
        return frase;
    }
    public int getLongitud(){
        return longitud;
    }
}
