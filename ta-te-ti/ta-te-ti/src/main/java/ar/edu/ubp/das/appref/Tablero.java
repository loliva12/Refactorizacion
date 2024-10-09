package ar.edu.ubp.das.appref;

public class Tablero {
    private char[][] tablero = new char[3][3];

    public char[][] getTablero() {
        return tablero;
    }

    public void inicializar(){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    public void imprimir(){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public char gano() {
        for(int i = 0; i < 3; i++) {
            if(tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != '-') {
                return tablero[i][0];
            }
        }

        for(int j = 0; j < 3; j++) {
            if(tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j] && tablero[0][j] != '-') {
                return tablero[0][j];
            }
        }

        if(tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != '-') {
            return tablero[0][0];
        }

        if(tablero[2][0] == tablero[1][1] && tablero[1][1] ==  tablero[0][2] && tablero[2][0] != '-') {
            return tablero[2][0];
        }
        return ' ';
    }

    public boolean termino() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean esPosicionValida(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-';
    }

    public boolean esGanador(Jugador jugador) {
        char simbolo = jugador.getSimbolo();
        // Lógica para verificar si el jugador actual ha ganado
        return gano() == simbolo;
    }

}
