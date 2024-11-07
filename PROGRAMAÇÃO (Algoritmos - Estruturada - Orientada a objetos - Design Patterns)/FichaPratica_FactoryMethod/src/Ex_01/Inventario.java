package Ex_01;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Produto> inventario;

    public Inventario() {
        this.inventario = new ArrayList<>();
    }

    public void adicionarProduto(Produto produtoNovo){
        this.inventario.add(produtoNovo);
    }

    public void imprimirInventario(){
        for(Produto produtoAtual : this.inventario){
            produtoAtual.mostrar();
        }
    }

    public double calcularTotal(){
        double valorTotal = 0;
        for(Produto produtoAtual : this.inventario){
            valorTotal+= produtoAtual.getPreco();
        }
        return valorTotal;
    }
}
