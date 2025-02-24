package exercicio;

import exercicio.model.CriarPersonagem;
import exercicio.model.Personagem;


public class App {
    public static void main(String[] args) {

        CriarPersonagem prs = new CriarPersonagem();
        Personagem personagem = prs.criarPersonagem();
        System.out.println(personagem);
    }
}