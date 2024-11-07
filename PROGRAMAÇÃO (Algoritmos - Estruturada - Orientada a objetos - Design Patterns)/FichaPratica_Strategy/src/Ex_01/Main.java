package Ex_01;

public class Main {
    public static void main(String[] args) {

        Jogador player = new Jogador("Pedro", new AtaqueMagico());

        player.atacar();

        player.setEstrategiaAtaque(new AtaqueDistancia());
        player.atacar();
    }
}
