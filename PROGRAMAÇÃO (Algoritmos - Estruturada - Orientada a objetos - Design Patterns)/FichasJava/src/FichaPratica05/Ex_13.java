package FichaPratica05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        /*
        Escreva um programa que lê uma matriz de tamanho 4x4 e encontra a soma dos elementos da diagonal principal.
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[][] matriz = new int[4][4];  //Declarar matriz
        String ordem = "";

        for (int linhas = 0; linhas < 4; linhas++) {     //É preciso um ciclo para linhas
            for (int colunas = 0; colunas < 4; colunas++) {  //É preciso um iclo para colunas

                System.out.print("Insira um número na matriz : [" + linhas + "][" + colunas + "] ");
                matriz[linhas][colunas] = input.nextInt();

                ordem += matriz[linhas][colunas] + "\t";      //Apresenta os numeros em sequencia na linha com um TAB

                if (colunas == 3) {       //Quando passa para a segunda linha é colocado \n para dar enter
                    ordem += "\n";
                }
            }
        }

        // Impressão da matriz **************** NÃO É PRECISO, Só pra ficar mais claro
        System.out.println(ordem);


        //Encontrar a soma dos elementos da diagonal principal
        int somaDiagonal = 0;

        //somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
        //A soma vai ser sempre o numero da linha e da coluna igual e vai sempre acrescentar um valor. Por isso posso transformar em uma variável
        //i=linhas;


        for (int i = 0; i < 4; i++) {
            somaDiagonal += matriz[i][i];
        }


        System.out.println("Soma diagonal: " + somaDiagonal);

    }
}