package PizzariaPequena.Ingredientes;

import PizzariaPequena.Enums.OrigemIngrediente;
import PizzariaPequena.Enums.TipoCarne;
import PizzariaPequena.Enums.UnidadeMedida;

public class Carne extends Topping{

    TipoCarne tipo;
    public Carne(String id, String nome, UnidadeMedida unidMedida, double kcal, OrigemIngrediente origem, TipoCarne tipo) {
        super(id, nome, unidMedida, kcal, origem);
        this.tipo=tipo;
    }
}
