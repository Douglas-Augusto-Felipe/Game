package exercicio.model;

import java.util.ArrayList;
import java.util.List;

public class InventarioArma {
    private List<arma> armas;

    public InventarioArma() {
        this.armas = new ArrayList<>();
    }

    public void adicionarArma(arma arma) {
        this.armas.add(arma);
    }

    public List<arma> getArmas() {
        return armas;
    }

}