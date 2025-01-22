package Intermediário.DesafioNinja;

public class Main {
    public static void main(String[] args) {

        NinjaBasico figurante = new NinjaBasico("Figurante", 30, "Puxar o cabelo do Madara");
        figurante.mostrarInformacoes();
        figurante.executarHabilidade();

        System.out.println("---------------------------------");

        NinjaAvancado Naruto = new NinjaAvancado("Naruto Uzumaki", 16, "Rasengan", "Sábio dos 6 caminhos");
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
    }
}
