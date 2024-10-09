package ar.edu.ubp.das.appref;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private char simbolo;

    public Jugador(String nombre, char simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSimbolo() {
        return simbolo;
    }
    public static Jugador crearJugador(Scanner in, int numeroJugador, char simbolo) {
        System.out.print("Nombre del jugador " + numeroJugador + ": ");
        return new Jugador(in.nextLine(), simbolo);
    }
}

