package Ex_03;

import Ex_02.Pessoa;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga; //Kg
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscosPescados;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.peixesPescados = new ArrayList<>();
        this.mariscosPescados = new ArrayList<>();
    }

    public double getCargaAtual() {  //Calcular a carga atual antes de adicionar mais peixes
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixesPescados) { //um peixe atual para cada posição do meu array
            cargaAtual += peixeAtual.getPeso();  //a carga atual aumenta o peso do peixe
        }

        for (Marisco mariscoAtual : this.mariscosPescados) {
            cargaAtual += mariscoAtual.getPeso();
        }
        return cargaAtual;
    }


    // Método pescarPeixe e adicione o animal. Deve verificar a carga do barco
    public void pescarPeixe(Peixe peixeNovo) {
        if (peixeNovo.getPeso() + this.getCargaAtual() > this.capacidadeCarga) {
            // O Peso do PeixeNovo mais a cargar atual ultrapassam a capacidade carga
            System.out.println("Barco sem capacidade de carga: "+this.getCargaAtual());
            System.out.println(peixeNovo.getPeso()+"Kg. de "+peixeNovo.getEspecie()+" não adicionados");
        } else {
            System.out.println(peixeNovo.getEspecie()+" adicionado");
            this.peixesPescados.add(peixeNovo);
        }
    }

    // Método pescarMarisco

    public void pescarMarisco(Marisco mariscoNovo) {
        if (mariscoNovo.getPeso() + this.getCargaAtual() > this.capacidadeCarga) {
            // O Peso do MariscoNovo mais a cargar atual ultrapassam a capacidade carga
            System.out.println("Barco sem capacidade de carga: "+this.getCargaAtual());
            System.out.println(mariscoNovo.getPeso()+"Kg. de "+mariscoNovo.getEspecie()+" não adicionados");
        } else {
            System.out.println(mariscoNovo.getEspecie()+" adicionado");
            this.mariscosPescados.add(mariscoNovo);
        }
    }

    // Método largarPeixe
    public void largarPeixe(int index) {
        this.peixesPescados.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index)
    }

    // Método largarMarisco
    public void largarMarisco(int index) {
        this.mariscosPescados.remove(index); //nomeDoArray.remove(o que sera retirado, neste caso o index)
    }

    // Método calcularTotal que calcule o total em € dos animais pescados.

    public double calcularPrecoTotal(){
        double precoTotal=0;

        for(Peixe peixeAtual : this.peixesPescados){
            double precoPeixeAtual = peixeAtual.getPeso()*peixeAtual.getPreco();
            precoTotal+=precoPeixeAtual;
        }

        for(Marisco mariscoAtual : this.mariscosPescados){
            double precoMariscoAtual = mariscoAtual.getPeso()*mariscoAtual.getPreco();
            precoTotal+=precoMariscoAtual;
        }

        return precoTotal;
    }


    // Método salarioTripulação, sabendo que o capitão (não conta como tripulante) retira 40% do valor total para gastos/manutenção
    // e salário próprio, sendo que o resultado da função será o restante valor a dividir por cada tripulante

    public double salarioTripulacao(){
        double salario= this.calcularPrecoTotal();

        // Tirar 40% para o capitão
        salario=salario*0.6;

        return salario/this.tripulacao;
    }
}