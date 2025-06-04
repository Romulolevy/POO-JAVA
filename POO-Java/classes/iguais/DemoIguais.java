package classes.iguais;

public class DemoIguais {
    public static void main(String[] args) {
        System.out.println(Iguais.iguais("UFERSA", "UFERSA"));

        System.out.println(Iguais.iguais(43, 87));

        System.out.println(Iguais.iguais(56.8, 56.8));

        System.out.println(Iguais.iguais(80.3F, 50.30F));
    }
}
