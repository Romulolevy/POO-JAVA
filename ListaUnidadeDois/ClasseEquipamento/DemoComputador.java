package ListaUnidadeDois.ClasseEquipamento;

public class DemoComputador {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Teclado", 200.0f);
        Computador computador = new Computador("teclado", 50.0f, false, false);

        System.out.println(computador);
        System.out.println(equipamento);
    }
}
