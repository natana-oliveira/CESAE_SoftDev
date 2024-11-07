package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Introduza um valor de início: ");
        inicio = input.nextInt();
        System.out.print("Introduza um valor de fim: ");
        fim = input.nextInt();

        while (inicio<=fim) {

            if (inicio%5==0) {
                System.out.println(inicio);
            }
            inicio=inicio+1;

        }
    }
}
