package Reuso.concessionaria;

public class DemoConcessionaria {
    public static void main(String[] args) {
        AutomovelLuxo auto = new AutomovelLuxo("ferrari", "vermelho", 2011, true, true, true, true);
        System.out.println(auto);
        System.out.println(auto.quantoCusta());
    }
}
