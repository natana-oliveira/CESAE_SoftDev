package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valorSecreto, aposta, quantTentativas = 0;

        //Ler valor Secreto
        System.out.print("JOGADOR A:\nInsira um número secreto (entre 0 e 100): ");
        valorSecreto = input.nextDouble();

        //Ler tentativas
            do {
                // Aumentar uma tentativa (iniciou com 0) acada jogada
                quantTentativas++;

                // Ler as apostas
                System.out.print("\nJOGADOR B:\nTente acertar o valor inserido pelo jogador A: ");
                aposta = input.nextDouble();

                // Se o número Secreto for maior
                if (aposta<valorSecreto) {
                    System.out.println("Número secreto é maior\n");
                }

                // Se o número Secreto for menor
                if (aposta>valorSecreto) {
                    System.out.println("Número secreto é menor\n");
                }

            }
            while (aposta!=valorSecreto); // Só para de perguntar tentativas quando os números forem iguais
            System.out.println("PARABÉNS!! Acertou o número secreto");
            System.out.println("Tentou " + quantTentativas + " vezes");
        }

    }

