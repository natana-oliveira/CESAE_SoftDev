package Ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Inventario inventario = new Inventario();


        int opcao;

        do {
            System.out.println("\n\n1. Adicionar Produto");
            System.out.println("2. Imprimir Inventário");
            System.out.println("3. Valor Total");
            System.out.println("0. Sair");
            System.out.print("Opcao: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // adicionar
                    System.out.print("Tipo de Produto [Livro][Eletronico][Roupa][Comida]: ");
                    String tipo = input.next();

                    System.out.print("Nome: ");
                    String nome = input.next();

                    System.out.print("Preço: ");
                    double preco = input.nextDouble();

                    Produto produtoUser = ProductFactory.criarProduto(tipo, nome, preco);
                    inventario.adicionarProduto(produtoUser);
                    break;

                case 2: // imprimir
                    inventario.imprimirInventario();
                    break;

                case 3: // valor total
                    System.out.println("Valor Total do Inventário: "+inventario.calcularTotal()+" €");
                    break;
            }
        } while (opcao != 0);


    }
}
