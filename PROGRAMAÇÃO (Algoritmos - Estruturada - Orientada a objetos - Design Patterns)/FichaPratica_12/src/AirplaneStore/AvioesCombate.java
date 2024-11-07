package AirplaneStore;

import AirplaneStore.Enums.Armas;

import java.util.ArrayList;

public class AvioesCombate extends Aviao {

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> arsenal;

    public AvioesCombate(int serial, String modelo, int anoFabrico, double peso, double comprFuselagem, double envergAsas, double altCauda, int numMotores, double autonomia, double velocidadeMaxima, double preço, String paisOrigem, boolean camuflagem) {
        super(serial, modelo, anoFabrico, peso, comprFuselagem, envergAsas, altCauda, numMotores, autonomia, velocidadeMaxima, preço);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<>(3);
    }

    //Método add arma
    public void addArma(Armas armaNova){
        if (this.arsenal.size()<3){
            this.arsenal.add(armaNova);
        }
    }

    //Método remover arma
    public void removeArma(int index){
        this.arsenal.remove(index);
    }

    //Método listar arma na consola
    public void listarArsenal(){
        System.out.println("Arsenal: ");
        System.out.println(this.arsenal);
        System.out.println();
    }

    public void exibirDetalhesAviaoCombate(){
        super.exibirDetalhesAviao();
        System.out.println("País de origem: " + this.paisOrigem);
        System.out.println("Camuflagem: " + this.camuflagem);
        this.listarArsenal();
        System.out.println();
    }
}

