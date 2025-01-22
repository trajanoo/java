package Intermediário.exVeiculo;

public class Main {
    public static void main(String[] args) {

        // Carro
        Carro carro = new Carro();

        carro.acelerar();
        carro.frear();

        // Moto
        Moto moto = new Moto();

        moto.acelerar();
        moto.frear();

        // Bicicleta
        Bicicleta bike = new Bicicleta();

        bike.acelerar();
        bike.frear();

    }
}
