package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {

    ClientController client;
    ArrayList<Venda> todasVendas;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        client = new ClientController("src/test/resources/minimercadoTest.csv");
    }

    @Test
    void produtoMaisCaroTest() {
        assertEquals("Alimentacao", client.produtoMaisCaro().getTipoProduto());
        assertEquals("Bacalhau", client.produtoMaisCaro().getProduto());
        assertEquals(15.99, client.produtoMaisCaro().getPrecoUnitario());
    }

    @Test
    void produtosDisponiveisSemDuplicadosTest() {

        // novo array produtosSemDuplicados é igual o retorno do método produtosDisponiveisSemDuplicados() (o retorno é um array dos produtos sem duplicados)
        ArrayList<Venda> produtosSemDuplicados = client.produtosDisponiveisSemDuplicados();
       todasVendas = client.getTodasVendas(); // Array original de todas as vendas

        // Testa comparando o tamanho das duas listas (devem ser diferentes pois já existem alguns artigos repetidos)
        assertTrue(produtosSemDuplicados.size()!= todasVendas.size());

        // Adiciono produtos repetidos a lista original
        todasVendas.add(new Venda("Alimentacao", "Queijo Serra", 5, 9.5));
        todasVendas.add(new Venda("Higiene", "Amaciador da Roupa", 8, 4.99));
        todasVendas.add(new Venda("Alimentacao", "Tremoços", 50, 0.99));

        produtosSemDuplicados = client.produtosDisponiveisSemDuplicados(); // calculo depois de adicionar os novos produtos repetidos

        assertTrue(produtosSemDuplicados.size()!= todasVendas.size()); // a lista tem que ser diferente do tamanho da original
    }


    @Test
    void produtosDeCategoria() {

        ArrayList<Venda> produtosAlimentacao = client.produtosDeCategoria("Alimentacao"); // novo array produtosAlimentacao é igual o retorno do método produtosDeCategoria() (o retorno é um array dos produtos filtrados pela categoria)
        ArrayList<Venda> produtosHigiene = client.produtosDeCategoria("Higiene");
        ArrayList<Venda> produtosParaCasa = client.produtosDeCategoria("Produtos para Casa");

        assertEquals(5, produtosAlimentacao.size());  //compara a quantidade de produtos por categoria com o tamanho do array filtrado
        assertEquals(5, produtosHigiene.size());
        assertEquals(5, produtosParaCasa.size());
    }

    @Test
    void produtoMaisBarato() {

        assertEquals("Alimentacao", client.produtoMaisBarato().getTipoProduto());
        assertEquals("Cerveja Super Bock", client.produtoMaisBarato().getProduto());
        assertEquals(0.99, client.produtoMaisBarato().getPrecoUnitario());
    }
}