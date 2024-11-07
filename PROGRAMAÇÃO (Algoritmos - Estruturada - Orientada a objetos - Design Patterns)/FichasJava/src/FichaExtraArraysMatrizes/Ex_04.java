package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];
        int numPesquisar, contador;

        //Inserir números no array
        for (int indice = 0; indice < vetor.length; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Inserir numero a pesquisar
        System.out.print("Número a pesquisar no array: ");
        numPesquisar = input.nextInt();


        //Comparar numero com o array
        boolean encontrado = false;

        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == numPesquisar) {
                encontrado = true;
            }
        }

        //Indicar se o valor existe
        if (encontrado) {

            // imprimir todas as ocorrencias
         //   numPesquisar = vetor[0];

            for (int indice = 0; indice < vetor.length; indice++) {
                if (vetor[indice] == numPesquisar) {
                    System.out.println("Array [" + indice + "]");
                }
            }

            }
        }
    }

