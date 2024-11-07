package Ex_01;

public class Pessoa { //class controle de acesso publico

    //Definir atributos de instância (da pessoa)
    private String nome;  // atributos com privados "encapsulamento"
    private int idade;
    private double altura;

    /**
     * Método construtor de Pessoa
     *
     * @param nome
     * @param idade
     * @param altura
     */
    public Pessoa(String nome, int idade, double altura) { // construtor das pessoas
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return altura;
    }

}
