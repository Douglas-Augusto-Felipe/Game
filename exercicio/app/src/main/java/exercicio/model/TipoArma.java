package exercicio.model;

enum arma {
    MONTANTE, DAIKATANA, ORBE, CRISTAL, ESPADA, KATANA
}

public class TipoArma {

    private TipoArma arma;

    public TipoArma getArma() {
        return arma;
    }

    public void setArma(TipoArma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "tipo=" + arma + '}'; 
    }

    public static TipoArma valueOf(String arma2) {
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }
}