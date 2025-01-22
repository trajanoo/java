package Básico.ConceitosBasicos;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");
        int personagem = scanner.nextInt();

        switch (personagem) {
            case 1:
                System.out.println("Você escolheu o naruto.");

            case 2:
                System.out.println("Você escolheu o sasuke.");

            case 3:
                System.out.println("Você escolheu a sakura");

            default:
                System.out.println("Escolhe direito imbecil");
        }


        scanner.close();
    }
}
