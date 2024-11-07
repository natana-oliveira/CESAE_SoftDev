package FichaPratica05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        //Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[][] matriz = new int[5][5];  //Declarar matriz
        String ordem = "";
        int soma = 0;

        for (int linhas = 0; linhas < 5; linhas++) {     //É preciso um ciclo para linhas
            for (int colunas = 0; colunas < 5; colunas++) {  //É preciso um iclo para colunas

                System.out.print("Insira um número na matriz : [" + linhas + "][" + colunas + "] ");
                matriz[linhas][colunas] = input.nextInt();

                ordem += matriz[linhas][colunas] + "\t";      //Apresenta os numeros em sequencia na linha com um TAB

                if (colunas == 4) {       //Quando passa para a segunda linha é colocado \n para dar enter
                    ordem += "\n";
                }
                soma += matriz[linhas][colunas];

            }
        }

        System.out.println(ordem);
        System.out.println("Soma: " + soma);
    }
}
