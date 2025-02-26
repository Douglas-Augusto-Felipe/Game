package exercicio.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarPersonagem {
    public ArrayList<Personagem> listaPersonagems;
    private Scanner sc;

    public CriarPersonagem() {
        listaPersonagems = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public Personagem criarPersonagem() {
        String name = ""; // Inicializa name para evitar erro de compilação
        Personagem personagem = null;
        while (!name.equals("SAIR")) { // Condição de saída em maiúsculo para evitar erros
            System.out.println("Digite o nome do personagem (ou 'SAIR' para sair): ");
            name = sc.nextLine().toUpperCase(); // Lê a linha inteira, permitindo espaços no nome

            if (!name.equals("SAIR")) { // Verifica se o usuário digitou "SAIR" antes de criar o personagem
                TipoCapacete capac = null;
                while (capac == null) {
                    try {
                        System.out.println("Digite tipo de capacete do personagem: ");
                        String capacete = sc.next().toUpperCase();
                        capac = new TipoCapacete(Capacete.valueOf(capacete));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Tipo de capacete inválido. Tente novamente.");
                    }

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

                    personagem = new Personagem(name, armad, capac, arm);
                }
            }
        }
        return personagem;
        public ArrayList<Personagem> getListaPersonagems() {
            return listaPersonagems;
        }
    }
}