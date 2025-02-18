package exercicio.model;

public class Personagem {
    private InventarioArmadura inventarioArmadura;
    private InventarioCapacete InventarioCapacete;
    private InventarioArma inventarioArma;
    private String name;



    public InventarioArmadura getInventarioArmadura() {
        return inventarioArmadura;
    }

    public void setInventarioArmadura(InventarioArmadura inventarioArmadura) {
        this.inventarioArmadura = inventarioArmadura;
    }

    public InventarioCapacete getInventarioCapacete() {
        return InventarioCapacete;
    }

    public void setInventarioCapacete(InventarioCapacete inventarioCapacete) {
        InventarioCapacete = inventarioCapacete;
    }

    public InventarioArma getInventarioArma() {
        return inventarioArma;
    }

    public void setInventarioArma(InventarioArma inventarioArma) {
        this.inventarioArma = inventarioArma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personagem(String name) {
        this.name = name;
        this.InventarioCapacete = new InventarioCapacete(); // inicializa o inventário de capacetes.
        this.inventarioArmadura = new InventarioArmadura(); // inicializa o inventário de armaduras.
        this.inventarioArma = new InventarioArma(); // inicializa o inventário de arma.
    }

}
