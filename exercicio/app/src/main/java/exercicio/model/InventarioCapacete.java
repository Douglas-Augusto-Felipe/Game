package exercicio.model;

import java.util.ArrayList;
import java.util.List;

public class InventarioCapacete {
    private List<TipoCapacete> capacetes; // Lista de TipoCapacete

    public InventarioCapacete() {
        this.capacetes = new ArrayList<>();
    }

    public void adicionarCapacete(TipoCapacete capacete) { // Argumento do tipo TipoCapacete
        this.capacetes.add(capacete);
    }

    public void removerCapacete(TipoCapacete capacete) { // Argumento do tipo TipoCapacete
        this.capacetes.remove(capacete);
    }

    public TipoCapacete buscarCapacete(TipoCapacete capacete) { // Argumento do tipo TipoCapacete
        for (TipoCapacete cpt : capacetes) {
            if (cpt == capacete) { // Comparação direta de enums
                return cpt;
            }
        }
        return null;
    }

    public List<TipoCapacete> getCapacetes() {    
        return capacetes;    
    }

}