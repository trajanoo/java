package Intermediário.DesafioHeranca;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
    }
}
