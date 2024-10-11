package ar.edu.ubp.das.appref;

import java.util.Date;

public class Partido implements Comparable<Partido> {

    Date fecha;
    Equipo local;
    Equipo visitante;
    Jugador elegido;

    @Override
    public int compareTo(Partido p) {
        if(this.fecha == p.fecha && this.local.compareTo(p.local) == 0)
            return 0;
        return 1;
    }

}
