package Intermediário.DesafioClasseAbstrata;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Roxo", 15);
        circulo.mostrarCor();
        circulo.calcularArea();

        Retangulo retangulo = new Retangulo("Vermelho", 20, 15);
        retangulo.mostrarCor();
        retangulo.calcularArea();

    }
}
