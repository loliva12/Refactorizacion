package ar.edu.ubp.das.app;

public class TipoDocumento {

    private String codTipoDocumento;
    private String nomTipoDocumento;
    private int nroDocumento;

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public String getNomTipoDocumento() {
        return nomTipoDocumento;
    }

    public void setNomTipoDocumento(String nomTipoDocumento) {
        this.nomTipoDocumento = nomTipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "codTipoDocumento='" + codTipoDocumento + '\'' +
                ", nomTipoDocumento='" + nomTipoDocumento + '\'' +
                ", nroDocumento=" + nroDocumento +
                '}';
    }

}

