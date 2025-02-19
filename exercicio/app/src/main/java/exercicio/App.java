package exercicio;

import java.util.Scanner;

import exercicio.model.Arma;
import exercicio.model.Armadura;
import exercicio.model.Capacete;
import exercicio.model.Personagem;
import exercicio.model.TipoArma;
import exercicio.model.TipoArmadura;
import exercicio.model.TipoCapacete;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do personagem: ");
        String name = sc.next().toUpperCase();

        sc.nextLine();

        TipoCapacete capac = null;
        while (capac == null) {
            try {
                System.out.println("Digite tipo de capacete do personagem: ");
                String capacete = sc.next().toUpperCase();
                capac = new TipoCapacete(Capacete.valueOf(capacete));
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
                armad = new TipoArmadura(Armadura.valueOf(armadura));
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
                arm = new TipoArma(Arma.valueOf(arma));
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de arma inválido. Tente novamente.");
            }
        }
        sc.nextLine();

        Personagem prs = new Personagem(name, armad, capac, arm);
        System.out.println(prs);

        sc.close();

    }
}