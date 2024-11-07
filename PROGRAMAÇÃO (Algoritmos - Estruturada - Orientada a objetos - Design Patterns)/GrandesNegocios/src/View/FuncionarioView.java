package View;

import Controllers.ClientController;
import Controllers.FuncionarioController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FuncionarioView {
    public FuncionarioView() {
    }

    public static void menuFuncionario() throws IOException {
        Scanner input = new Scanner(System.in);

        FuncionarioController funcionarioController = new FuncionarioController();

        int opcao = 0;

        do {


            System.out.println("\n********** Bem-Vindo/a Funcionario **********");
            System.out.println("1. Adicionar nova venda");
            System.out.println("2. Consultar stock de um determinado produto");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*** Adicionar nova venda ***\n");
                    System.out.println("Que tipo de produto deseja adicionar nesta venda?");

                    String tipoProduto = input.next();
                    System.out.println("Que produto deseja adicionar nesta venda?");
                    String nomeProduto = input.next();

                    System.out.println("Que quantidade do produto foi vendida?");
                    int quantidadeProduto = input.nextInt();
                    System.out.println("Qual o preço do produto?");
                    double precoProduto = input.nextDouble();
                    funcionarioController.addVenda(tipoProduto,nomeProduto,quantidadeProduto,precoProduto);
                    break;

                case 2:
                    System.out.println("\n*** Consultar stock de um determinado produto ***\n");
                    System.out.println("De que produto deseja consultar o stock?");
                    String nomeProdutoStock = input.next();
                    int stock = funcionarioController.consultarStockProduto(nomeProdutoStock);
                    System.out.println("O stock disponível do produto "+nomeProdutoStock+" é "+ stock+" unidades.");
                    break;

                case 0:
                    System.out.println("\n*** Voltar... ***\n");
                    break;


            }

        }while(opcao!=0);

    }
}