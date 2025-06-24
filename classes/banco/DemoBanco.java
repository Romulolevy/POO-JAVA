package classes.banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro", 3487.89F, true);
        ContaBancaria conta2 = new ContaBancaria("Maria", 0, false);
        System.out.println(conta.toString());
        System.out.println(conta2.toString());
    }
}
