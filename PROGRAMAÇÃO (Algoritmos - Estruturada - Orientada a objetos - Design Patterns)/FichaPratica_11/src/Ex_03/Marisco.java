package Ex_03;

public class Marisco {
    String especie;
    double peso;
    double preco;

    public Marisco(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }

    public void detalhesMarisco(){
        System.out.println("Espécie: " + this.especie);
        System.out.println("Peso: " + this.peso);
        System.out.println("Preço: "+ this.preco);
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }
}
