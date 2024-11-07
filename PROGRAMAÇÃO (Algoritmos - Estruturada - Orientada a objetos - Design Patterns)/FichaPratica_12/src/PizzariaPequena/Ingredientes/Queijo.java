package PizzariaPequena.Ingredientes;

import PizzariaPequena.Enums.OrigemIngrediente;
import PizzariaPequena.Enums.TipoQueijo;
import PizzariaPequena.Enums.UnidadeMedida;

public class Queijo extends Topping{

    TipoQueijo tipo;
    public Queijo(String id, String nome, UnidadeMedida unidMedida, double kcal, OrigemIngrediente origem, TipoQueijo tipo) {
        super(id, nome, unidMedida, kcal, origem);
        this.tipo=tipo;
    }
}
