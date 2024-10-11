package ar.edu.ubp.das.appref;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        MisVentas mv = new MisVentas();

        Producto p1 = new Producto("PRODUCTO 1", 10, 5);
        Producto p2 = new Producto("PRODUCTO 2", 4, 30);

        // Crear una venta en línea
        Venta v1 = new Venta("CLIENTE 1", Arrays.asList(p1, p2), new VentaEnLinea());
        mv.agregarVenta(v1);

        Producto p3 = new Producto("PRODUCTO 3", 5, 5);
        Producto p4 = new Producto("PRODUCTO 4", 15, 2);

        // Crear una venta minorista
        Venta v2 = new Venta("CLIENTE 2", Arrays.asList(p3, p4), new VentaMinorista());
        mv.agregarVenta(v2);

        Producto p5 = new Producto("PRODUCTO 5", 25, 15);
        Producto p6 = new Producto("PRODUCTO 6", 4, 8);

        // Crear una venta mayorista
        Venta v3 = new Venta("CLIENTE 3", Arrays.asList(p5, p6), new VentaMayorista());
        mv.agregarVenta(v3);

        // Imprimir el resultado
        System.out.print(mv);
    }
}
