package ar.edu.ubp.das.appref;

import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Jugador elegido;

    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public Jugador getJugadorDelPartido() {
        return elegido;
    }

    public void setJugadorDelPartido(Jugador jugador) {
        this.elegido = jugador;
    }

    public void actualizarGoles(int golesLocal, int golesVisitante) {
        this.local.setGoles(golesLocal);
        this.visitante.setGoles(golesVisitante);
    }
}
