package exercicio.model;

import java.util.List;

public class ListarPersonagem {
    private List<Personagem> listaPersonagems;

    public ListarPersonagem(List<Personagem> listaPersonagems) {
        this.listaPersonagems = listaPersonagems;
    }

    public List<Personagem> getListaPersonagems(List<Personagem> listaPersonagems) {
        return listaPersonagems;
    }

    public void setListaPersonagems(List<Personagem> listaPersonagems) {
        this.listaPersonagems = listaPersonagems;
    }
    public void listarPersonagem() {
        if (!listaPersonagems.isEmpty()) {
            System.out.println("Nenhum personagem criado.");
        } else {
            System.out.println("Lista de personagens: ");
            for (Personagem personagem : listaPersonagems) {
                System.out.println(personagem);
            }
        }
    }
}