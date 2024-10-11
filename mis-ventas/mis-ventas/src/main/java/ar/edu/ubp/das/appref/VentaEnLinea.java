package ar.edu.ubp.das.appref;

public class VentaEnLinea implements TipoVenta {
    public double getDescuento() { return 0.10; }
    public double calcularEnvio() { return 5.00; }
}