package Domain.Propriedade;

/**
 * Classe AcessoriosModa que extend Propriedade
 */
public class AcessoriosModa extends Propriedade{

    private String marca;
    private boolean formal;

    //Construtor de Acessórios de Moda
    public AcessoriosModa(String nomePropriedade, double custo, int estatutoPropriedade, String marca, boolean formal) {
        super(nomePropriedade, custo, estatutoPropriedade);
        this.marca = marca;
        this.formal = formal;
    }

    /**
     * Método para exibir detalhes dos Acessórios de Moda
     */
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.print("  |   Marca: " + this.marca + "\t|  Formal: " + this.formal);
        System.out.println();
    }

    /**
     * Método para identificar se o Acessorio de Moda é formal
     * @return true se for formal
     */
    public boolean isFormal() {
        return true;
    }
}
