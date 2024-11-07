package Ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    //todo Cada atleta pode participar numa ou mais competições
    public void exibirDetalhesAtleta() {
        System.out.println("Nome: " + this.nome + "\t|  Modalidade: " + this.modalidade + "\t|  País de Origem: " + this.paisOrigem);


    }
}


