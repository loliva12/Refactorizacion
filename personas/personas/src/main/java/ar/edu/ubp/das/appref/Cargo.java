package ar.edu.ubp.das.appref;

public class Cargo {

    private String codCargo;
    private String nomCargo;

    public String getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    public String getNomCargo() {
        return nomCargo;
    }

    public void setNomCargo(String nomCargo) {
        this.nomCargo = nomCargo;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "codCargo='" + codCargo + '\'' +
                ", nomCargo='" + nomCargo + '\'' +
                '}';
    }

}