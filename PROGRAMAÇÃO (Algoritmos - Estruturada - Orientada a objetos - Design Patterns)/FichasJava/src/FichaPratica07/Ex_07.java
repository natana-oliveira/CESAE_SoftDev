package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {
        /*   Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
número de palavras presentes nesse ficheiro.
         */

        //Ler o ficheiro e fazer scanner para as linhas
        Scanner fileScannerLinha = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        //Declarar as variaveis
        String linha;
        int somatorioLinhas = 0;

        while (fileScannerLinha.hasNextLine()) {  //Começar a ler o ficheiro
            linha = fileScannerLinha.nextLine(); // Ler a primeira linha
            somatorioLinhas++;  //Somar as linhas
        }

        //Ler outro scanner para as palavras. A arquivo não volta pra tras para ler novamente
        Scanner fileScannerPalavra = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        String palavra;
        int somatorioPalavras = 0;

        while (fileScannerPalavra.hasNextLine()) {
            palavra = fileScannerPalavra.nextLine();
            String[] itensDaLinha = palavra.split(" ");

            somatorioPalavras+= itensDaLinha.length;
        }

        System.out.println("Total de linhas: " + somatorioLinhas);
        System.out.println("Total de Palavras: " + somatorioPalavras);

    }
}
