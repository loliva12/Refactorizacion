package ar.edu.ubp.das.appref;

import java.util.Scanner;

public class App {
    private static Tablero tablero;
    private static Jugador jugador1;
    private static Jugador jugador2;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Juguemos al TA-TE-TI");

            jugador1 = Jugador.crearJugador(in, 1, 'X');
            jugador2 = Jugador.crearJugador(in, 2, 'O');

            tablero = new Tablero();
            tablero.inicializar();  // Inicializar el tablero antes de empezar

            iniciarJuego(in);
        }
    }

    public static void iniciarJuego(Scanner in) {
        boolean turnoJugador1 = true;

        while (true) {
            System.out.println("Estado actual del TABLERO:");
            tablero.imprimir();

            Jugador jugadorActual = turnoJugador1 ? jugador1 : jugador2;
            System.out.println("Turno de " + jugadorActual.getNombre() + " (" + jugadorActual.getSimbolo() + "): ");

            int[] posicion = obtenerPosicionValida(in);

            tablero.getTablero()[posicion[0]][posicion[1]] = jugadorActual.getSimbolo();

            if (verificarGanador(jugadorActual)) {
                break;  // Sale si hay ganador.
            }

            if (tablero.termino()) {
                System.out.println("El juego terminó en empate.");
                break;  // Sale si el tablero está lleno.
            }

            turnoJugador1 = !turnoJugador1;
        }

        System.out.println("TABLERO FINAL");
        tablero.imprimir();
    }

    private static int[] obtenerPosicionValida(Scanner in) {
        int fila = 0, columna = 0;
        while (true) {
            try {
                System.out.print("Ingresa la fila (0, 1, ó 2): ");
                fila = Integer.parseInt(in.nextLine().trim());
                System.out.print("Ingresa la columna (0, 1, ó 2): ");
                columna = Integer.parseInt(in.nextLine().trim());

                if (!tablero.esPosicionValida(fila, columna)) {
                    System.out.println("La posición no es válida o ya fue elegida, vuelve a intentar.");
                } else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("El valor ingresado no es \"ENTERO\", vuelve a intentar.");
            }
        }
        return new int[]{fila, columna};
    }

    private static boolean verificarGanador(Jugador jugadorActual) {
        if (tablero.esGanador(jugadorActual)) {
            System.out.println("¡" + jugadorActual.getNombre() + " ganó! :D");
            return true;
        }
        return false;
    }
}
