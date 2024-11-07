package FichaPratica05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        //Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int[] vetor = new int[10];

        //Ler vetores
        for (int indice = 0; indice < 10; indice++) { //O indice é o "número da gaveta" (número da coluna)
            System.out.print("Insira um número[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        //Encontrar o menor (fora do ciclo porque quero que o primeiro numero gravado)

        int num;           //variavel criada para comparação
        num=vetor[1];

        for (int indice = 1; indice < 10; indice++) {

            if (vetor[indice] < num) {
                num = vetor[indice];
                System.out.println("Menor foi substituido: " + num);
            }
        }

        //Apresentar o maior
        System.out.println("Menor:" + num);

    }
}
