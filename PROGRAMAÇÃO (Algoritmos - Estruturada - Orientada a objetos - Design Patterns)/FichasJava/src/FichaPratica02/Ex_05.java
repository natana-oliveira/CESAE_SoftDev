package FichaPratica02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor1, valor2;

        // Ler valor 1
        System.out.print("Insira valor 1: ");
        valor1 = input.nextDouble();

        // Ler valor 2
        System.out.print("Insira valor 2: ");
        valor2 = input.nextDouble();

        if (valor1 > valor2) {
            System.out.println(valor2 + " " + valor1);
        } else {
            System.out.println(valor1 + " " + valor2);
        }

    }
}