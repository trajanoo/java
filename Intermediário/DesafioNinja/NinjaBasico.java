package Intermediário.DesafioNinja;

public class NinjaBasico implements Ninja {
    String nome, habilidade;
    int idade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + this.nome + " executou sua habilidade '" + this.habilidade + "'");
    }
}