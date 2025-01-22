package Básico.ConceitosBasicos;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        input.close();

        for(int i = 1; i <= numero; i++) {
            String parOuImpar = i % 2 == 0 ? " é par" : " é impar";
            System.out.println("Número " + i + parOuImpar);
        }
    }
}