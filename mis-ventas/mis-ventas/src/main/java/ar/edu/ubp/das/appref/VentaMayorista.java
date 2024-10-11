package ar.edu.ubp.das.appref;

public class VentaMayorista implements TipoVenta {
    public double getDescuento() { return 0.15; }
    public double calcularEnvio() { return 20.00; }
}