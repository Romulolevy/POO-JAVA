package Reuso.concessionaria;

public class AutomovelLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelLuxo(String modelo, String cor, int ano, boolean airBag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica){
        super(modelo, cor, ano, airBag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

     public float quantoCusta() {
        float custo = super.quantoCusta();
        if (arCondicionado) custo += 4000.0f;
        if (direcaoHidraulica) custo += 5000.0f;
        return custo;
    }

    @Override
    public String toString() {
        String rep = "ano: " + ano;
        rep += "modelo: " + modelo;
        rep += "cor: " + cor;
        rep += "airbag: " + airBag;
        rep += "radio: " + radio;
        rep += "arCondicionado: " + arCondicionado;
        rep += "direcaoHidraulica: " + direcaoHidraulica;
        return rep;
    }
}
