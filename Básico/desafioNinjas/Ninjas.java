package Básico.desafioNinjas;

public class Ninjas {
    public static void main(String[] args) {

        // Ninja 1:
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 13;
        String missaoNinja1 = "Virar hokage";
        char dificuldadeNinja1 = 'A';
        boolean isComplete = true;

        if(idadeNinja1 < 15) {
            if(dificuldadeNinja1 == 'C' || dificuldadeNinja1 == 'D') {
                isComplete = true;
            } else {
                isComplete = false;
            }
        } else {
            isComplete = true;
        }

        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + missaoNinja1);
        System.out.println("Dificuldade: " + dificuldadeNinja1);
        System.out.println("Concluído: " + isComplete);

        System.out.println("------------------------------------");

        // Ninja 2:
        String nomeNinja2 = "Madara";
        int idadeNinja2 = 63;
        String missaoNinja2 = "Concluir o plano da lua";
        char dificuldadeNinja2 = 'S';
        boolean isComplete2 = false;

        if(idadeNinja2 < 15) {
            if(dificuldadeNinja2 == 'C' || dificuldadeNinja2 == 'D') {
                isComplete2 = true;
            } else {
                isComplete2 = false;
            }
        } else {
            isComplete2 = true;
        }

        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + missaoNinja2);
        System.out.println("Dificuldade: " + dificuldadeNinja2);
        System.out.println("Concluído: " + isComplete2);

        System.out.println("------------------------------------");

        // Ninja 3:
        String nomeNinja3 = "Itachi";
        int idadeNinja3 = 18;
        String missaoNinja3 = "Exterminar o clã";
        char dificuldadeNinja3 = 'B';
        boolean isComplete3 = true;

        if(idadeNinja3 < 15) {
            if(dificuldadeNinja3 == 'C' || dificuldadeNinja3 == 'D') {
                isComplete3 = true;
            } else {
                isComplete3 = false;
            }
        } else {
            isComplete3 = true;
        }

        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + missaoNinja3);
        System.out.println("Dificuldade: " + dificuldadeNinja3);
        System.out.println("Concluído: " + isComplete3);

    }
}