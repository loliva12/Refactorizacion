package ar.edu.ubp.das.appref;

public class Jugador extends Equipo {

    private String apellido;

    public Jugador(String nombre, String apellido) {
        super(nombre);
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        datos.append(this.apellido);
        datos.append(", ");
        datos.append(super.toString());
        return datos.toString();
    }

}
