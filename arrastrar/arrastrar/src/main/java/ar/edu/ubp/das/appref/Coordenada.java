package ar.edu.ubp.das.appref;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void actualizar(int nuevoX, int nuevoY) {
        this.x = nuevoX;
        this.y = nuevoY;
    }


    public Coordenada diferencia(Coordenada otra) {
        return new Coordenada(this.x - otra.x, this.y - otra.y);
    }
}

