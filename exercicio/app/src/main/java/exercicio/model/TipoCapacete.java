package exercicio.model;


public class TipoCapacete {
    
    enum capacete {
        ELMO, VISOR, MASCARA
    }
    
    private TipoCapacete capacete;

    public TipoCapacete getCapacete() {
        return capacete;
    }

    public void setCapacete(TipoCapacete capacete) {
        this.capacete = capacete;
    }

    @Override
    public String toString() {
        return "TipoCapacete {capacete=" + capacete + "}";
    }

    public static TipoCapacete valueOf(String capacete2) {
    
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }

}