package FichaExtraNet;

public class Ex_06 {
    public static void main(String[] args) {
        /*
        Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que
        ele mostre os números um ao lado do outro.
         */

        /*
        System.out.println("PRIMEIRO PROGRAMA (um nº abaixo do outro)");
        for (int num = 1; num <= 20; num++) {
            System.out.println(num);
        }
         */

        System.out.println("SEGUNDO PROGRAMA (um nº ao lado do outro)");

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " "); /*para imprimir os números um ao lado do outro, onde print não adiciona uma
            quebra de linha, e incluímos um espaço após cada número para separá-los. */
        }
    }
}
