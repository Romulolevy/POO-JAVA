package colecoes.conjunto;

import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Preto");
        System.out.println(conjunto);
        conjunto.add("Azul");
        System.out.println(conjunto);
        conjunto.add("laranja");
        System.out.println(conjunto);
        conjunto.add("cinza");
        System.out.println(conjunto);
        conjunto.add("Rosa");
        System.out.println(conjunto);
        conjunto.add("Vermelho");
        System.out.println(conjunto);
        conjunto.add("Amarelo");
        System.out.println(conjunto);
        conjunto.add("Verde");
        System.out.println(conjunto);
        conjunto.add("Preto");
        System.out.println(conjunto);
        conjunto.add("Branco");
        System.out.println(conjunto);

        System.out.println("Antes: " + conjunto.headSet("Preto"));
        System.out.println("A partir: " + conjunto.tailSet("Preto"));
        System.out.println("Primeira: " + conjunto.first());
        System.out.println("Última: " + conjunto.last());
    }
}
