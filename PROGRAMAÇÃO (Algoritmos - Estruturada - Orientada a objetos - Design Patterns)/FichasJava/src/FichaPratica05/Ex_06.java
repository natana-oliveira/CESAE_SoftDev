package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        //Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];
        boolean crescente = true;

        //Ler vetores
        for (int indice = 0; indice < 10; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        for (int indice = 1; indice < 10; indice++) {
            if (vetor[indice] <= vetor[indice - 1]) {
                crescente = false;

            }
        }

        if (crescente) {
            System.out.println("CRESCENTE!");
        } else {
            System.out.println("NÃO CRESCENTE!");
        }
    }
}

