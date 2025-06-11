package ListaUnidadeDois.ClasseEquipamento;

public class Computador extends Equipamento {
    private boolean mouse;
    private boolean teclado;

    public Computador(String nome, double valor, boolean mouse, boolean teclado){
        super(nome, valor);
        this.mouse = mouse;
        this.teclado = teclado;
    }
        
    public boolean getMouse(){
        return mouse;
    }

    public void setMouse(boolean mouse){
        this.mouse = mouse;
    }

    public boolean getTeclado(){
        return teclado;
    }

    public void setTeclado(boolean teclado){
        this.teclado = teclado;
    }

    @Override
    public String toString(){
        return "Mouse: " + (mouse ? "Sim" : "Nao") + "Teclado: " + (teclado ? "Sim" : "Nao") + ", " + super.toString();
    }
}

