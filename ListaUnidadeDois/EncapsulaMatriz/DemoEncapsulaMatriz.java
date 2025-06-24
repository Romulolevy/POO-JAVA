package ListaUnidadeDois.EncapsulaMatriz;

public class DemoEncapsulaMatriz{
    public static void main(String[] args) {
        float[][] elementos = {
            {1.5f, 2.0f},
            {3.0f, 4.5f}
        };

        EncapsulaMatriz matriz = new EncapsulaMatriz(elementos);

        matriz.imprimirMatriz();

        float determinante = matriz.calcularDeterminante();
        System.out.printf("Determinante: %.2f\n", determinante);
    }
}

