package Domain.Pessoa;

import Domain.Profissao;

import java.util.ArrayList;

/**
 * Classe NPC que extend Pessoa
 */
public class NPC extends Pessoa {

    private int estatutoMinimo;

    public NPC(String nomePersonagem, double dinheiro, int estatutoMinimo) {
        super(nomePersonagem, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }

    public int getEstatutoMinimo() {
        return estatutoMinimo;
    }

    /**
     * Método Exibir detalhes do NPC
     */
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.print("\t| Estatuto Mímimo: " + this.estatutoMinimo);
    }


}

