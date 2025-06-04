package classes.Faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private int percentualDeCobranca;

    public void inicializaRegistroAcademico(String n, String m, int c, int p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    public double calculaMensalidade(){
        return 100.0*codigoCurso*(percentualDeCobranca/100.0);
    }
}
