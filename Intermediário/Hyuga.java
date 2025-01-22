package Intermediário;

public class Hyuga extends Ninja implements Ataque {
    public void Byakugan() {
        System.out.printf("Meu nome é %s! Byakugan ativado! Eu sou uma hyuga!", nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca seu oponente de maneira fodastica!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Eu sou uma hyuga e meu ataque especial é o byakugancxz  tyhgt");
    }
}
