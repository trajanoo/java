package Básico.ConceitosBasicos;

import java.util.Random;
import java.util.Scanner;

    public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100);
        int tentativas = 0;

        while(true) {
            System.out.println("Adivinhe o número secreto: ");
            int numeroUsuario = scanner.nextInt();
            tentativas++;

            if(numeroUsuario == numeroSecreto) {
                System.out.printf("Parabéns! Você acertou em %d tentativas.", tentativas);
                break;
            } else if (numeroUsuario > numeroSecreto){
                System.out.println("Número incorreto. Tente um valor menor");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("Número incorreto. Tente um valor maior");
            }
        }

        scanner.close();
    }
}