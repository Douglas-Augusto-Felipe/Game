package exercicio.model;

public class arma {

    private String montante, daikatana, orbe, cristal, espada, katana;

    public String getMontante() {
        return montante;
    }

    public void setMontante(String montante) {
        this.montante = montante;
    }

    public String getDaikatana() {
        return daikatana;
    }

    public void setDaikatana(String daikatana) {
        this.daikatana = daikatana;
    }

    public String getOrbe() {
        return orbe;
    }

    public void setOrbe(String orbe) {
        this.orbe = orbe;
    }

    public String getCristal() {
        return cristal;
    }

    public void setCristal(String cristal) {
        this.cristal = cristal;
    }

    public String getEspada() {
        return espada;
    }

    public void setEspada(String espada) {
        this.espada = espada;
    }

    public String getKatana() {
        return katana;
    }

    public void setKatana(String katana) {
        this.katana = katana;
    }

    public arma(String montante, String daikatana, String orbe, String cristal, String espada, String katana) {
        this.montante = montante;
        this.daikatana = daikatana;
        this.orbe = orbe;
        this.cristal = cristal;
        this.espada = espada;
        this.katana = katana;
    }
}
