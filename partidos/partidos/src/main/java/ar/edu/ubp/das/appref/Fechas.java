package ar.edu.ubp.das.appref;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Fechas {

    private static Fechas instance;
    private LinkedList<Partido> partidos;

    public Fechas() {
        this.partidos = new LinkedList<>();
    }

    public static Fechas getInstance() {
        if(instance == null) {
            instance = new Fechas();
        }
        return instance;
    }

    private Partido crearPartido(Date fecha, Equipo local, Equipo visitante) {
        Partido p = new Partido();
        p.setFecha(fecha);
        p.setLocal(local);
        p.setVisitante(visitante);
        return p;
    }

    public void agregarPartido(Date fecha, Equipo local, Equipo visitante) {
        Partido p = crearPartido(fecha, local, visitante);
        this.partidos.add(p);
    }

    public void informarGolesPartido(Date fecha, Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        Partido p = crearPartido(fecha, local, visitante);

        for(Partido partido : this.partidos) {
            if(partido.compareTo(p) == 0) {
                partido.getLocal().goles = golesLocal;
                partido.setLocal(local);

                partido.getVisitante().goles = golesVisitante;
                partido.setVisitante(visitante);
                break;
            }
        }
    }

    public void elegirJugadorPartido(Date fecha, Equipo local, Equipo visitante, Jugador jugador) {
        Partido p = crearPartido(fecha, local, visitante);

        for(Partido partido : this.partidos) {
            if(partido.compareTo(p) == 0) {
                partido.setElegido(jugador);
                break;
            }
        }
    }

    private String imprimirPartido(Partido partido) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder datos = new StringBuilder();

        datos.append("*****************************************\n");
        datos.append("Fecha: ").append(sdf.format(partido.getFecha())).append("\n");
        datos.append("Local: ").append(partido.getLocal()).append("\n");
        datos.append("Visitante: ").append(partido.getVisitante()).append("\n");
        if(partido.getElegido() != null) {
            datos.append("Jugador del partido: ").append(partido.getElegido()).append("\n");
        }
        datos.append("*****************************************\n");

        return datos.toString();
    }

    public String mostrarPartidos() {
        StringBuilder datos = new StringBuilder();

        for(Partido partido : this.partidos) {
            datos.append(imprimirPartido(partido));
        }

        return datos.toString();
    }
}
