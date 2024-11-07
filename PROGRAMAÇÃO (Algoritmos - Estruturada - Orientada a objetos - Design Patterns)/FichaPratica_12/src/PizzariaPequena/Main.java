package PizzariaPequena;

import PizzariaPequena.Enums.OrigemIngrediente;
import PizzariaPequena.Enums.TamanhoPizza;
import PizzariaPequena.Enums.UnidadeMedida;
import PizzariaPequena.Ingredientes.Ingrediente;
import PizzariaPequena.Enums.BasePizza;
import PizzariaPequena.Ingredientes.Base;
import PizzariaPequena.Ingredientes.Topping;


public class Main {
    public static void main(String[] args) {

        // Instanciar ingredientes

        Base baseFina = new Base("I-0011", "Base Fina Italiana", 1.5, BasePizza.MassaFina, "Mais italiana não há");
        Topping queijoMozarella = new Topping("I-0022", "Queijo Mozarella", UnidadeMedida.Gramas, 2.8, OrigemIngrediente.Importado);
        Topping molhoTomate = new Topping("I-0090", "Molho Tomate", UnidadeMedida.Litros, 250, OrigemIngrediente.Importado);
        Topping fiambre = new Topping ("I-0120", "Fiambre Perna Extra", UnidadeMedida.Unidades, 12, OrigemIngrediente.Nacional);
        Topping ananas = new Topping ("I-0100", "Ananás", UnidadeMedida.Unidades, 2, OrigemIngrediente.Nacional);



        /*Ingrediente queijoMozarella = new Ingrediente("I-0022", "Queijo Mozarella", UnidadeMedida.Gramas, 2.8);
        Ingrediente molhoTomate = new Ingrediente("I-0090", "Molho Tomate", UnidadeMedida.Litros, 250);
        Ingrediente fiambre = new Ingrediente("I-0120", "Fiambre Perna Extra", UnidadeMedida.Unidades, 12);
        Ingrediente ananas = new Ingrediente("I-0100", "Ananás", UnidadeMedida.Unidades, 2);*/
        Ingrediente baseAlta = new Ingrediente("I-0012", "Base Alta", UnidadeMedida.Gramas, 2);
        Ingrediente molhoTomateOregaos = new Ingrediente("I-0091", "Molho Tomate c/ Oregãos", UnidadeMedida.Litros, 100);
        Ingrediente queijoSerra = new Ingrediente("I-0023", "Queijo Serra Estrela", UnidadeMedida.Gramas, 10);


        System.out.println();
        // Criar pizza de queijo e fiambre
        Pizza pizzaQueijoFiambre = new Pizza("P-0001", "Pizza de Queijo e Fiambre", "Mais básica impossível", 9.90, TamanhoPizza.Media);

        pizzaQueijoFiambre.addIngredientes(new IngredientePizza(baseFina, 200));
        pizzaQueijoFiambre.addIngredientes(new IngredientePizza(molhoTomate, 0.100));
        pizzaQueijoFiambre.addIngredientes(new IngredientePizza(queijoMozarella, 180));
        pizzaQueijoFiambre.addIngredientes(new IngredientePizza(fiambre, 12));

        pizzaQueijoFiambre.descricaoPizza();
        System.out.println("Kcal Pizza Queijo e Fiambre: " + pizzaQueijoFiambre.kcalPizza());
        System.out.println();

        // Criar pizza havai
        Pizza pizzaHavai = new Pizza("P-0002", "Pizza Havai", "Com todo o ananás que tem direito", 15.50, TamanhoPizza.Grande);

        pizzaHavai.addIngredientes(new IngredientePizza(baseFina, 235));
        pizzaHavai.addIngredientes(new IngredientePizza(molhoTomate, 0.180));
        pizzaHavai.addIngredientes(new IngredientePizza(queijoMozarella, 200));
        pizzaHavai.addIngredientes(new IngredientePizza(ananas, 16));

        pizzaHavai.editarQuantidade(queijoMozarella, 120);

        pizzaHavai.descricaoPizza();
        System.out.println("Kcal Pizza Havai: " + pizzaHavai.kcalPizza());
        System.out.println();

        // Criar a pizza portugal
        Pizza pizzaPortugal = new Pizza(" P1991", " Pizza Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagem pela cultura de Portugal.", 19.90, TamanhoPizza.Grande);
        pizzaPortugal.addIngredientes(new IngredientePizza(baseAlta, 100));
        pizzaPortugal.addIngredientes(new IngredientePizza(queijoSerra, 150));
        pizzaPortugal.addIngredientes(new IngredientePizza(molhoTomateOregaos, 0.200));


        pizzaPortugal.descricaoPizza();
        System.out.println("Kcal Pizza Portugal: " + pizzaPortugal.kcalPizza());


    }
}
