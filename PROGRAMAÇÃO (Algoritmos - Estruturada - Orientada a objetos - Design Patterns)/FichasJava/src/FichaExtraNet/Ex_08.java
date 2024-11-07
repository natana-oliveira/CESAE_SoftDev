package FichaExtraNet;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        /*
        Faça um programa que leia 5 números e informe a soma e a média dos números.
         */

        Scanner input = new Scanner(System.in);

        int quantidadeNumeros = 5, numero, soma=0, media=0;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = input.nextInt();

            soma+=numero;
            media=soma/quantidadeNumeros;
        }
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);

    }
}
