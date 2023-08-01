package Entidades;

import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona(){

    }

    public Persona(String nombre, Date fechaDeNacimiento){
        this.nombre = nombre;
        fechaDeNacimiento = new Date();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaDeNacimiento(Date fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;;
    }

    public String getNombre(){
        return nombre;
    }
    public Date getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
}
