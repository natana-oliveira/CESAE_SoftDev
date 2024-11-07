package FichaExtraNet;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        /* Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.  */

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        //Gerar números que estão no intervalo entre eles.

        for (int i = num1+1; i <= num2-1; i++) {
            System.out.println(i);
        }
    }


}
