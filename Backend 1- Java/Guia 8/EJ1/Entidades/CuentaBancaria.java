package Entidades;

public class CuentaBancaria {
    public int numeroCuenta;
    public long dniCliente;
    public double saldoActual;

    public CuentaBancaria() {

    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dniCliente = dniCliente;

    }

    public void setnumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setdniCliente(long dniCliente){
        this.dniCliente = dniCliente;
    }
    public void setsaldoActual(double saldoActual){
        this.saldoActual = saldoActual;
    }

    public int getnumeroCuenta() {
        return numeroCuenta;
    }

    public long getdniCliente() {
        return dniCliente;
    }

    public double getsaldoActual() {
        return saldoActual;
    }
}
