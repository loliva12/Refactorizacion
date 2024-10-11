package ar.edu.ubp.das.appref;

public class VentaMinorista implements TipoVenta {
    public double getDescuento() { return 0.05; }
    public double calcularEnvio() { return 0; }
}
