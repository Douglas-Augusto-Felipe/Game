package exercicio.model;

public class Personagem {
    
    private String name;
    private TipoArmadura TipoArmadura;
    private TipoCapacete TipoCapacete;
    private TipoArma TipoArma;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public TipoArmadura getTipoArmadura() {
        return TipoArmadura;
    }
    
    public void setTipoArmadura(TipoArmadura tipoArmadura) {
        TipoArmadura = tipoArmadura;
    }
    public TipoCapacete getTipoCapacete() {
        return TipoCapacete;
    }
    
    public void setTipoCapacete(TipoCapacete tipoCapacete) {
        TipoCapacete = tipoCapacete;
    }
    public TipoArma getTipoArma() {
        return TipoArma;
    }

    public void setTipoArma(TipoArma tipoArma) {
        TipoArma = tipoArma;
    }


    public Personagem(String name,TipoArmadura Armadura, TipoCapacete Capacete, TipoArma Arma) {
        this.name = name;
        this.TipoCapacete = Capacete;// inicializa o inventário de capacetes.
        this.TipoArmadura = Armadura; // inicializa o inventário de armaduras.        
        this.TipoArma = Arma; // inicializa o inventário de arma.
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "name='" + name + '\'' +
                ", " + TipoCapacete +
                ", " + TipoArmadura +
                ", " + TipoArma;
    }

}
