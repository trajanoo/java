package Intermediário.GerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean working = true;
        Lista tarefa = new Lista();

        while (working) {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Listar Tarefas");
            System.out.println("4 - Sair");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    tarefa.Adicionar();
                    break;
                case 2:
                    tarefa.Remover();
                    break;
                case 3:
                    tarefa.Listar();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    working = false;
                    break;

                default:
                    System.out.println("Escolha uma opção válida.");
            }
        }



    }
}
