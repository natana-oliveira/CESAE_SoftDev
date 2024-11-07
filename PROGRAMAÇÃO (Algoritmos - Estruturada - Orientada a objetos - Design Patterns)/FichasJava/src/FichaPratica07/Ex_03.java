package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.imprimirFicheiro;

public class Ex_03 {
    /*
    Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro arquivo
     */
    public static void main(String[] args) throws FileNotFoundException {

        //Fazer scanner do arquivo 
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_03.txt"));

        //Ler o arquivo
        String linha;

        // Criar o novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_03_01.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        while (fileScanner.hasNextLine()) { //o scanner está na primeira linha, se o arquivo tiver outra linha pra frente (baixo) entra no ciclo
            linha = fileScanner.nextLine();  // linha no novo arquivo é igual linha 1 no arquivo original
            escritaNoFicheiro.println(linha);//imprime a linha no novo arquivo
        }

        escritaNoFicheiro.close();

    }
}
