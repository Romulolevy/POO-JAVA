package ListaUnidadeDois.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastraClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID do cliente (número negativo para sair): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha

            if (id < 0) {
                break;
            }

            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha

            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);
        }

        System.out.println("\n=== Lista de Clientes Cadastrados ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        scanner.close();
    }
}

