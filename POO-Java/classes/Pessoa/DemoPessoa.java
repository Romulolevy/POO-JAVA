package classes.Pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", 1.78);

        System.out.println(pessoa.getNome());

        pessoa.setNome("Carla");

        System.out.println(pessoa.getNome());
    }
}
