package Ex_01;

public class Roupa extends Produto{
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Roupa: " + super.getNome());
    }
}
