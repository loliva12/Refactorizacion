package ar.edu.ubp.das.appref;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Fechas {
    private static Fechas instance;
    LinkedList<Partido> partidos;

    public Fechas() {
        this.partidos = new LinkedList<>();
    }

    public static Fechas getInstance() {
        if(instance == null) {
            instance = new Fechas();
        }
        return instance;
    }

    public void agregarPartido(Date fecha, Equipo local, Equipo visitante) {
        this.partidos.add(new Partido(fecha, local, visitante));
    }

    public void informarGolesPartido(Date fecha, Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        Partido partido = buscarPartido(fecha, local, visitante);
        if (partido != null) {
            partido.actualizarGoles(golesLocal, golesVisitante);
        }
    }
    public void elegirJugadorPartido(Date fecha, Equipo local, Equipo visitante, Jugador jugador) {
        Partido partido = buscarPartido(fecha, local, visitante);
        if (partido != null) {
            partido.setJugadorDelPartido(jugador);
        }
    }

    private Partido buscarPartido(Date fecha, Equipo local, Equipo visitante) {
        for (Partido partido : this.partidos) {
            if (partido.getFecha().equals(fecha) && partido.getLocal().equals(local) && partido.getVisitante().equals(visitante)) {
                return partido;
            }
        }
        return null;
    }

    public String mostrarPartidos() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder datos = new StringBuilder();
        for(Partido partido : this.partidos) {
            datos.append("*****************************************\n")
                    .append("Fecha: ").append(sdf.format(partido.getFecha())).append("\n")
                    .append("Local: ").append(partido.getLocal()).append("\n")
                    .append("Visitante: ").append(partido.getVisitante()).append("\n");
            if(partido.getJugadorDelPartido() != null) {
                datos.append("Jugador del partido: ").append(partido.getJugadorDelPartido()).append("\n");
            }
            datos.append("*****************************************\n");
        }
        return datos.toString();
    }
}


