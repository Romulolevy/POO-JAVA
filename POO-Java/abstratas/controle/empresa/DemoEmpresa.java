package abstratas.controle.empresa;

public class DemoEmpresa {
    
    public static void main(String[] args) {
        Assalariado a = new Assalariado("Carlos", "hjx13", 1000.0f);
        Fatura f = new Fatura(563.65f, 2);
        imprimeCustoPagamento(a);
        imprimeCustoPagamento(f);
    }

    public static void imprimeCustoPagamento(Pagavel pag){
        System.out.println("Custo de pagamento eh: " + pag.ObterValorPagamento());
    }
}
