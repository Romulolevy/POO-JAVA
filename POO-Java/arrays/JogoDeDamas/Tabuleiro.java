package arrays.JogoDeDamas;

public class Tabuleiro {
    private char tab[][];
    private static final int LIN = 8;
    private static final int COL = 8;

    public Tabuleiro(){
        tab = new char[LIN][COL];
        for (int l = 0; l < tab.length; l++){
            for (int c = 0; c < tab[l].length; c++){
                tab[l][c] = '.';

            }
        }
    }

    for (int 1 = 0; 1 <= 2; 1++){
        for (int c = 1%2; c < tab[1].length)
    }

    @Override
    public String toString() {
        String rep = "";
        for (int l = 0; l < tab.length; l++){
            for (int c = 0; c < tab[0].length; c++){
                rep += tab[l][c] + "";
            }
            rep += "\n";
        }
        return rep;
    }
}
