package FichaPratica05;

import java.util.Scanner;

import static FichaPratica06.Ex_05.maiorValorArray;

public class Ex_03 {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];

        //Ler vetores
        int indice;
        for (indice = 0; indice < 10; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        //Encontrar o maior elemento

        //Declarar variável maior
        int maior;
        maior = vetor[0]; //Inicializar o vetor com a primeira posição do array
        //A lógica seria a mesma se fosse maior = vetor [8]. Porque percorre todo o percurso na mesma para descobrir o valor
        //É boa prática inicar no 0

        for (indice = 1; indice < 10; indice++) {

            if (vetor[indice] > maior) {  //Se o meu vetor na posição atual for maior que o vetor
                maior= vetor[indice];    //Reatribui o valor do maior(antigo) para o novo maior
                System.out.println("Maior foi substituido: " + maior);
            }
        }



        //Apresentar o maior
        System.out.println("Maior:" + maior);


    }
}
