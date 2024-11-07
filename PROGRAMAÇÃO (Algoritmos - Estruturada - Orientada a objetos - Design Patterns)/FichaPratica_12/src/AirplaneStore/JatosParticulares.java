package AirplaneStore;

import AirplaneStore.Enums.Armas;
import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

import java.util.ArrayList;

public class JatosParticulares extends Aviao{

    private int lotacao;
    private double capBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatosParticulares(int serial, String modelo, int anoFabrico, double peso, double comprFuselagem, double envergAsas, double altCauda, int numMotores, double autonomia, double velocidadeMaxima, double preço, int lotacao, double capBagagem, CategoriaJato categoria) {
        super(serial, modelo, anoFabrico, peso, comprFuselagem, envergAsas, altCauda, numMotores, autonomia, velocidadeMaxima, preço);
        this.lotacao = lotacao;
        this.capBagagem = capBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<>();
    }

    //Método add instalações
    public void addInstalacao(Instalacao novaInstalacao){
        this.instalacoes.add(novaInstalacao);
    }

    //Método remover instalações
    public void removeInstalacao(int index){
        this.instalacoes.remove(index);
    }

    //Método listar instalações na consola
    public void listarInstalacao(){
        System.out.println("Instalações: ");
        System.out.println(this.instalacoes);
        System.out.println();
    }

    public void exibirDetalhesJato() {
        super.exibirDetalhesAviao();
        System.out.println("Lotação: " + this.lotacao);
        System.out.println("Categoria: " + this.categoria);
        this.listarInstalacao();
        System.out.println();
    }
}
