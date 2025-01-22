package Básico.exIniciante;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Segundo valor: ");
        int n2 = sc.nextInt();

        int result = n1 + n2;
        System.out.println("Resultado: " + result);
        sc.close();
    }
}
