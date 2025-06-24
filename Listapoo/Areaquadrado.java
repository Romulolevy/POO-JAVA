package Listapoo;

import java.util.Scanner;

public class Areaquadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;
        System.out.println("Valro do lado: ");
        num = leitor.nextInt();

        int area = areaQuad(num);

        System.out.println("A area de " + num + " : " + area );

        leitor.close();
    }

    public static int areaQuad(int lado){
        return lado * lado;
    }
}
