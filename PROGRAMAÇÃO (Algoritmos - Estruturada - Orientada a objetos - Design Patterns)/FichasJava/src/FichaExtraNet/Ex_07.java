package FichaExtraNet;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        /*
        Faça um programa que leia 5 números e informe o maior número.
         */

        Scanner input = new Scanner(System.in);

        int quantidadeNumeros = 5, maior = 0, numero; // Inicializamos a variável 'maior' com o valor mínimo possível

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = input.nextInt();

            if (numero > maior) { //O número quase sempre vai ser maior que a var "maior"que é = 0
                maior = numero; // Atualizamos o maior número se encontrarmos um número maior
            }
        }

        System.out.println("O maior número é: " + maior);


    }
}
