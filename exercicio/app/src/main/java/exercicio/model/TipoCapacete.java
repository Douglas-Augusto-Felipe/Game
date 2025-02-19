package exercicio.model;


public class TipoCapacete {
    
    
    private Capacete capacete;

    public Capacete getCapacete() {
        return capacete;
    }

    public void setTipoCapacete(Capacete capacete) {
        this.capacete = capacete;
    }

    public TipoCapacete(Capacete capacete) {
        this.capacete = capacete;
    }
    
    @Override
    public String toString() {
        return "Tipo de Capacete =  {" + capacete + "}";
    }
}
