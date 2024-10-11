package ar.edu.ubp.das.appref;

import java.util.ArrayList;
import java.util.List;

public class MisVentas {

    private List<Venta> ventas;

    public MisVentas() {
        ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public double calcularTotalDeUnaVenta(Venta venta) {
        double total = 0;
        for (Producto producto : venta.getProductos()){
            total += producto.calcularTotal();
        }
        return (total - (total * venta.getDescuento())) + venta.calcularEnvio();
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Venta venta : ventas) {
            total += calcularTotalDeUnaVenta(venta);
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VENTAS ");
        for (Venta v : this.ventas) {
            sb.append("\n*******************************************\n");
            sb.append(v);  // La clase Venta ya tiene un buen toString()
            sb.append("*******************************************\n");
            sb.append("TOTAL A PAGAR: ");
            sb.append(this.calcularTotalDeUnaVenta(v));  // Calcula el total de esa venta
            sb.append("\n*******************************************\n");
        }
        sb.append("\nTOTAL DE VENTAS: ");
        sb.append(this.calcularTotalVentas());  // Muestra el total de todas las ventas
        sb.append("\n*******************************************\n");
        return sb.toString();
    }
}
