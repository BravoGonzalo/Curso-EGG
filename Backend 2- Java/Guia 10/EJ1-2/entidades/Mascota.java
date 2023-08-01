package entidades;

public class Mascota {
    private String raza;
    
    public Mascota(){

    }
    public Mascota(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
