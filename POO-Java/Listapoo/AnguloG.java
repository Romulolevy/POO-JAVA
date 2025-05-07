package Listapoo;

import java.util.Scanner;

public class AnguloG {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double anguloG;

        System.out.println("Informe o angulo em Graus: ");
        anguloG = leitor.nextDouble();

        double radianos = Math.toRadians(anguloG);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);

        double cossecante = (seno != 0) ? 1.0 / seno : 0;
        double secante = (cosseno != 0) ? 1.0 / cosseno : 0;
        double cotangente = (tangente != 0) ? 1.0 / tangente : 0;

        System.out.printf("Angulo em radiano: %.6f", radianos);
        System.out.printf("Seno: %.6f", seno);
        System.out.printf("Cosseno: %.6f", cosseno);
        System.out.printf("Tangente: %.6f", tangente);
        System.out.printf("Cossecante: %.6f", cossecante);
        System.out.printf("Secante: %.6f", secante);
        System.out.printf("Cotangente: %.6f", cotangente);

        leitor.close();
    }    
}
