package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex_08 {
    /*  Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas as linhas que contêm
uma palavra específica num outro ficheiro. */
    public static void main(String[] args) throws FileNotFoundException {

        //Fazer scanner do arquivo
        Scanner in = new Scanner(new File("Ficheiros/exercicio_08.txt"));

        // criar novo ficheiro
        File newFile = new File("Ficheiros/exercicio_08_new.txt");
        PrintWriter printWriter = new PrintWriter(newFile);

        // declarar variaveis
        String linha, palavra = "Vitor";
        boolean encontrei = false;

        // ler linha atraves do scanner input e escrever no newFile atraves da linha
        while (in.hasNextLine()) {
            linha = in.nextLine();
            String[] itensDaLinha = linha.split(" ");

            // verificar se na linha encontra uma palavra igual
            for (int i = 0; i < itensDaLinha.length; i++) {
                if (itensDaLinha[i].equals(palavra)) {
                    encontrei = true;
                }
            }
            if (encontrei) {
                printWriter.println(linha);
            }
            encontrei = false;
        }
        printWriter.close();
    }
}

/*

        String linha, palavraAtual, palavraEspecifica = "uma";

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        while (fileScanner.hasNextLine()) { //o scanner está na primeira linha, se o arquivo tiver outra linha pra frente (baixo) entra no ciclo
            linha = fileScanner.nextLine();
            palavraAtual = fileScanner.next();

            if (palavraAtual == palavraEspecifica) {
                escritaNoFicheiro.println(linha);//imprime a linha no novo arquivo
            }
        }
        escritaNoFicheiro.close();
        */

