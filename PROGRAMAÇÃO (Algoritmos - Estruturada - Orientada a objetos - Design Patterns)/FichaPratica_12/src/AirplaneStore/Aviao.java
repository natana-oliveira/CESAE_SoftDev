package AirplaneStore;

public class Aviao {

    private int serial;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double comprFuselagem;
    private double envergAsas;
    private double altCauda;
    private int numMotores;
    private double autonomia;
    private double velocidadeMaxima;
    private double preco;

    public Aviao(int serial, String modelo, int anoFabrico, double peso, double comprFuselagem, double envergAsas, double altCauda, int numMotores, double autonomia, double velocidadeMaxima, double preco) {
        this.serial = serial;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comprFuselagem = comprFuselagem;
        this.envergAsas = envergAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhesAviao() {
        System.out.println("*** " + this.modelo + " ***");
        System.out.println("Serial: " + this.serial);
        System.out.println("Ano Fabrico: " + this.anoFabrico);
        System.out.println("Nº Motores: " + this.numMotores);
        System.out.println("Autonomia: " + this.autonomia+" Km.");
        System.out.println("Vel. Máx.: " + this.velocidadeMaxima+" Km/h");
        System.out.println("Preço: " + this.preco+"€");
    }

}
