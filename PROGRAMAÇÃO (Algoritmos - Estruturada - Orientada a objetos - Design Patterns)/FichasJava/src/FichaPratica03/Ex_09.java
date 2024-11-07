package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero=2, par=2;

        System.out.print("Insira um número: ");
        numero = input.nextInt();


        while (par<=numero) {
            System.out.println(par);
            par = par+2;

        }

    }
}
