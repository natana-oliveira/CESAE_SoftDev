package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {


        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double  num1, num2, resultado;
        String operador;

        // Ler valores
        System.out.println("OPERAÇÕES ARITMÉTICAS");

        System.out.print("Insira um número: ");
        num1= input.nextDouble();

        System.out.print("Insira outro número: ");
        num2= input.nextDouble();

        System.out.println("Qual a operação aritmética que quer realizar? ");
        operador= input.next();

        switch (operador) {
            case "+":
                resultado = num1+num2;
                System.out.println("SOMA: " + resultado);
                break;

            case "-":
                resultado = num1-num2;
                System.out.println("SUBTRAÇÃO: " + resultado);
                break;

            case "*":
                resultado = num1*num2;
                System.out.println("MULTIPLICAÇÃO: " + resultado);
                break;

            case "/":
                resultado = num1/num2;
                System.out.println("DIVISÃO: " + resultado);
                break;

            default:
                System.out.println("ERRO");
        }


    }
}
