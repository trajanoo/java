package Básico.ConceitosBasicos;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner verificador = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = verificador.nextInt();
        String maiorOuMenor = (idade >= 18) ? "é de maior" : "é de menor";

        System.out.printf("Você tem %d anos", idade);
        System.out.println(" logo você " + maiorOuMenor);
        verificador.close();
    }
}
