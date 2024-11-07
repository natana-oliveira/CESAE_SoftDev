package Domain.Pessoa;

import Domain.Propriedade.Propriedade;

public abstract class Pessoa {
    protected String nomePersonagem;
    protected double dinheiro;

    /**
     * Super Classe Pessoa
     */
    public Pessoa(String nomePersonagem, double dinheiro) {
        this.nomePersonagem = nomePersonagem;
        this.dinheiro = dinheiro;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * Método Exibir detalhes da Pessoa
     */
    public void exibirDetalhes() {
        System.out.print("Nome: " + this.nomePersonagem + "\t| Dinheiro: " + this.dinheiro + " Galeões");
    }


}
