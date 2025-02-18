package exercicio.model;

import java.util.ArrayList;
import java.util.List;

public class InventarioArma {

    private List<TipoArma> armas;

    public InventarioArma() {
        this.armas = new ArrayList<>();
    }    

    public void adicionarArma(TipoArma arma) {    
        this.armas.add(arma);    
    }

    public void removerArma(TipoArma arma) {    
        this.armas.remove(arma);    
    }

    public TipoArma buscarArma(TipoArma arma) {    
        for (TipoArma arm : armas) {    
            if (arm == arma) {    
                return arm;    
            }    
        }    
        return null;
            
    }

    public List<TipoArma> getArmas() {    
        return armas;    
    }



}