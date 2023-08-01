package personas;

public class DNI {
    private long numero;
    private String serie;

    public DNI() {
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public DNI(long numero, String serie) {
        this.numero = numero;
        this.serie = serie;
    }
}
