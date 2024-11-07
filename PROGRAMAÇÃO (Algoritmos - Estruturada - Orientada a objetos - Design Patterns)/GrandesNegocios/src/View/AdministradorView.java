package View;

import Controllers.AdministradorController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AdministradorView {

    public AdministradorView() {
    }

    public static void menuAdmin() throws IOException {
        Scanner input = new Scanner(System.in);
        AdministradorController adminController = new AdministradorController();

        int opcao = 0;

        do {


            System.out.println("\n********** Bem-Vindo/a Administrador **********");
            System.out.println("1. Analisar qual o produto que vendeu mais unidades");
            System.out.println("2. Analisar qual o produto que gerou mais valor de vendas");
            System.out.println("3. Consultar qual a venda que vendeu mais unidades");
            System.out.println("4. Consultar qual a venda que vendeu mais valor");
            System.out.println("5. Obter o total de todas as vendas");
            System.out.println("6. Obter a média de todas as vendas");
            System.out.println("7. Adicionar novo Utilizador");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*** Analisar qual o produto que vendeu mais unidades ***\n");
                    System.out.print("O produto mais vendido vendeu "+adminController.produtoMaisVendido().getQuantidadeVendida()+" unidades: " );
                    adminController.produtoMaisVendido().exibirDetalhesProduto();

                    break;
                case 2:
                    System.out.println("\n*** Analisar qual o produto que gerou mais valor de vendas ***\n");
                    break;

                case 3:
                    System.out.println("\n*** Consultar qual a venda que vendeu mais unidades ***\n");
                    System.out.print("Vendeu "+adminController.produtoQueMaisVendeu().getQuantidadeVendida()+" ");
                    adminController.produtoQueMaisVendeu().exibirDetalhesProduto();
                    break;

                case 4:

                    System.out.println("\n*** Consultar qual a venda que vendeu mais valor ***\n");
                    adminController.vendaMaisValor().exibirDetalhesProduto();


                    break;

                case 5:
                    System.out.println("\n*** Obter o total de todas as vendas ***\n");
                    System.out.println(adminController.valorVendas()+" €");
                    break;

                case 6:
                    System.out.println("\n*** Obter a média de todas as vendas ***\n");
                    System.out.println(adminController.mediaVendas()+" €");
                    break;

                case 7:
                    String tipoUtilizadorString=null;
                    System.out.println("\n*** Adicionar um novo login ***\n");
                    System.out.println("\n Escolha o tipo de utilizador: ");
                    System.out.println("1. ADMIN");
                    System.out.println("2. FUNC");
                    System.out.println("0. Sair");
                    int tipoUtilizador = input.nextInt();
                    do{
                        switch (tipoUtilizador){
                            case 1:
                                tipoUtilizadorString="ADMIN";
                                break;
                            case 2:
                                tipoUtilizadorString="FUNC";
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Utilizador não contemplado");
                        }
                    }while(tipoUtilizador < 0 || tipoUtilizador > 2);


                    System.out.println("\n Digite o nome do utilizador: ");
                    String nomeUtilizador = input.next();
                    System.out.println("\n Digite a password: ");
                    String password = input.next();

                    adminController.adicionarUtilizador(tipoUtilizadorString,nomeUtilizador,password);

                    break;

                case 0:
                    System.out.println("\n*** Voltar... ***\n");
                    break;


            }

        }while(opcao!=0);

    }
}