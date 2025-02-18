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

        sc.nextLine();

        TipoCapacete capac = null;
        while (capac == null) {
            try {
                System.out.println("Digite tipo de capacete do personagem: ");
                String capacete = sc.next().toUpperCase();
                capac = TipoCapacete.valueOf(capacete);
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de capacete inválido. Tente novamente.");
            }
        }
        sc.nextLine();

        TipoArmadura armad = null;
        while (armad == null) {
            try {
                System.out.println("Digite tipo de armadura do personagem: ");
                String armadura = sc.next().toUpperCase();
                armad = TipoArmadura.valueOf(armadura);
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de armadura inválido. Tente novamente.");
            }
        }
        sc.nextLine();
        TipoArma arm = null;
        while (arm == null) {
            try {
                System.out.println("Digite tipo de arma do personagem: ");
                String arma = sc.next().toUpperCase();
                arm = TipoArma.valueOf(arma);
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de arma inválido. Tente novamente.");
            }
        }
        sc.nextLine();

        Personagem prs = new Personagem(name);
        prs.getInventarioCapacete().adicionarCapacete(capac);
        prs.getInventarioArmadura().adicionarArmadura(armad);
        prs.getInventarioArma().adicionarArma(arm);
        System.out.println(prs);

    }
}