package FichaPratica06;

import java.util.Scanner;

public class Ex_07 {

    /*      7. Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deverá ser desenhado por uma função para a
     qual são passados três argumentos: caracter a utilizar, número de linhas e número de colunas.
            Segue-se um exemplo do algoritmo a ser executado, ilustrando o pretendido      */

    /**
     * Método que imprime um quadrado
     * @param caracter
     * @param linhas
     * @param colunas
     */
    public static void imprimirQuadrado(String caracter, int linhas, int colunas){

        linhas=linhas-2;

        // Imprimir primeira linha
        for (int i=0; i<colunas;i++){
            System.out.print(caracter);
        }
        System.out.println();

        // Imprimir as linhas do meio
        for(int i=0;i<linhas;i++){
            System.out.print(caracter);

            for(int c=0;c<colunas-2;c++){
                System.out.print(" ");
            }

            System.out.println(caracter);
        }

        // Imprimir ultima linha
        for (int i=0; i<colunas;i++){
            System.out.print(caracter);
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int linhas, colunas;
        String caracter;

        // Ler caracter
        System.out.print("Insira o caracter: ");
        caracter = input.next();

        // Ler linhas
        System.out.print("Insira as linhas: ");
        linhas = input.nextInt();

        // Ler colunas
        System.out.print("Insira as colunas: ");
        colunas = input.nextInt();

        // Imprimir a figura
        imprimirQuadrado(caracter,linhas,colunas);
    }



}
