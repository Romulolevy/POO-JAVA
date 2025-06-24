package abstratas.controle.empresa;

public class Fatura implements Pagavel {
        private float preco;
        private int qtd;
        
    public Fatura(float preco, int qtd){
        this.preco = preco;
        this.qtd = qtd;
    }

    public float ObterValorPagamento(){
        return preco * qtd;
    }

    @Override
    public String toString() {
        return "Preço: " + preco + ", Quantidade: " + qtd + ", Valor total: " + ObterValorPagamento();
    }
}
