package praticapoo;
import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");

        //! Somente uma String
        // String nome = entrada.next();

        String nome = entrada.nextLine();
        System.out.println("Bem Vindo(a): " + nome + ".");

        entrada.close();
    }
}
