package Teste;

public class FabricaProdutoA implements Fabrica{
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }
}
