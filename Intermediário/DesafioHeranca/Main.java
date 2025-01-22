package Intermediário.DesafioHeranca;

public class Main {
    public static void main(String[] args) {
        Uchiha ninja = new Uchiha();

        ninja.nome = "Naruto Uzumaki";
        ninja.idade = 18;
        ninja.missao = "Virar hokage";
        ninja.nivelDificuldade = "Difícil";
        ninja.statusMissao = "Em andamento";
        ninja.habilidadeEspecial = "Kamui";
        ninja.mostrarInformacoes();
    }
}
