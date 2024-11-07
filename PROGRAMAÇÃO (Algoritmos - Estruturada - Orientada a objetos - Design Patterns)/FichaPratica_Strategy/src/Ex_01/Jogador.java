package Ex_01;

public class Jogador {
    private String nome;
    private EstrategiaAtaque estrategiaAtaque;

    public Jogador(String nome, EstrategiaAtaque estrategiaAtaque) {
        this.nome = nome;
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar(){
        estrategiaAtaque.atacar();
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }
}
