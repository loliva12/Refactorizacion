package ar.edu.ubp.das.appref;

public class Equipo implements Comparable<Equipo> {

    private String nombre;
    private int goles;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.goles = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public int compareTo(Equipo o) {
        if(this.nombre.equals(o.nombre))
            return 0;
        return 1;
    }

    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        datos.append(this.nombre);
        if(this.goles > 0) {
            datos.append(" - Goles: ");
            datos.append(this.goles);
        }
        return datos.toString();
    }

}
