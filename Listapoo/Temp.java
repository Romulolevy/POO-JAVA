package Listapoo;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double temp;
        System.out.println("Valor em Celcius: ");
        temp = leitor.nextDouble();

        double fahrenheit = convert(temp);

        System.out.println("A temperatura em Celcius e: " + temp);
        System.out.println("EM Fahrenheit e: " + fahrenheit);

        leitor.close();
    }    
    public static double convert(double temp){
        return (temp * 9/5) + 32;
    }
}
