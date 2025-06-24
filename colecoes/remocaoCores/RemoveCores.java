package colecoes.remocaoCores;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveCores {
    
    public static void main(String[] args) {
        LinkedList<String> listaCores = new LinkedList<>(Arrays .asList("azul", "amarelo", "cinza", "rosa", "verde", "Vermelho"));
        LinkedList<String> remover = new LinkedList<>(Arrays.asList("azul", "verde", "cinza"));
    

        System.out.println("Lista original: " + listaCores);

        remove(listaCores, remover);
        System.out.println("Lista após remoção: " + listaCores);
    }

    public static void remove(LinkedList<String> listaCompleta, LinkedList<String> listaRemover) {
        Iterator<String> itera = listaCompleta.iterator();

        while (itera.hasNext()) {
            if (listaRemover.contains(itera.next())) {
                itera.remove();
            }
        }
    }
}
