package FichaExtraNet;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        /*
        Desenvolva um procedimento que recebe um número inteiro como argumento e mostra na consola todos os números
        inteiros, até esse número (inclusive). Deve mostrar um número por linha.
         */

        Scanner input = new Scanner(System.in);

        int num, i;

        // Ler numero
        System.out.print("Insira um número: ");
        num= input.nextInt();

        for (i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
