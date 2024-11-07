package Ex_01;

public class Comida extends Produto{
    public Comida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Comida: " + super.getNome());
    }
}
