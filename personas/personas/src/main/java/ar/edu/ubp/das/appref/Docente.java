package ar.edu.ubp.das.appref;

public class Docente extends Persona {

    protected Carrera carrera;
    protected int nroLegDocente;
    private String nomCargo;

    public Docente() { }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setNroLegDocente(int nroLegDocente) {
        this.nroLegDocente = nroLegDocente;
    }
    public void setNomCargo(String nomCargo) {
        this.nomCargo = nomCargo;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Docente{" +
                "nomCargo=" + nomCargo +
                ", carrera=" + carrera +
                ", nroLegDocente=" + nroLegDocente +
                '}';
    }
}

