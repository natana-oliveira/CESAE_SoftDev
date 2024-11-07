package Ex_01;

public class Eletronico extends Produto{
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Produto Categoria Eletronico: " + super.getNome());
    }
}
