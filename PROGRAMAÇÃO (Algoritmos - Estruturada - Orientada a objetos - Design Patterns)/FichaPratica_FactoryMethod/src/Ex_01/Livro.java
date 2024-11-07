package Ex_01;

public class Livro extends Produto{
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Livro: " + super.getNome());
    }
}
