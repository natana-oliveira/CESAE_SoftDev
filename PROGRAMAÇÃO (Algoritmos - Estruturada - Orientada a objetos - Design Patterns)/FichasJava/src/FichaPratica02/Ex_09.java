package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, num3;

        // Ler valores
        System.out.print("Ler número 1: ");
        num1= input.nextInt();

        System.out.print("Ler número 2: ");
        num2= input.nextInt();

        System.out.print("Ler número 3: ");
        num3= input.nextInt();

        if (num1>num3) {
            if (num2>num3) {
                System.out.println("O número menor é: "+num3);
            }
        }

        if (num1>num2) {
            if (num3>num2) {
                System.out.println("O número menor é: "+num2);
            }
        }

        if (num2>num1) {
            if (num3>num1) {
                System.out.println("O número menor é: "+num1);
            }
        }

    }
}
