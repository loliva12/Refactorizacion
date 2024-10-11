package ar.edu.ubp.das.appref;

import java.util.List;

public class Venta {
    private TipoVenta tipoVenta;
    private List<Producto> productos;
    private String cliente;

    public Venta(String cliente, List<Producto> productos, TipoVenta tipoVenta) {
        this.productos = productos;
        this.tipoVenta = tipoVenta;
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getDescuento() {
        return tipoVenta.getDescuento();
    }

    public double calcularEnvio() {
        return tipoVenta.calcularEnvio();
    }
    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CLIENTE: ");
        sb.append(this.cliente);
        sb.append("\n");

        sb.append("TIPO DE VENTA: ");
        sb.append(this.tipoVenta);
        sb.append("\n");

        sb.append("DESCUENTO: ");
        sb.append(this.getDescuento());
        sb.append("\n");

        sb.append("COSTO DE ENVÍO: ");
        sb.append(this.calcularEnvio());
        sb.append("\n");

        sb.append("PRODUCTOS ADQUIRIDOS:\n");
        for(ar.edu.ubp.das.appref.Producto p : this.productos) {
            sb.append(p.nombre);
            sb.append(" - Cantidad: ");
            sb.append(p.cantidad);
            sb.append(" - Precio: ");
            sb.append(p.precio);
            sb.append("\n");
        }
        return sb.toString();
    }
}
