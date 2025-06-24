package praticapoo;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double m, num1, num2, num3;

        System.out.print("Numero 1: ");
        num1 = leitor.nextDouble();
        System.out.print("Numero 2: ");
        num2 = leitor.nextDouble();
        System.out.print("Numero 3: ");
        num3 = leitor.nextDouble();

        m = media(num1, num2, num3);

        System.out.println("Media de " + num1 + ", " + num2 + ", " + num3 + "eh " + m);

        leitor.close();
    }

    public static double media(double n1, double n2, double n3) {
        return (n1+n2+n3)/3;
    }
}
