package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, num3;
        String ordem;

        // Ler numeros
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();
        System.out.print("Insira um número: ");
        num2 = input.nextDouble();
        System.out.print("Insira um número: ");
        num3 = input.nextDouble();
        System.out.println("Em que ordem os números devem ser apresentados: \nCrescente (C) ou Decrescente (D)?");
        ordem = input.next();


        switch (ordem) {
            case "D":
                if (num1 > num2 && num2 > num3) {
                    System.out.println("Ordem Decrescente: " + num1 + " " + num2 + " " + num3);
                }

                if (num1 > num3 && num3 > num2) {
                    System.out.println("Ordem Decrescente: " + num1 + " " + num3 + " " + num2);
                }

                if (num2 > num1 && num1 > num3) {
                    System.out.println("Ordem Decrescente: " + num2 + " " + num1 + " " + num3);
                }

                if (num2 > num3 && num3 > num1) {
                    System.out.println("Ordem Decrescente: " + num2 + " " + num3 + " " + num1);
                }

                if (num3 > num1 && num1 > num2) {
                    System.out.println("Ordem Decrescente: " + num3 + " " + num1 + " " + num2);
                }

                if (num3 > num2 && num2 > num1) {
                    System.out.println("Ordem Decrescente: " + num3 + " " + num2 + " " + num1);
                }
                break;

            case "C":
                if (num1 < num2 && num2 < num3) {
                    System.out.println("Ordem Crescente: " + num1 + " " + num2 + " " + num3);
                }

                if (num1 < num3 && num3 < num2) {
                    System.out.println("Ordem Crescente: " + num1 + " " + num3 + " " + num2);
                }

                if (num2 < num1 && num1 < num3) {
                    System.out.println("Ordem Crescente: " + num2 + " " + num1 + " " + num3);
                }

                if (num2 < num3 && num3 < num1) {
                    System.out.println("Ordem Crescente: " + num2 + " " + num3 + " " + num1);
                }

                if (num3 < num1 && num1 < num2) {
                    System.out.println("Ordem Crescente: " + num3 + " " + num1 + " " + num2);
                }

                if (num3 < num2 && num2 < num1) {
                    System.out.println("Ordem Crescente: " + num3 + " " + num2 + " " + num1);
                }
                break;

        }

    }
}