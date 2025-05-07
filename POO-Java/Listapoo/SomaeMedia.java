package Listapoo;

import java.util.Scanner;

public class SomaeMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double num1, num2, num3;
        System.out.println("Numero 1: ");
        num1 = leitor.nextDouble();
        System.out.println("Numero 2: ");
        num2 = leitor.nextDouble();
        System.out.println("Numero 3: ");
        num3 = leitor.nextDouble();

        double soma = soma(num1, num2, num3);
        double media = soma(num1 , num2, num3);

        System.out.println("A soma : " + soma);
        System.out.println("A media: " + media);


        leitor.close();
    }
    
    public static double soma(double num1, double num2, double num3){
        return (num1 + num2 + num3);
    }
    public static double media(double num1, double num2, double num3){
        return (num1+num2+num3) / 3;
    }
}
