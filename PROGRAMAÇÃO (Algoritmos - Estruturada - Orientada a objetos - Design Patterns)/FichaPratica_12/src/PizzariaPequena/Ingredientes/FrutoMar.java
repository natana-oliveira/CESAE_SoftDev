package PizzariaPequena.Ingredientes;

import PizzariaPequena.Enums.OrigemIngrediente;
import PizzariaPequena.Enums.TipoFrutosMar;
import PizzariaPequena.Enums.UnidadeMedida;

public class FrutoMar extends Topping{

    TipoFrutosMar tipo;
    public FrutoMar(String id, String nome, UnidadeMedida unidMedida, double kcal, OrigemIngrediente origem, TipoFrutosMar tipo) {
        super(id, nome, unidMedida, kcal, origem);
        this.tipo=tipo;
    }
}
