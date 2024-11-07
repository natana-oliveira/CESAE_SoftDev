package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) throws FileNotFoundException {

        /*  Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
imprima o nome da pessoa mais velha na consola.   */

        //Ler o ficheiro
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_06.txt"));

        String nome, linhaAtual, nomeVelho = " ";
        int idade, idadeMaior = 0;

        //Enquanto o ficheiro tiver uma linha para a frente
        while (fileScanner.hasNextLine()) {

            linhaAtual = fileScanner.nextLine(); // Ler a primeira linha
            String[] itensDaLinha = linhaAtual.split(","); // ler os valores dessa linha como array, onde tiver a "," vai ser a separação para um vetor

            nome = itensDaLinha[0]; //O nome e o apelido ficam no vetor 0
            idade = Integer.parseInt(itensDaLinha[1]); //Idade fica no vetor 1, mas é preciso transformar a idade em inteiro pois aqui ela está como string


            if (idade > idadeMaior) { //O número quase sempre vai ser maior que a var "maior"que é = 0
                idadeMaior = idade; // Atualizamos o maior número se encontrarmos um número maior
                nomeVelho = nome; // Ligar o nome da pessoa mais velha com a idade (mesma linha)
            }
        }

        System.out.println("A pessoa mais velha é " + nomeVelho + " com " + idadeMaior + " anos");

    }
}
