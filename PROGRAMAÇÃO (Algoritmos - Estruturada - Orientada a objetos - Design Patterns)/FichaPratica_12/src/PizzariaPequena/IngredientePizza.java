package PizzariaPequena;

import PizzariaPequena.Ingredientes.Ingrediente;

public class IngredientePizza {

  private Ingrediente ingrediente;
  private double quantidade;

    public IngredientePizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        this.ingrediente.exibirDetalhes();
        System.out.print(": " + this.quantidade + " ");

        switch (this.ingrediente.getUnidMedida()){
            case Gramas:
                System.out.println("g.");
                break;

            case Litros:
                System.out.println("L.");
                break;

            case Unidades:
                System.out.println("uni.");
                break;
        }
    }
}
