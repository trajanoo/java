package Intermediário.Construtores;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    // Construtor completo
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Construtor com título e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
    }

    //Construtor vazio
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
    }
}
