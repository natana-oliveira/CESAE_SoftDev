package FichaExtraNet;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        /* Altere o programa anterior para mostrar no final a soma dos números  */

        Scanner input = new Scanner(System.in);

        int num1, num2, soma = 0;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        //Gerar números que estão no intervalo entre eles.

        for (int i = num1 + 1; i <= num2 - 1; i++) {
            System.out.println(i);
        }

        for (int i = num1 + 1; i <= num2 - 1; i++) {
            soma = soma + i;
        }
        System.out.println("Soma dos números no intervalo: " + soma);
    }
}
