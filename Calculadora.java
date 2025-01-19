package Condicoes;

import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        int n1 = scanner.nextInt();
        System.out.println("Insira o segundo valor:");
        int n2 = scanner.nextInt();

        scanner.nextLine();

        // operações

        int adicao = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;

        System.out.println("Qual operação deseja realizar? (+, -, *, /)");
        String operacao = scanner.nextLine();

        if(operacao.equals("+")) {
            System.out.println("O resultado é: " + adicao);
        } else if(operacao.equals("-")) {
            System.out.println("O resultado é: " + subtracao);
        } else if(operacao.equals("*")) {
            System.out.println("O resultado é: " + multiplicacao);
        } else if(operacao.equals("/")) {
            System.out.println("O resultado é: " + divisao);
        } else {
            System.out.println("Operação inválida");
        }

        scanner.close();

    }
}
