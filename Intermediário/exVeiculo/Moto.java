package Intermediário.exVeiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Moto acelerado!");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando!");
    }
}
