package exercicio.model;

import java.util.ArrayList;
import java.util.List;

public class InventarioArmadura {

    private List<TipoArmadura> armaduras;

    public InventarioArmadura() {
        this.armaduras = new ArrayList<>();
    }    

    public void adicionarArmadura(TipoArmadura armadura) {
        this.armaduras.add(armadura);
    }

    public void removerArmadura(TipoArmadura armadura) {
        this.armaduras.remove(armadura);
    }
    public TipoArmadura buscarArmadura(TipoArmadura armadura) {
        for (TipoArmadura arm : armaduras) {
            if (arm == armadura) {
                return arm;
            }
        }
        return null;
    }

    public List<TipoArmadura> getArmaduras() {
        return armaduras;
    }

}
