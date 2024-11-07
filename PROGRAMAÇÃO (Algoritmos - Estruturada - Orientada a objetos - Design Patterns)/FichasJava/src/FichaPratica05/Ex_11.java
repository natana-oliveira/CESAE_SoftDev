package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        /*
        Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
pelo utilizador.
Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir todo o conteúdo da matriz.

         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[][] matriz = new int[3][3];  //Declarar matriz
        String ordem = "";

        for (int linhas = 0; linhas < 3; linhas++) {     //É preciso um ciclo para linhas
            for (int colunas = 0; colunas < 3; colunas++) {  //É preciso um iclo para colunas

                System.out.print("Insira um número na matriz : [" + linhas + "][" + colunas + "] ");
                matriz[linhas][colunas] = input.nextInt();

                ordem += matriz[linhas][colunas] + "\t";      //Apresenta os numeros em sequencia na linha com um TAB

                if (colunas == 2) {       //Quando passa para a segunda linha é colocado \n para dar enter
                    ordem += "\n";
                }
            }
        }

        // Impressão da matriz
        System.out.println(ordem);

        //Indicar qual o maior

        int maior, menor;
        maior = matriz[0][0];

        for (int linhas = 0; linhas < 3; linhas++) {  //Comparando coluna por coluna em cada linha
            for (int colunas = 0; colunas < 3; colunas++) {  //Quando acabar a linha 1 desce para comparar com a linha 2
                if (matriz[linhas][colunas] > maior) {
                    maior = matriz[linhas][colunas];
                }
            }
        }

        //Indicar qual menor

        menor = matriz[0][0];

        for (int linhas = 0; linhas < 3; linhas++) {  //Comparando coluna por coluna em cada linha
            for (int colunas = 0; colunas < 3; colunas++) {  //Quando acabar a linha 1 desce para comparar com a linha 2
                if (matriz[linhas][colunas] < menor) {
                    menor = matriz[linhas][colunas];
                }
            }
        }

        // Apresentar o maior
        System.out.println("O maior valor da matriz é: " + maior);

        // Apresentar o menor
        System.out.println("O menor valor da matriz é: " + menor);


    }
}
