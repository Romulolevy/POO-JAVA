package praticapoo;

import java.util.Scanner;

public class Fatoriais {
    
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);
        int n, fat = 1;

        System.out.print("n: ");
        n = leitor.nextInt();

        System.out.println("Fatorial de " + n + " = " + fat);
        for(int i = 2; i<=n; i++){
            fat *= i;
            System.out.println("Fatorial de " + n + " = " + fat);
        }

        leitor.close();
    }

}
