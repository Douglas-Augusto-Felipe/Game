package exercicio.model;

public class setPeito {
    private String armadura, traje, quimono;

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getTraje() {
        return traje;
    }

    public void setTraje(String traje) {
        this.traje = traje;
    }

    public String getQuimono() {
        return quimono;
    }

    public void setQuimono(String quimono) {
        this.quimono = quimono;
    }

    public setPeito(String armadura, String traje, String quimono) {
        this.armadura = armadura;
        this.traje = traje;
        this.quimono = quimono;
    }
}
