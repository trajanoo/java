package Básico.ConceitosBasicos;

public class Array {
    public static void main(String[] args) {
        String[] hokages = new String[3];

        hokages[0] = "Tsunade";
        hokages[1] = "Kakashi";
        hokages[2] = "Naruto";

        hokages = new String[2];
        hokages[0] = "Tobirama";
        hokages[1] = "Hiruzen";
        hokages[2] = "Minato";

        for (int i = 0; i < hokages.length; i++) {
            System.out.println(hokages[i]);
        }
    }
}
