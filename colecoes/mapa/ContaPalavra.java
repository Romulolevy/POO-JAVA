package colecoes.mapa;

import java.util.TreeMap;

public class ContaPalavra {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Cras consequat libero sit amet mi aliquam sollicitudin Nulla libero lectus laoreet congue pulvinar at pharetra ut lorem Integer sed leo ut urna finibus porttitor Nulla ornare ac ex ac consectetur Sed porta turpis id iaculis aliquam ex massa consectetur elit eu tristique ex eros dapibus eros Etiam rhoncus enim et tellus commodo lobortis pulvinar eget nisl Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos Sed cursus a lorem nec feugiat";

        TreeMap<String, Integer> mapa = new TreeMap<>();
        String palavras[] = texto.split(" ");

        for (String palavra : palavras) {
            String palavraMin = palavra.toLowerCase();

            if (mapa.containsKey(palavra)) {
                int qtd = mapa.get(palavra);
                mapa.put(palavra, qtd + 1);
            } else {
                mapa.put(palavra, 1);
            }
        }

        for (String palavra : mapa.keySet()) {
            System.out.println(palavra + " " + mapa.get(palavra));
        }
    }
}
