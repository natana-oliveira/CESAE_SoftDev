package PizzariaPequena;

import PizzariaPequena.Enums.TamanhoPizza;
import PizzariaPequena.Ingredientes.Base;
import PizzariaPequena.Ingredientes.*;


import java.util.ArrayList;

public class Pizza {
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> composicao;

    public Pizza(String id, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.composicao = new ArrayList<>();
    }


    public void addIngredientes(IngredientePizza ingredientePizzaNovo) {

        // Condição para avaliar se o primeiro elemento a ser inserido é Base
        if (this.composicao.size() == 0 && ingredientePizzaNovo.getIngrediente() instanceof Base) {
            this.composicao.add(ingredientePizzaNovo);
        }

        // Condição para avaliar se o todos os elementos que não o primeiro são do tipo Topping
        if (this.composicao.size() > 0 && this.composicao.size() < 5 && ingredientePizzaNovo.getIngrediente() instanceof Topping) {
            this.composicao.add(ingredientePizzaNovo);
        }
    }

    /**
     * Método para trocar a quantidade de um dado IngredientePizza
     *
     * @param ingrediente
     * @param novaQuant
     */
    public void editarQuantidade(Ingrediente ingrediente, double novaQuant) {

        // Iterar todos os IngredientesPizza
        for (IngredientePizza ingredientePizzaAtual : this.composicao) {

            // Se o Ingrediente do IngredientePizza for igual ao passado por parâmetro
            if (ingredientePizzaAtual.getIngrediente().equals(ingrediente)) {
                // Mudamos a quantidade do IngredientePizza atual
                ingredientePizzaAtual.setQuantidade(novaQuant);
            }
        }
    }

    /**
     * Método para remover um ingrediente da Pizza
     *
     * @param idIngredRemover
     */
    public void removerIngrediente(String idIngredRemover) {


        for (IngredientePizza ingredientePizzaAtual : this.composicao) {// percorrer todos os elementos na lista composicao

            // Verificar se o código do IngredientePizza atual é igual ao código a ser removido
            if (ingredientePizzaAtual.getIngrediente().getId().equals(idIngredRemover)) {
                this.composicao.remove(ingredientePizzaAtual);
            }
        }
    }

    /**
     * Método para calcular as calorias de uma pizza
     *
     * @return kcalTotais
     */

    public double kcalPizza() {
        double kcalTotais = 0;

        for (IngredientePizza ingredientePizzaAtual : this.composicao) {// percorrer todos os elementos na lista composicao

            // Obter a quantidade do IngredientePizza atual
            double quantIngredienteAtual = ingredientePizzaAtual.getQuantidade();
            // Obter as calorias por unidade de medida do Ingrediente associado ao IngredientePizza
            double kcalPorQuantIngredAtual = ingredientePizzaAtual.getIngrediente().getKcal();

            // Calcular as calorias do IngredientePizza atual
            double kcalIngredienteAtual = quantIngredienteAtual * kcalPorQuantIngredAtual;

            // Adicionar as calorias do IngredientePizza atual às calorias totais
            kcalTotais += kcalIngredienteAtual;

        }
        return kcalTotais;
    }


    public String tipoPizza() {

        int contadorCarne = 0, contadorMar = 0, contadorQueijo = 0, contadorVegetariano = 0;
        int quantToppins = this.composicao.size() - 1; // quantidade de toppings é o tamanho do array -1 que é a base ja escolhida

        for (IngredientePizza ingredientePizzaAtual : this.composicao) {
            if (ingredientePizzaAtual.getIngrediente() instanceof Queijo) {
                contadorQueijo++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Carne) {
                contadorCarne++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof FrutoMar) {
                contadorMar++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof ComplemVegetariano) {
                contadorVegetariano++;
            }
        }

        if (contadorCarne == quantToppins) {
            return "Carne";
        } else if (contadorMar == quantToppins) {
            return "Mar";
        } else if (contadorVegetariano == quantToppins) {
            return "Vegetariana";
        } else if (contadorCarne>=1 && contadorVegetariano>=1 && contadorQueijo>=1){
            return "Completa";
        } else
            return "Mista";
    }


    public void descricaoPizza() {
        int contador = 1;
        System.out.println("**********************************************************");
        System.out.println("*************** " + this.nome + " ***************");
        System.out.println("Código: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanho);

        for (IngredientePizza ingredientePizzaAtual : this.composicao) {
            System.out.print("Ingrediente " + contador++ + ": ");
            ingredientePizzaAtual.exibirDetalhes();
        }
        System.out.println();
    }
}

