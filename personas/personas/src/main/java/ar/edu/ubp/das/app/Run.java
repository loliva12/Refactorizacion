package ar.edu.ubp.das.app;

public class Run {

    // NO CONSIDERAR PARA REFACTORIZAR
    public static void main(String[] args) {
        TipoDocumento dniPer1 = new TipoDocumento();
        dniPer1.setCodTipoDocumento("DNI");
        dniPer1.setNomTipoDocumento("Documento Nacional de Identidad");
        dniPer1.setNroDocumento(12345678);

        Persona per1 = new Persona(1, 0, 0, 0, "MAS", "ATAHUALPA", dniPer1);
        System.out.println(per1);

        Cargo cargo = new Cargo();
        cargo.setCodCargo("DT");
        cargo.setNomCargo("Docente titular");

        Carrera carrera = new Carrera("ING-INF", "INGENERÍA INFORMÁTICA", "2014", "10", "PRESENCIAL");

        Docente docente = new Docente(1, 0, 1, 1, "MAS", "ATAHUALPA", dniPer1, cargo, carrera);
        System.out.println(docente.toString());

        Alumno alumno = new Alumno();
        alumno.setNroLegAlumno(1);
        alumno.setApellido("MAS");
        alumno.setNombre("ATAHUALPA");
        alumno.setTipoDocumento(dniPer1);
        alumno.setCarrera(carrera);
        System.out.println(alumno.toString());

        Matricula matricula = new Matricula(carrera, alumno);
        System.out.println(matricula.toString());

    }

}
