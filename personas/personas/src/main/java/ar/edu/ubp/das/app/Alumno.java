package ar.edu.ubp.das.app;

public class Alumno extends Docente {

    public int getNroLegAlumno() {
        return nroLegAlumno;
    }

    public void setNroLegAlumno(int nroLegAlumno) {
        this.nroLegAlumno = nroLegAlumno;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Alumno{" +
                "carrera=" + carrera +
                ", nroLegAlumno=" + nroLegAlumno +
                ", nroLegDocente=" + nroLegDocente +
                '}';
    }
}

