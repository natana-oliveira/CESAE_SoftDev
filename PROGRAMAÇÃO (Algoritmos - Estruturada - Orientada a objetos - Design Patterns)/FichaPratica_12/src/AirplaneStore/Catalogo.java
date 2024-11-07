package AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> catalogoAvioes;

    public Catalogo() {
        this.catalogoAvioes = new ArrayList<>();
    }

    // Método para adquirir e vender aviões do catálogo

    public void adquirirAviao(Aviao novoAviao){
        this.catalogoAvioes.add(novoAviao);
    }

    public void venderAviao(int index){
        this.catalogoAvioes.remove(index);
    }

    // Método calcularTotal que calcule todo o valor (€) do catálogo

    public double calcularTotal(){
        double valorTotal=0;

        for (Aviao aviaoAtual : this.catalogoAvioes){
          valorTotal+=  aviaoAtual.getPreco();
        }
        return valorTotal;
    }

    // Método listarCatalogo que imprima todos os aviões disponíveis para venda
    public void imprimirCatalogo(){
        System.out.println("************ Catálogo Aviões ************\n");
        for (Aviao aviaoAtual : this.catalogoAvioes){

            if (aviaoAtual instanceof JatosParticulares){ // Sei que aviaoAtual é Avião e JatoPrivado
                //Se o avião atual for uma instância de JatoPrivado, o avião atual é convertido (cast) para o tipo JatoPrivado.
                JatosParticulares jatoParticularAtual = (JatosParticulares) aviaoAtual;
                jatoParticularAtual.exibirDetalhesJato();
            }

            if (aviaoAtual instanceof AvioesCombate){ //Se o avião atual for uma instância de AvioesCombate
                AvioesCombate aviaoCombateAtual = (AvioesCombate) aviaoAtual; // o avião atual é convertido (cast) para o tipo AvioesCombate
                aviaoCombateAtual.exibirDetalhesAviaoCombate();
            }
        }
    }
}
