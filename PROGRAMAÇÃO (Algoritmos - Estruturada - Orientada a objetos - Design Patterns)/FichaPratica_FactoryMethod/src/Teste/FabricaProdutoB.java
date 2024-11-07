package Teste;

public class FabricaProdutoB implements Fabrica{
    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }
}
