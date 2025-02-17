package exercicio.model;

public class Personagem {
    private String name;
    private setCabeça setCabeça;
    private setPeito setPeito;
    private arma arma;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public setCabeça getCabeça() {
        return setCabeça;
    }

    public void setCabeça(setCabeça setCabeça) {
        this.setCabeça = setCabeça;
    }

    public setPeito getSetPeito() {
        return setPeito;
    }

    public void setSetPeito(setPeito setPeito) {
        this.setPeito = setPeito;
    }

    public arma getArma() {
        return arma;
    }

    public void setArma(arma arma) {
        this.arma = arma;
    }

    public Personagem(String name, exercicio.model.setCabeça setCabeça, exercicio.model.setPeito setPeito,exercicio.model.arma arma) {
        this.name = name;
        this.setCabeça = setCabeça;
        this.setPeito = setPeito;
        this.arma = arma;
    }

}
