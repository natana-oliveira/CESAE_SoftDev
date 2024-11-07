package Teste;

public class Main {
    public static void main(String[] args) {

        Fabrica fabricaB = new FabricaProdutoB();
        Produto produtoB = fabricaB.criarProduto();
        produtoB.exibirInfo();

        Fabrica fabricaA = new FabricaProdutoA();
        Produto produtoA = fabricaA.criarProduto();
        produtoA.exibirInfo();

    }
}
