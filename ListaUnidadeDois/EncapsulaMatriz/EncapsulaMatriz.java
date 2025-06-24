package ListaUnidadeDois.EncapsulaMatriz;

public class EncapsulaMatriz {
    private float[][] matriz;

    public EncapsulaMatriz(float[][] elementos) {
        if (elementos.length != 2 || elementos[0].length != 2 || elementos[1].length != 2) {
            throw new IllegalArgumentException("A matriz deve ser 2x2.");
        }
        matriz = new float[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = elementos[i][j];
            }
        }
    }

    public float calcularDeterminante() {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }

    public void imprimirMatriz() {
        System.out.println("Matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            System.out.printf("[ %.2f %.2f ]\n", matriz[i][0], matriz[i][1]);
        }
    }
}

