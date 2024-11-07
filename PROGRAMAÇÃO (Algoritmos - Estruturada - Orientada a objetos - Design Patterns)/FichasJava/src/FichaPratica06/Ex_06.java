package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_03.*;
import static FichaPratica06.Ex_05.*;

public class Ex_06 {

    /*
    6. Implemente o programa “Análise de um Vetor” que pergunte o tamanho do vetor que o utilizador deseja inserir. De seguida, permita ao utilizador preencher o vetor.
    Posteriormente apresente um menu de opções ao utilizador, que permitem analisar o vetor inserido. Esse menu de opções deve ter o seguinte aspeto:
    7. Maior Elemento
    8. Menor Elemento
    9. Crescente ou Não Crescente
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor, indice, opcao;


        //Inserir tamanho do vetor
        System.out.print("Insira o tamanho do vetor que deseja: ");
        tamanhoVetor = input.nextInt();

        int[] vetor = new int[tamanhoVetor];

        //Preencher o vetor
        for (indice = 0; indice < tamanhoVetor; indice++) {
            System.out.print("Insira um número[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        do {
            System.out.println("\n7. Maior elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente ou Não Crescente");
            System.out.println("1. Sair");
            System.out.print("\nInsira a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 7: //Maior elemento
                    System.out.println("\n***** Maior elemento: " + maiorValorArray(vetor) + " *****\n");
                    break;

                case 8: //Menor Elemento
                    System.out.println("\n***** Menor elemento: " + menorValorArray(vetor) + " *****\n");
                    break;

                case 9: //Crescente ou Não Crescente
                    if (crescenteArray(vetor)) {
                        System.out.println("\n***** Crescente *****\n");
                    } else {
                        System.out.println("\n***** Não crescente *****\n");
                    }
                    break;

                case 1://Sair
                    System.out.println("\n***** Obrigado! Até à próxima! *****\n");
                    break;

                default:
                    System.out.println("\n***** Opção inválida! *****\n");
            }

        } while (opcao != 1);

    }
}
