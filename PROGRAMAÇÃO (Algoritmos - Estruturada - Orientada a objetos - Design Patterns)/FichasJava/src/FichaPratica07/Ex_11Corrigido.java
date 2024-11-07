package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11Corrigido {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro
     * @return Número total de Linhas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (fileScanner.hasNextLine()) {
            fileScanner.nextLine(); //Anda a linha pra frente
            contagemLinhas++; //Adiciona a linha a contagem das linhas
        }

        return contagemLinhas; //retorna a contagem das linhas total (com o cabeçalho)
    }

    /**
     * Método que retorna o número de colunas totais de um ficheiro
     *
     * @param caminhoFicheiro
     * @return Número total de colunas
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */

    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        int contagemColunas = 0;

        String linha = fileScanner.nextLine(); //Grava a linha na primeira linha do ficheiro
        String[] itensDaLinha = linha.split(delimitador); //Transformar a linha em array de acordo com delimitador

        contagemColunas = itensDaLinha.length; //O números de colunas é igual o tamanho do array

        return contagemColunas;
    }

    /**
     * Método que armazena numa matriz o conteudo de um ficheiro
     * @param caminhoFicheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner fileScanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro que recebeu como parametro (-1 que é excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ","); //É preciso definir o delimitador

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = fileScanner.nextLine(); //Guardar a linha do cabeçalho
        int linhaMatriz = 0;

        while (fileScanner.hasNextLine()) {
            linhaAtual = fileScanner.nextLine(); //Avançar a linha do cabeçalho e pegar a proxima
            String[] itensDaLinha = linhaAtual.split(",");

            for (int i=0; i<itensDaLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensDaLinha[i];
            }
            linhaMatriz++;  //Soma uma linha na matriz
        }

        return matrizTotal;
    }

    /**
     * Método para imprimir uma matriz na consola
     * @param matriz a imprimir
     */
    public static void imprimirMatrizConsola (String[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println();
        }
    }




}
