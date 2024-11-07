package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, resultado;

        // Ler num1
        System.out.print("Insira o número: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira o número: ");
        num2= input.nextInt();

        // Calcular a soma de num1+num2
        resultado = num1+num2;

        // Apresentar a soma
        System.out.println("Soma: " + resultado);

        // Calcular a subtração de num1+num2
        resultado = num1-num2;

        // Apresentar a subtração
        System.out.println("Subtração: " + resultado);

        // Calcular a multiplicação
        resultado = num1*num2;

        // Apresentar a multiplicação
        System.out.println("Multiplicação: " + resultado);

        // Calcular a divisão de num1+num2
        resultado = num1/num2;

        // Apresentar a divisão
        System.out.println("Divisão: " + resultado);

    }
}
