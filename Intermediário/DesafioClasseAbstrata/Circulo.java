package Intermediário.DesafioClasseAbstrata;

public class Circulo extends Forma {
    int raio;

    @Override
    public void calcularArea() {
        double area = Math.PI * (raio * raio);
        System.out.println("Área: " + area);
    }

    public Circulo(String cor, int raio) {
        this.cor = cor;
        this.raio = raio;
    }

}
