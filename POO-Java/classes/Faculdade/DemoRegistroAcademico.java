package classes.Faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "20202020", 2, 60);
        double valor = michael.calculaMensalidade();
        System.out.print("O valor: " + valor);

        RegistroAcademico roberto = new RegistroAcademico();
        double valor2 = roberto.calculaMensalidade();
        System.out.print("O valor: " + valor2);
    }
}
