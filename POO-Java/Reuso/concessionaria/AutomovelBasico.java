package Reuso.concessionaria;

public class AutomovelBasico extends Automovel{
    private boolean airBag;
    private boolean radio;

    public AutomovelBasico(String modelo, String cor, int ano, boolean airBag, boolean radio){
        super(modelo, cor, ano);
        this.airBag = airBag;
        this.radio = radio;
    }

    @Override
    public float quantoCusta() {
        float custo = super.quantoCusta();
        if (airBag) custo += 15000;
        if (radio) custo += 2000;
        return custo;
    }
    
}
