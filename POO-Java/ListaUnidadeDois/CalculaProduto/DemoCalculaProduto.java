package ListaUnidadeDois.CalculaProduto;

public class DemoCalculaProduto extends CalculaProduto{
     public static void main(String[] args) {
        System.out.println("Produto de 2, 3, 4: " + produto(2, 3, 4));           
        System.out.println("Produto de 5, 10: " + produto(5, 10));              
        System.out.println("Produto de 7: " + produto(7));                       
        System.out.println("Produto sem argumentos: " + produto());            
        System.out.println("Produto de 1, 2, 3, 4, 5: " + produto(1, 2, 3, 4, 5));
    }
}
