package PizzariaPequena.Ingredientes;

import PizzariaPequena.Enums.OrigemIngrediente;
import PizzariaPequena.Enums.TipoComplemVegetariano;
import PizzariaPequena.Enums.UnidadeMedida;

public class ComplemVegetariano extends Topping{

    TipoComplemVegetariano tipo;
    public ComplemVegetariano(String id, String nome, UnidadeMedida unidMedida, double kcal, OrigemIngrediente origem, TipoComplemVegetariano tipo) {
        super(id, nome, unidMedida, kcal, origem);
        this.tipo=tipo;
    }
}
