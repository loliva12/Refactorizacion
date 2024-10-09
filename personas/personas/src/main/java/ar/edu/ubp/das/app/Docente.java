package ar.edu.ubp.das.app;

public class Docente extends Persona {

    private Cargo cargo;
    protected Carrera carrera;

    public Docente() { }

    public Docente(int nroPersona, int nroLegAlumno, int nroLegDocente, int nroLegPersonal, String apellido, String nombre, TipoDocumento tipoDocumento, Cargo cargo, Carrera carrera) {
        super(nroPersona, nroLegAlumno, nroLegDocente, nroLegPersonal, apellido, nombre, tipoDocumento);
        this.cargo = cargo;
        this.carrera = carrera;
    }

    public int getNroLegDocente() {
        return this.nroLegDocente;
    }

    public void setNroLegDocente(int nroLegDocente) {
        this.nroLegDocente = nroLegDocente;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Docente{" +
                "cargo=" + cargo +
                ", carrera=" + carrera +
                ", nroLegAlumno=" + nroLegAlumno +
                ", nroLegDocente=" + nroLegDocente +
                '}';
    }

}

