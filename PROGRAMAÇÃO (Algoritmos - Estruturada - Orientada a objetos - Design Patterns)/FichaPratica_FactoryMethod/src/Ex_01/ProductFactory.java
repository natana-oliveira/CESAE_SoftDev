package Ex_01;

public class ProductFactory {

    public static Produto criarProduto(String tipoProduto, String nome, double preco){
        tipoProduto=tipoProduto.toLowerCase();

        switch (tipoProduto){
            case "livro":
                return new Livro(nome, preco);

            case "eletronico":
                return new Eletronico(nome, preco);

            case "roupa":
                return new Roupa(nome, preco);

            case "comida":
                return new Comida(nome, preco);

            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: "+tipoProduto);
        }
    }
}
