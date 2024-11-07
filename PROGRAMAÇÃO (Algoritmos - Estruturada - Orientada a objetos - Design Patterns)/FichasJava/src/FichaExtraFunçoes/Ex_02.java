package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_02 {

/* Implemente uma função double media( ) que recebe três números inteiros como parâmetro e retorna a média aritmética
dos três números.  */

    /**
     * Método para retorna a média aritmética de três números inteiros
     * @param num1
     * @param num2
     * @param num3
     * @return a média
     */
    public static double media(double num1, double num2, double num3){

        double media;

        media = (num1+num2+num3)/3;

        return media;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        double num1, num2, num3, media;

        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();

        System.out.print("Introduza um número: ");
        num2 = input.nextDouble();

        System.out.print("Introduza um número: ");
        num3 = input.nextDouble();

        //Apresentar media

        media = media(num1, num2, num3);
        System.out.print("Media: " + media);

    }

}
