package PizzariaPequena.Ingredientes;

import PizzariaPequena.Enums.BasePizza;
import PizzariaPequena.Enums.UnidadeMedida;

public class Base extends Ingrediente {
    private BasePizza tipoBase;
    private String descricao;

    public Base(String id, String nome, double kcal, BasePizza tipoBase, String descricao) {
        super(id, nome, UnidadeMedida.Gramas, kcal);
        this.tipoBase=tipoBase;
        this.descricao=descricao;
    }
}
