package FichaPratica07;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static TrabalhoPratico_PE.PE_natanaOliveira.*;

public class MenuADM {


    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizTotal = lerFicheiroParaMatriz("src/TrabalhoPratico_PE/GameStart_V2.csv");

           Scanner input = new Scanner(System.in);
        int menuAdm;

        do {
            System.out.println("\n\n***** ADMINISTRADOR, Bem vindo! *****\n");
            System.out.println("1. Imprimir o relatório");
            System.out.println("2. Imprimir total de vendas e o valor total");
            System.out.println("3. Imprimir o calculo total de lucro (20% de lucro em cada jogo)");
            System.out.println("4. Pesquisar informações associadas a um cliente");
            System.out.println("5. Imprimir o jogo mais caro e os clientes que o compraram");
            System.out.println("0. Sair do menu Administrador");

            System.out.print("\nSelecione a opção desejada: ");
            menuAdm = input.nextInt();

            switch (menuAdm) {

                case 1: // Imprimir o relatório na consola
                    System.out.println("\n***** Imprimir o relatório *****\n");
                    imprimirMatrizConsola(matrizTotal);
                    break;

                case 2: // Imprimir quantas vendas foram executadas e o seu valor total
                    System.out.println("\n***** Imprimir quantas vendas foram executadas e o seu valor total *****");

                    System.out.println("\nVendas executadas: " + (contarLinhasFicheiro("src/TrabalhoPratico_PE/GameStart_V2.csv") - 1)); //-1 linha do cabeçalho
                    System.out.println("Valor total das vendas: " + (valorTotalVendas(matrizTotal)) + " EUR"); //puxar a função de valorTotal
                    break;

                case 3: // Imprimir o calculo total de lucro (20% de lucro em cada jogo)
                    System.out.println("\n***** Imprimir o calculo total de lucro *****");
                    System.out.println("Valor total de lucro: " + lucroTotal(valorTotalVendas(matrizTotal)) + " EUR"); //puxar a função de lucro
                    break;

                case 4: // Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email)
                    System.out.println("\n***** Pesquisar informações associadas a um cliente *****");
                    System.out.print("\nInsira a idCliente: ");
                    input.nextLine();
                    String idCliente = input.nextLine();

                    pesquisarCliente(matrizTotal, idCliente);
                    break;

                case 5: // Imprimir o jogo mais caro e os clientes que o compraram
                    System.out.println("\n***** Imprimir o jogo mais caro e os clientes que o compraram *****");
                  //  jogoMaisCaro(matrizTotal);   NÃO É PRECISO - pois a função compradorJogoMaisCaro já imprime esta
                    String JogoMaisCaro = jogoMaisCaro(matrizTotal);
                    compradorJogoMaisCaro(JogoMaisCaro);
                    break;

                case 0:
                    System.out.println("\nADMIN, obrigado e até a proxima!");
                    break;

                default:
                    System.out.println("\nOpção inválida... Tente outra vez!");
            }
        } while (menuAdm != 0);
    }
}
