package exercicio.model;

public class setCabeça {
    private String elmo;
    private String visor;
    private String mascara;

    public String getElmo() {
        return elmo;
    }

    public void setElmo(String elmo) {
        this.elmo = elmo;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public setCabeça(String elmo, String visor, String mascara) {
        this.elmo = elmo;
        this.visor = visor;
        this.mascara = mascara;
    }
}
