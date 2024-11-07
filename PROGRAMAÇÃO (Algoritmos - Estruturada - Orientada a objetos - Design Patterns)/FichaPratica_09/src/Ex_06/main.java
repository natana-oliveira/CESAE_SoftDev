package Ex_06;

import Ex_04.Circulo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Instancia de Calculadora
        Calculadora calculadora = new Calculadora();

        // Declarar variaveis
        double num1, num2;

        // Ler n1
        System.out.print("Insira um numero: ");
        num1 = input.nextDouble();

        // Ler n2
        System.out.print("Insira um numero: ");
        num2 = input.nextDouble();


        // Calcular e apresentar as operações matemáticas
        System.out.println("\n***** Operação 01 *****\nSoma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + calculadora.dividir(num1, num2));


    }
}
