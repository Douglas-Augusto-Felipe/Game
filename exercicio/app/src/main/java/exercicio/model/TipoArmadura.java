package exercicio.model;



public class TipoArmadura {

    private Armadura armadura;

    public TipoArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public  Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    @Override
    public String toString() {
        return "Tipo de Armadura = {" + armadura + "}";
    }
}