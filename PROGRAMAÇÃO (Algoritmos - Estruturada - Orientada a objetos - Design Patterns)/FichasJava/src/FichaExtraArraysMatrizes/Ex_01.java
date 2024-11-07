package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        /*
         Escreva um programa que permita adicionar 14 números inteiros a um array e que os imprima
         pela ordem de inserção. Exemplo de execução
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[14];

        //Inserir numero inteiros - Estrutura de automação para repetir array
        for (int indice = 0; indice < 14; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        //Imprimir o vetor sequencia normal
         for (int indice = 0; indice < 14; indice++) {
               System.out.println(vetor[indice]);
        }


    }
}
