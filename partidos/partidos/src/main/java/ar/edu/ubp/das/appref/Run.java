package ar.edu.ubp.das.appref;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

    // NO CONSIDERAR PARA REFACTORIZAR
    public static void main(String[] args) {
        Fechas fechas = Fechas.getInstance();

        Date fecha1 = new GregorianCalendar(2024, Calendar.OCTOBER, 4).getTime();
        Date fecha2 = new GregorianCalendar(2024, Calendar.OCTOBER, 5).getTime();
        Date fecha3 = new GregorianCalendar(2024, Calendar.OCTOBER, 6).getTime();

        Equipo A = new Equipo("Equipo A");
        Equipo B = new Equipo("Equipo B");
        Equipo C = new Equipo("Equipo C");
        Equipo D = new Equipo("Equipo D");
        Equipo E = new Equipo("Equipo E");
        Equipo F = new Equipo("Equipo F");
        Equipo G = new Equipo("Equipo G");
        Equipo H = new Equipo("Equipo H");
        Equipo I = new Equipo("Equipo I");
        Equipo J = new Equipo("Equipo J");

        // Agregar partidos
        fechas.agregarPartido(fecha1, A, B);
        fechas.agregarPartido(fecha1, C, D);
        fechas.agregarPartido(fecha2, E, F);
        fechas.agregarPartido(fecha2, G, H);
        fechas.agregarPartido(fecha3, I, J);

        // Informar goles usando el método de Fechas
        fechas.informarGolesPartido(fecha1, A, B, 2, 3);
        fechas.informarGolesPartido(fecha1, C, D, 1, 1);

        // Elegir jugador del partido usando el método de Fechas
        fechas.elegirJugadorPartido(fecha1, A, B, new Jugador("PEPE", "GRILLO"));
        fechas.elegirJugadorPartido(fecha1, C, D, new Jugador("ATAHUALPA", "MAS"));

        // Mostrar los partidos
        System.out.print(fechas.mostrarPartidos());
    }
}
