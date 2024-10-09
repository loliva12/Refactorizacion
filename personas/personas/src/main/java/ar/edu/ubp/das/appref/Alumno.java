package ar.edu.ubp.das.appref;

public class Alumno extends Persona {

    protected int nroLegAlumno;
    protected Carrera carrera;

    public void setNroLegAlumno(int nroLegAlumno) {
        this.nroLegAlumno = nroLegAlumno;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Alumno{" +
                "carrera=" + carrera +
                ", nroLegAlumno=" + nroLegAlumno +
                '}';
    }
}

