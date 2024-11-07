package PizzariaPequena.Ingredientes;

import PizzariaPequena.Enums.OrigemIngrediente;
import PizzariaPequena.Enums.UnidadeMedida;

public class Topping extends Ingrediente {

    private OrigemIngrediente origem;

    public Topping(String id, String nome, UnidadeMedida unidMedida, double kcal, OrigemIngrediente origem) {
        super(id, nome, unidMedida, kcal);
        this.origem = origem;
    }
}
