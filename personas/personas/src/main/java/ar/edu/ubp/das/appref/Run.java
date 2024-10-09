package ar.edu.ubp.das.appref;

public class Run {

    // NO CONSIDERAR PARA REFACTORIZAR
    public static void main(String[] args) {

        Persona per1 = new Persona( "MAS", "ATAHUALPA", "DNI", 12345678);
        System.out.println(per1);

        Cargo cargo = new Cargo();
        cargo.setCodCargo("DT");
        cargo.setNomCargo("Docente titular");

        Carrera carrera = new Carrera("ING-INF", "INGENERÍA INFORMÁTICA", "2014", "10", "PRESENCIAL");

        Docente docente = new Docente();
        docente.setNombre("MAS");
        docente.setApellido("ATAHUALPA");
        docente.setCarrera(carrera);
        docente.setTipoDocumento("DNI");
        docente.setNroDocumento(12345678);
        docente.setNomCargo("Profesor matematicas");
        docente.setNroLegDocente(1);
        System.out.println(docente.toString());

        Alumno alumno = new Alumno();
        alumno.setNroLegAlumno(1);
        alumno.setApellido("MAS");
        alumno.setNombre("ATAHUALPA");
        alumno.setTipoDocumento("DNI");
        alumno.setNroDocumento(111222333);
        alumno.setCarrera(carrera);
        System.out.println(alumno.toString());

        Matricula matricula = new Matricula(carrera, alumno);
        System.out.println(matricula.toString());

    }

}
