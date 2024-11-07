package Domain.Propriedade;

/**
 * Classe Veiculo que extend Propriedade
 */
public class Veiculo extends Propriedade{

    private String marca;
    private String modelo;
    public Veiculo(String nomePropriedade, double custo, int estatutoPropriedade, String marca, String modelo) {
        super(nomePropriedade, custo, estatutoPropriedade);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método para exibir detalhes dos Veiculos
     */
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print("  |   Marca: " + this.marca + "\t|  Modelo: " + this.modelo);
        System.out.println();
    }
}