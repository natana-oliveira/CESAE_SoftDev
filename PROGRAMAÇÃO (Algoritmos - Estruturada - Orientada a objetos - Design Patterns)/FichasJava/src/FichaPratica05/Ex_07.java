package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        //Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par inserido. Caso não exista, deverá informar o utilizador.

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorElementoPar=-1;

        // Ler vetor
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Encontrar um par qualquer para inicializar maiorElementoPar
        for (int indice = 0; indice < vetor.length; indice++) {
            if(vetor[indice]%2==0){
                maiorElementoPar=vetor[indice];
            }
        }

        // Encontrar o maior par
        for (int indice = 0; indice < vetor.length; indice++) {
            if(vetor[indice]>maiorElementoPar && vetor[indice]%2==0){
                maiorElementoPar=vetor[indice];
            }
        }

        if(maiorElementoPar%2==0){
            System.out.println("Maior Par: "+maiorElementoPar);
        }else{
            System.out.println("Não há pares no vetor");
        }



    }
}
