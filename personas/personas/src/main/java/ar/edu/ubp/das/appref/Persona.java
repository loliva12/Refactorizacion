package ar.edu.ubp.das.appref;

public class Persona {

    private String apellido;
    private String nombre;
    private String tipoDocumento;
    private int nroDocumento;



    public Persona() { }

    public Persona( String apellido, String nombre, String tipoDocumento, int nroDocumento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }


    @Override
    public String toString() {
        return "Persona{" +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", nroDocumento=" + nroDocumento +

                '}';
    }
}
