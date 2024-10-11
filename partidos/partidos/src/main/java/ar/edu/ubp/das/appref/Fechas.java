package ar.edu.ubp.das.appref;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Fechas {

    private static Fechas instance;

    LinkedList<Partido> partidos;

    public Fechas() {
        this.partidos = new LinkedList<Partido>();
    }

    public static Fechas getInstance() {
        if(instance == null) {
            instance = new Fechas();
        }
        return instance;
    }

    public void agregarPartido(Date fecha, Equipo local, Equipo visitante) {
        Partido p = new Partido();
        p.visitante = visitante;
        p.local = local;
        p.fecha = fecha;
        this.partidos.add(p);
    }

    public void informarGolesPartido(Date fecha, Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        Partido p = new Partido();
        p.local = local;
        p.fecha = fecha;
        p.visitante = visitante;

        for(Partido partido : this.partidos) {
            if(partido.compareTo(p) == 0) {
                partido.local.goles = golesLocal;
                partido.local = local;

                partido.visitante.goles = golesVisitante;
                partido.visitante = visitante;
                break;
            }
        }
    }

    public void elegirJugadorPartido(Date fecha, Equipo local, Equipo visitante, Jugador jugador) {
        Partido p = new Partido();
        p.fecha = fecha;
        p.local = local;
        p.visitante = visitante;

        for(Partido partido : this.partidos) {
            if(partido.compareTo(p) == 0) {
                partido.elegido = jugador;
                break;
            }
        }
    }

    public String mostrarPartidos() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder datos = new StringBuilder();

        for(Partido partido : this.partidos) {
            datos.append("*****************************************\n");
            datos.append("Fecha: ");
            datos.append(sdf.format(partido.fecha));
            datos.append("\n");
            datos.append("Local: ");
            datos.append(partido.local);
            datos.append("\n");
            datos.append("Visitante: ");
            datos.append(partido.visitante);
            datos.append("\n");
            if(partido.elegido != null) {
                datos.append("Jugador del partido: ");
                datos.append(partido.elegido);
                datos.append("\n");
            }
            datos.append("*****************************************\n");
        }
        return datos.toString();
    }

}

