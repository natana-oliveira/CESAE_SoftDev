package FichaPratica05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico:

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[][] matriz = new int[3][3];
        String ordem = "";

        //Ler matriz
        for (int linhas = 0; linhas < 3; linhas++) {     //É preciso um ciclo para linhas
            for (int colunas = 0; colunas < 3; colunas++) {  //É preciso um iclo para colunas
                System.out.print("Insira um número na matriz : [" + linhas + "][" + colunas + "] ");
                matriz[linhas][colunas] = input.nextInt();
            }
        }

        //Imprimir matriz na consola
        for (int linhas = 0; linhas < 3; linhas++) {
            for (int colunas = 0; colunas < 3; colunas++) {


                ordem += matriz[linhas][colunas] + "\t";      //Apresenta os numeros em sequencia na linha com um TAB

                if (colunas == 2) {       //Quando passa para a segunda linha é colocado \n para dar enter
                    ordem += "\n";
                }
            }
        }

        System.out.println(ordem);


        //NUMEROS APRESENTADOS ALINHADOS

       /* for (int linhas = 0; linhas < 3; linhas++) { //O indice é o "número da gaveta" (número da coluna)
            for (int colunas = 0; colunas < 3; colunas++) {
                System.out.print(matriz[linhas][colunas]);
            }
        }
                */
    }
}
