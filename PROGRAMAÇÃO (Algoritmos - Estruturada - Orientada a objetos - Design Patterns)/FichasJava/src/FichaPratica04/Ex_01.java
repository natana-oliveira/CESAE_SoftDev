package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valorA, valorB;
        String operacao, continuar;

        //Ler números
        System.out.print("Insira um número: ");
        valorA= input.nextInt();
        System.out.print("Insira um número: ");
        valorB= input.nextInt();

        do {
            //Ler operação
            System.out.print("Insira uma operação (+-*/): ");
            operacao= input.next();

            switch (operacao){
                case "+":
                    System.out.println("Soma: " + (valorA+valorB));
                    break;
                case "-":
                    System.out.println("Subtração: " + (valorA-valorB));
                    break;
                case "*":
                    System.out.println("Multiplicação: " + (valorA*valorB));
                    break;
                case "/":
                    System.out.println("Divisão: " + (valorA/valorB));
                    break;
                default:
                    System.out.println("Operação inválida!");
            }

            do {
                //repetir operação?
                System.out.println("Deseja continuar? (s/n)");
                continuar= input.next();
            }while(!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("n"));

        }while (continuar.equalsIgnoreCase("s"));

        }
    }

