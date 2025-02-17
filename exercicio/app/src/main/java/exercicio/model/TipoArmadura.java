package exercicio.model;

enum armadura {
    ELMO, VISOR, MASCARA
}

public class TipoArmadura {

    private TipoArmadura armadura;

    public TipoArmadura getArmadura() {
        return armadura;
    }

    public void setArmadura(TipoArmadura armadura) {
        this.armadura = armadura;
    }

    @Override
    public String toString() {
        return "TipoArmadura {armadura=" + armadura + "}";
    }

    public static TipoArmadura valueOf(String armadura2) {
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }
}