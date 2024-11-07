package FichaPratica01;

import java.util.Scanner;

public class Ex_06AUX {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Insira valor 1: ");
        valor1 = input.nextInt();

        //Ler valor2
        System.out.print("Insira valor 2: ");
        valor2 = input.nextInt();

        //Apresentar valor1  e valor2
        System.out.println("\nValor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        //Trocar variáveis

        int aux = valor1;

       // Apresentar valor2 e valor1
        System.out.println("\nValor1: " + valor2);
        System.out.println("Valor2: " + aux);

    }
}
