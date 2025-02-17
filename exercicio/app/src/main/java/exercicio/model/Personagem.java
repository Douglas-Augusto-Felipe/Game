package exercicio.model;

public class Personagem {
    private String name;
    private TipoCapacete capacete;
    private TipoArmadura armadura;
    private TipoArma arma;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoCapacete getCapacete() {
        return capacete;
    }

    public void setCapacete(TipoCapacete capacete) {
        this.capacete = capacete;
    }

    public TipoArmadura geTipoArmadura() {
        return armadura;
    }

    public void setTipoArmadura(TipoArmadura armadura) {
        this.armadura = armadura;
    }

    public TipoArma getArma() {
        return arma;
    }

    public void setArma(TipoArma arma) {
        this.arma = arma;
    }

    public Personagem(String name,TipoCapacete capacete, TipoArmadura armadura, TipoArma arma) {
        this.name = name;
        this.capacete = capacete;
        this.armadura = armadura;
        this.arma = arma;
    }

}
