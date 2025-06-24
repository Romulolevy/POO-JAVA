package classes.banco;

public class ContaBancaria {
    private String nome;
    private float saldo;
    private boolean especial;

    public ContaBancaria(String nome, float saldo, boolean especial) {
        this.nome = nome;
        this.saldo = 0.0F;
        this.especial = especial;
    }

    @Override
    public String toString(){
        return "nome=" + nome + "\n saldo" + "\n especial=" + (especial?"sim":"nao");
    }
}
