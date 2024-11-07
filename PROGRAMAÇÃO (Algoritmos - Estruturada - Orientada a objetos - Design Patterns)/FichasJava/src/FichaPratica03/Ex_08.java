package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numInserido, soma, media, quantInseridos = 0;

        System.out.print("Insira um número: ");
        numInserido = input.nextInt();
        soma = numInserido;


        while (numInserido != -1) {
            System.out.print("Insira um número: ");
            numInserido = input.nextInt();

            soma = soma + numInserido;
            quantInseridos = quantInseridos + 1;
        }

        media = (soma+1) / quantInseridos; // Soma + 1 porque a inserção do -1 está a contar quando foi inserido

            if (numInserido == -1) {
                System.out.println("Média: " + media);
            }

        }


}
