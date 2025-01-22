package Intermediário.DesafioClasseAbstrata;

public abstract class Forma {
    String cor;

    public abstract void calcularArea();

    public void mostrarCor() {
        System.out.println("Cor: " + cor);
    }
}
