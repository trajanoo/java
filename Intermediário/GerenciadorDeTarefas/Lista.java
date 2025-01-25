package Intermediário.GerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    List<String> lista = new ArrayList<>();

    public void Adicionar() {
        System.out.println("Digite a tarefa que deseja adicionar:");
        lista.add(sc.nextLine());
    }

    public void Remover() {
        System.out.println("Digite a tarefa que deseja remover:");
        String tarefaRemover = sc.nextLine();

        if(lista.contains(tarefaRemover)) {
            lista.remove(tarefaRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("ERRO: Tarefa não encontrada!");
        }
    }

    public void Listar() {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println("Tarefa nº" + (i + 1) + ": " + lista.get(i));
        }
    }
}
