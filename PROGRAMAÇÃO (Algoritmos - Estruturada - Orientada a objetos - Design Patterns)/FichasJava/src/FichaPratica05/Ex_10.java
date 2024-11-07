package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        /* Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo utilizador.
        Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz
         */

        Scanner input = new Scanner(System.in);

        //Declarar matriz
        int[][] matriz = new int[3][5];

        //Ler matriz
        for (int linhas = 0; linhas < 3; linhas++) {
            for (int colunas = 0; colunas < 5; colunas++) {
                System.out.print("Insira um número na matriz : [" + linhas + "][" + colunas + "] ");
                matriz[linhas][colunas] = input.nextInt();
            }
        }

        //Ler numero a pesquisar

/*
        if (colunas == 4) {       //Quando passa para a segunda linha é colocado \n para dar enter
            ordem += "\n";
        }
    }
}

                // Pedir outro valor ao usuario
                int valor,quantMatriz=0;
                System.out.print("Insira um número: ");
                valor=input.nextInt();

                for(int linhas=0;linhas< 3;linhas++){     //Copio porqu volto a matriz para avaliar os valores. Toda vez que tiver que voltar a matriz utilizo novamente
        for(int colunas=0;colunas< 5;colunas++){


        //Comparar o valor com os numeros da tabela

        if(valor==matriz[linhas][colunas]){
        quantMatriz++;
        }
        }
        }

        System.out.println("O numero inserido "+valor+" aparece: "+quantMatriz+" vezes"); //Só apresento quando termina de analisar a matriz e saio dela
*/

        }
        }
