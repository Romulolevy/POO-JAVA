package ListaUnidadeDois.LançaDados;

import java.util.Random;

public class LançaDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencias = new int[13];

        int totalLancamentos = 36000000;

        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = 1 + random.nextInt(6);
            int dado2 = 1 + random.nextInt(6);
            int soma = dado1 + dado2;

            frequencias[soma]++;
        }

        System.out.println("Soma\tFrequência");
        for (int soma = 2; soma <= 12; soma++) {
            System.out.printf("%d\t%d\n", soma, frequencias[soma]);
        }
    }
}
