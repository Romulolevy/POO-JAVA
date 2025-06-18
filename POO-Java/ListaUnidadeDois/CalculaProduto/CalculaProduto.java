package ListaUnidadeDois.CalculaProduto;

public class CalculaProduto {

    public static int produto(int... numeros) {
        int resultado = 1;

        if (numeros.length == 0) {
            System.out.println("Nenhum número foi passado. Retornando 0.");
            return 0;
        }

        for (int num : numeros) {
            resultado *= num;
        }

        return resultado;
    }

}

