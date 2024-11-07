package PizzariaPequena.Ingredientes;


import PizzariaPequena.Enums.UnidadeMedida;

public class Ingrediente {

    private String id;
    private String nome;
    UnidadeMedida unidMedida;
    private double kcal;

    public Ingrediente(String id, String nome, UnidadeMedida unidMedida, double kcal) {
        this.id = id;
        this.nome = nome;
        this.unidMedida = unidMedida;
        this.kcal = kcal;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidMedida() {
        return unidMedida;
    }

    public double getKcal() {
        return kcal;
    }


    public void exibirDetalhes(){
        System.out.print("[" + this.id + " | " + this.nome + " | " + this.unidMedida + " | " + this.kcal + " Kcal]");
    }
}
