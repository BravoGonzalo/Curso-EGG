package entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private Perro perro;
    
    public Persona() {
    }
    public Persona(String nombre, String apellido, int edad, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public long getDocumento() {
        return documento;
    }
    public void setDocumento(long documento) {
        this.documento = documento;
    }
    public Perro getPerro() {
        return perro;
    }
    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    @Override
    public String toString() {
        return "[nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento
                + ", perro=" + perro + "]";
    }

}
