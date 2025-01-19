package Condicoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {

        boolean concluido = false;
        int MAX_NINJAS = 10;
        int ninjasCadastrados = 0;
        String[] ninjas = new String[MAX_NINJAS];
        Scanner scanner = new Scanner(System.in);

        while (!concluido) {

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("\n===== Cadastrar ninja =====");
                System.out.println("Digite o nome do ninja: ");
                String nomeNinja = scanner.nextLine();

                ninjas[ninjasCadastrados] = nomeNinja;
                ninjasCadastrados++;

                if (ninjasCadastrados == MAX_NINJAS) {
                    System.out.println("Limite de ninjas alcançado.");
                }

                break;

            case 2:
                System.out.println("\n===== Lista de ninjas cadastrados =====");

                if(ninjasCadastrados == 0) {
                    System.out.println("Nenhum ninja cadastrado.");
                } else {
                    for(int i = 0; i < ninjasCadastrados; i++) {
                        System.out.println(ninjas[i]);
                    }
                 }
                break;

            case 3:
                System.out.print("Saindo...");
                concluido = true;
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}