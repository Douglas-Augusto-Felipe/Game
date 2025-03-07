package exercicio.model;


public class TipoArma {

    private Arma arma;

    public TipoArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Arma {" + arma + "}"; 
    }
}