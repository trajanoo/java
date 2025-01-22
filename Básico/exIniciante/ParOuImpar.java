package Básico.exIniciante;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        String parOuImpar = num % 2 == 0 ? "par" : "impar";
        System.out.printf("O número " + num + " é %s", parOuImpar);
    }
}
