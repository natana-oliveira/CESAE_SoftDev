package FichaPratica05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        /*
        Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira
junto aos elementos da segunda.
        10LINHAS 2 COLUNAS
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor1 = new int[10];

        //Ler vetor1
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira um número no Vetor 1 [" + indice + "]: ");
            vetor1[indice] = input.nextInt();
        }

        //Ler vetor2
        int[] vetor2 = new int[10];
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira um número no Vetor 2 [" + indice + "]: ");
            vetor2[indice] = input.nextInt();
        }

        // Gerar a matriz
        int[][] matriz = new int[10][2];  //Declarar matriz
        String ordem = "";

        for (int linhas = 0; linhas < 10; linhas++) {    //Liguei numeros vetores com as linhas da matriz
            matriz[linhas][0] = vetor1[linhas];
            matriz[linhas][1] = vetor2[linhas];
        }


        //É preciso entrar na matriz de novo
        for (int linhas = 0; linhas < 10; linhas++) {
            for (int colunas = 0; colunas < 2; colunas++) {

                ordem += matriz[linhas][colunas] + "\t";      //Apresenta os numeros em sequencia na linha com um TAB

                if (colunas == 1) {       //Quando passa para a segunda linha é colocado \n para dar enter
                    ordem += "\n";
                }

            }
        }
        // Impressão da matriz
        System.out.println(ordem);
    }
}

