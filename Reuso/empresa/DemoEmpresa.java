package Reuso.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Julia", "09872876");
        System.out.println(pessoa);

        Funcionario funcionario = new Funcionario("Paulo", "091738", 5000);
        System.out.println(funcionario);
        
        ChefeDeDepartamento chefe = new ChefeDeDepartamento("Claudio", "09876574", 7000, "Ceo");
        System.out.println(chefe);
    }
}
