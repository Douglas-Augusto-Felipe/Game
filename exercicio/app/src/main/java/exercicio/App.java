package exercicio;

import java.util.Scanner;

import exercicio.model.CriarPersonagem;


public class App {
    public static void main(String[] args) {

        CriarPersonagem prs = new CriarPersonagem();
        prs.criarPersonagem();
        System.out.println(prs.listaPersonagems);
    }
}