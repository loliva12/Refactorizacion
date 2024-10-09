package ar.edu.ubp.das.appref;

import java.util.Date;

public class Partido implements Comparable<Partido> {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Jugador elegido;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Jugador getElegido() {
        return elegido;
    }

    public void setElegido(Jugador elegido) {
        this.elegido = elegido;
    }

    @Override
    public int compareTo(Partido p) {
        if(this.fecha == p.fecha && this.local.compareTo(p.local) == 0)
            return 0;
        return 1;
    }

}
