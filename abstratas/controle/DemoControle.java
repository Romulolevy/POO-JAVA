package abstratas.controle;

public class DemoControle {
    public static void main(String[] args) {
        Veiculo v1 = new Aviao(0, null, null);
        Veiculo v2 = new Barco(0, 0, null);
        Veiculo v3 = new Carro(0, 0, null);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        Controle controle = new Controle();
        controle.controlar(v1);
        controle.controlar(v2);
        controle.controlar(v3);
    }
}
