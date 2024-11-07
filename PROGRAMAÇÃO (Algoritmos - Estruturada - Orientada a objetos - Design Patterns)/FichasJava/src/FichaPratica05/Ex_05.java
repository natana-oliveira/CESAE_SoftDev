package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        //Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];
        int soma = 0, media = 0; //soma é variavel de acumulação

        //Ler vetor
        int indice;
        for (indice = 0; indice < vetor.length; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        for (indice = 0; indice < vetor.length; indice++) {
            //Calcular a soma
            soma += vetor[indice];
        }

        //Calcular a media
        media = soma / vetor.length;

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media dos valores: " + media);
    }
}
