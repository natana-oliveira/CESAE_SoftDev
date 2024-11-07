package Controllers;

import Domain.Venda;
import Repository.VendasRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdministradorController {
    private ArrayList<Venda> todasVendas;

    public AdministradorController(String path) throws FileNotFoundException {
        VendasRepository repository = new VendasRepository(path);
        this.todasVendas = repository.getVendaArray();
    }
    public Venda produtoMaisVendido() {

        double quantidadeProdutoMaisVendido = 0;
        Venda vendaProdutoMaisVendido = null;

        ArrayList<Venda> vendasLinhasTotais = new ArrayList<>();

        //criação vetor produtos sem repetidos
        for (Venda vendaAtual : this.todasVendas) {
            double quantidadeTotal = 0;
            for (Venda vendaIterador : this.todasVendas) {
                if (vendaAtual.getProduto().equalsIgnoreCase(vendaIterador.getProduto())) {
                    quantidadeTotal += vendaIterador.getQuantidadeVendida();
                }
            }
            Venda vendaFicticia = new Venda(vendaAtual.getTipoProduto(), vendaAtual.getProduto(), quantidadeTotal, vendaAtual.getPrecoUnitario());
            vendasLinhasTotais.add(vendaFicticia);
        }

        for (Venda vendaAtual : vendasLinhasTotais) {
            if (vendaAtual.getQuantidadeVendida() > quantidadeProdutoMaisVendido) {
                vendaProdutoMaisVendido = vendaAtual;
                quantidadeProdutoMaisVendido=vendaAtual.getQuantidadeVendida();
            }
        }
        return vendaProdutoMaisVendido;
    }

    public Venda produtoQueMaisVendeu() {
        double quantidadeVendida = 0;
        Venda produtoMaisVendido = null;
        for (Venda vendaAtual : this.todasVendas) {
            if (vendaAtual.getQuantidadeVendida() > quantidadeVendida) {
                quantidadeVendida = vendaAtual.getQuantidadeVendida();
                produtoMaisVendido = vendaAtual;
            }
        }
        return produtoMaisVendido;
    }

    public Venda vendaMaisValor() {
        double maiorValorTotal = 0;
        Venda produtoMaisValor = null;
        for (Venda vendaAtual : this.todasVendas) {
            if (vendaAtual.getQuantidadeVendida() * vendaAtual.getPrecoUnitario() > maiorValorTotal) {
                maiorValorTotal = vendaAtual.getQuantidadeVendida() * vendaAtual.getPrecoUnitario();
                produtoMaisValor = vendaAtual;
            }
        }
        return produtoMaisValor;
    }

    public  void adicionarUtilizador(String tipoUtilizador, String username, String password, String filePath) throws IOException, IOException {
        File file = new File(filePath);
        FileWriter fW = new FileWriter(file,true);

        fW.append("\n" + tipoUtilizador + ";" + username + ";" + password);
        fW.close();
    }


    public double valorVendas (){
        double somaVendas=0;

        for (Venda vendaAtual: this.todasVendas) {
            somaVendas += vendaAtual.getPrecoUnitario()*vendaAtual.getQuantidadeVendida();
        }
        return somaVendas;
    }


    public double mediaVendas (){
        double media = 0;
        double total= this.valorVendas();

        media=total/this.todasVendas.size();

        return media;
    }
}