package Reuso.concessionaria;

public class Automovel {
    protected String modelo;
    protected String cor;
    protected int ano;

    public Automovel(String modelo, String cor, int ano){
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public float quantoCusta(){
        float custo = 20000.0f;
        if (ano < 2000) {
            custo -= 5000.0f;
        }
        return custo;
    }
}
