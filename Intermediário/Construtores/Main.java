package Intermediário.Construtores;

public class Main {
    public static void main(String[] args) {
        Livro completo = new Livro("As 48 Leis do Poder", "Stephen King", 1978);
        completo.exibirInformacoes();

        Livro incompleto = new Livro("Os segredos da mente milionária", "T. Harv Eker");
        incompleto.exibirInformacoes();

        Livro vazio = new Livro();
        vazio.exibirInformacoes();

    }
}
