package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        /*

        Escreva um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
inversa de inserção. Exemplo de execução

         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[14];

        //Inserir numero inteiros - Estrutura de automação para repetir array
        for (int indice = 0; indice < 14; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

         /*
        //Imprimir o vetor sequencia normal
         for (int indice = 0; indice < 14; indice++) {
               System.out.println(vetor[indice]);
        }
*/
        //Imprimir o vetor sequencia invertida
        for (int indice = 13; indice >= 0; indice--) {  //Altero o primeiro indice para o numero final ao inves do primeiro nº.
            // Altero o segundo indice para o numero inicial. Porque a matriz vai do ultimo pro primeiro
            // Ao inves de somar posições, retira-se * -- *
            System.out.println(vetor[indice]);
        }

    }
}
