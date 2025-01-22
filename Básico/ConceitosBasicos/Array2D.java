package Básico.ConceitosBasicos;

public class Array2D {
    public static void main(String[] args) {
        String[][] AnimaisEObjetos = new String[2][3];

        AnimaisEObjetos[0][0] = "Animais:";
        AnimaisEObjetos[0][1] = "Vaca";
        AnimaisEObjetos[0][2] = "Cachorro";
        AnimaisEObjetos[1][0] = "Objetos:";
        AnimaisEObjetos[1][1] = "Mesa";
        AnimaisEObjetos[1][2] = "Geladeira";

        for(int i = 0; i < AnimaisEObjetos.length; i++) {
            for(int o = 0; o < AnimaisEObjetos[i].length; o++) {
                System.out.print(AnimaisEObjetos[i][o] + " ");
            }
        }
    }
}
