package Controllers;

import Domain.Venda;
import Repository.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {
    private ArrayList<Venda> todasVendas;

    public ClientController(String path) throws FileNotFoundException {
        VendasRepository repository = new VendasRepository(path);
        this.todasVendas = repository.getVendaArray();
    }

    public ArrayList<Venda> getTodasVendas() {
        return todasVendas;
    }

    public Venda produtoMaisCaro() {
        double precoMaisCaro = 0;
        Venda vendaProdutoMaisCaro = null;

        for (Venda vendaAtual : this.todasVendas) {
            if (vendaAtual.getPrecoUnitario() > precoMaisCaro) {
                precoMaisCaro = vendaAtual.getPrecoUnitario();
                vendaProdutoMaisCaro = vendaAtual;
            }
        }

        return vendaProdutoMaisCaro;
    }

    public ArrayList<Venda> produtosDisponiveisSemDuplicados() {

        ArrayList<Venda> arrayAuxiliar = new ArrayList<>();
        arrayAuxiliar.add(this.todasVendas.get(0));


        for (Venda vendaAtual : this.todasVendas) {
            boolean encontrado = false;

            for (Venda vendaAtualUnica : arrayAuxiliar) {
                if (vendaAtual.getProduto().equals(vendaAtualUnica.getProduto())) {
                    encontrado = true;
                }
            }

            if (!encontrado) {
                arrayAuxiliar.add(vendaAtual);
            }
        }

        return arrayAuxiliar;
    }


    public ArrayList<Venda> produtosDeCategoria(String categoriaFiltro){
        ArrayList<Venda> arrayProdutos = this.produtosDisponiveisSemDuplicados();
        ArrayList<Venda> arrayProdutosFiltrado = new ArrayList<>();

        for(Venda vendaAtual: arrayProdutos){
            if(vendaAtual.getTipoProduto().equals(categoriaFiltro)){
                arrayProdutosFiltrado.add(vendaAtual);
            }
        }
        return arrayProdutosFiltrado;
    }

    public Venda produtoMaisBarato() {
        double precoMaisBarato = this.produtoMaisCaro().getPrecoUnitario();
        Venda vendaProdutoMaisBarato = null;

        for (Venda vendaAtual : this.todasVendas) {
            if (vendaAtual.getPrecoUnitario() < precoMaisBarato) {
                precoMaisBarato = vendaAtual.getPrecoUnitario();
                vendaProdutoMaisBarato = vendaAtual;
            }
        }

        return vendaProdutoMaisBarato;
    }
}