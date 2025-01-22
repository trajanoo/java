package Intermediário.DesafioClasseAbstrata;

public class Retangulo extends Forma {
    int largura;
    int altura;

    @Override
    public void calcularArea() {
        int area = largura * altura;
        System.out.println("Área: " + area);
    }

    public Retangulo(String cor, int largura, int altura) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }
}
