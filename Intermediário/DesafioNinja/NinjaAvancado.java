package Intermediário.DesafioNinja;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + this.nome + " usou sua habilidade '" + this.habilidade + "' e sua habilidade especial '" + this.especialidade + "'.");

    }
}
