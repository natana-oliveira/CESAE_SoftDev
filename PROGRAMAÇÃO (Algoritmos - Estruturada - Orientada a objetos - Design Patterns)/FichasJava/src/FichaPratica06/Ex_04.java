package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex_03.*;

public class Ex_04 {
/*
Implemente o programa “Análise de um Número” que pergunte um número ao utilizador e, de seguida, apresente um menu de opções
ao utilizador, que permitem analisar o número inserido. Esse menu de opções deve ter o seguinte aspeto:
1. Par ou Ímpar
2. Positivo ou Negativo
3. Primo ou Não Primo
4. Perfeito ou Não Perfeito
5. Triangular ou Não Triangular
6. Trocar de Número
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, opcao;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        do {
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");

            System.out.print("\nInsira a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: //Par ou Ímpar
                    if (par(num)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Ímpar");
                    }
                    break;

                case 2: //Positivo ou Negativo
                    if (positivo(num)) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Negativo");
                    }
                    break;

                case 3: //Primo ou Não Primo
                    if (primo(num)) {
                        System.out.println("Primo");
                    } else {
                        System.out.println("Não primo");
                    }
                    break;

                case 4: //Perfeito ou Não Perfeito
                    if (perfeito(num)) {
                        System.out.println("Perfeito");
                    } else {
                        System.out.println("Não perfeito");
                    }
                    break;

                case 5: //Perfeito ou Não Perfeito
                    if (triangular(num)) {
                        System.out.println("Triangular");
                    } else {
                        System.out.println("Não triangular");
                    }
                    break;

                case 6: //Trocar número
                    System.out.print("Insira um número: ");
                    num = input.nextInt();
                    break;
            }

        } while (opcao != 7);

    }
}

