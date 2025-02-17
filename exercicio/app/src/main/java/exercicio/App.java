package exercicio;

import java.util.Scanner;


import exercicio.model.Personagem;
import exercicio.model.TipoArma;
import exercicio.model.TipoArmadura;
import exercicio.model.TipoCapacete;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do personagem: ");
        String name = sc.next();
        System.out.println("Digite tipo de capacete do personagem: ");
        String capacete = sc.next();
        TipoCapacete capac = TipoCapacete.valueOf(capacete);
        System.out.println("Digite a armadura do personagem: ");
        String armadura = sc.next();
        TipoArmadura armad = TipoArmadura.valueOf(armadura);
        System.out.println("Digite a arma do personagem: ");
        String arma = sc.next().toUpperCase();
        TipoArma arm = TipoArma.valueOf(arma);

        Personagem prs = new Personagem(name, capac, armad, arm);
        System.out.println(prs);

    }
}