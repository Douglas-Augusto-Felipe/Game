package exercicio;

import java.util.List;

import exercicio.model.CriarPersonagem;

import exercicio.model.Personagem;

public class App {
    public static void main(String[] args) {

        CriarPersonagem prs = new CriarPersonagem();
        List<Personagem> lista = prs.criarPersonagem();
        for (Personagem personagem : lista) {
            System.out.println(personagem);
        }
    }
}