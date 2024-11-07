package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

/*
. Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género, duração) para uma matriz.
a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
b. Pesquisar por músicas de um determinado género.
c. Pesquisar músicas de um determinado artista.
d. Pesquisar música com maior duração.
e. Pesquisar músicas com duração acima de um valor especificado.
f. Número de músicas no ficheiro
 */
public class Ex_11 {
    public static void main(String[] args) throws FileNotFoundException {

        //Fazer 1º scanner do arquivo para saber num de linhas
        Scanner lerNumLinhas = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        String linhaAtual;
        double somatorioLinhas = 0;
        int i = 0;

        while (lerNumLinhas.hasNextLine()) {  //Começar a ler o ficheiro
            linhaAtual = lerNumLinhas.nextLine(); // Ler a primeira linha
            somatorioLinhas++;  //Somar as linhas
        }

        lerNumLinhas.close(); // Fechar o primeiro Scanner

        //  System.out.println("Total de linhas: " + somatorioLinhas);

        //Tamanho da Matriz 47x4
        String[][] matriz = new String[47][4];

        //Fazer2º scanner do arquivo para transformar em matriz
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        i = 0; // Reiniciar o índice antes do segundo loop

        while (fileScanner.hasNextLine()) {
            linhaAtual = fileScanner.nextLine();
            String[] itensDaLinha = linhaAtual.split(","); //Transformar em vetores

            // Gerar a matriz
            for (int c = 0; c < 4 && c < itensDaLinha.length; c++) { //i = linhas, c= colunas
                matriz[i][c] = itensDaLinha[c];
            }
            i++;
        }
        fileScanner.close();

     /*   // Imprimir a matriz na consola
        String ordem = "";
        for (int x = 0; x < matriz.length; x++) {
            for (int c = 0; c < matriz[0].length; c++) {
                ordem += matriz[x][c] + "\t";
            }
            ordem += "\n";
        }
        System.out.println(ordem);
        */

        //Criar o menu opção
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n***** Escolha uma das opções abaixo: *****\n");
            System.out.println("1. Pesquisar músicas por um determinado género");
            System.out.println("2. Pesquisar músicas de um determinado artista");
            System.out.println("3. Pesquisar música com maior duração");
            System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
            System.out.println("5. Número de músicas no ficheiro");
            System.out.println("0. Sair");
            System.out.print("\nOpção escolhida: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n1. Pesquisar músicas por um determinado género!");

                    System.out.print("\nEscolha um género: ");
                    String genero = input.next();

                    for (int l = 0; l < matriz.length; l++) { //Passar por todas as linhas
                        for (int col = 0; col < 4; col++) { //Passar por todas as colunas
                            if (matriz[l][2].equalsIgnoreCase(genero)) {
                                System.out.println(matriz[l][col]);
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n2. Pesquisar músicas de um determinado artista!");

                    System.out.print("\nEscolha um artista: ");
                    String artista = input.next();

                    for (int l = 0; l < matriz.length; l++) {
                        for (int col = 0; col < 4; col++) {
                            if (matriz[l][1].equalsIgnoreCase(artista)) {
                                System.out.println(matriz[l][col]);
                            } else {
                                System.out.println("Artista não encontrado!");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n3. Pesquisar música com maior duração!");

                    String duracaoMusica = "";
/*
                    String[] dividirDuracao = duracaoMusica.split(":"); //Transformar em vetores a duração. Min e seg

                    //Transformar os minutos e segundos em inteiros para poder comparar
                    int min = Integer.parseInt(dividirDuracao[0]); //Minutos no vetor [0]
                    int seg = Integer.parseInt(dividirDuracao[1]); //Segundos no no vetor [1]


                    //Indicar qual a maior música
                    int maiorMusica = 0;

                    for (int l = 0; l < matriz.length; l++) {
                        for (int colunas = 0; colunas < 1; colunas++) {
                            if (matriz[l][colunas] > maiorMusica) {
                                maiorMusica = matriz[l][colunas];
                            }
                        }
                    }
                    */
                    break;

                case 4:
                    System.out.println("\n3. Pesquisar músicas com duração acima de um valor especificado!");


                case 5:
                    System.out.println("\n3. Número de músicas no ficheiro!");


                 //  int[][] matrizMusica = new int[][];  //Declarar a matriz

                    // Calculando o número de linhas da matriz
                    int numeroLinhas = matriz.length;

                    // Exibindo o resultado
                    System.out.println("Número de linhas da matriz: " + numeroLinhas);


                case 0:
                    System.out.println("***** SAIR *****");
                    break;
                default:
                    System.out.println("Opção inválida! Tente outra vez.");


            }
        }
            while (opcao != 0) ;


        }
    }





