package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, quantidadeNotas = 0 ;

        // Ler valor
        System.out.print("Insira o valor em €: ");
        valor = input.nextInt();


        if(valor%5==0) { // Valor tem de ser múltiplo de 5
            quantidadeNotas=valor/200;
            System.out.println("Notas de 200: " + quantidadeNotas);
            valor=valor%200;

            quantidadeNotas=valor/100;
            System.out.println("Notas de 100:" + quantidadeNotas);
            valor=valor%100;

            quantidadeNotas=valor/50;
            System.out.println("Notas de 50:" + quantidadeNotas);
            valor=valor%50;

            quantidadeNotas=valor/20;
            System.out.println("Notas de 20:" + quantidadeNotas);
            valor=valor%20;

            quantidadeNotas=valor/10;
            System.out.println("Notas de 10:" + quantidadeNotas);
            valor=valor%10;

            quantidadeNotas=valor/5;
            System.out.println("Notas de 5:" + quantidadeNotas);
        }else {
            System.out.println("O valor " + valor + "não é multiplo de 5");
        }





        }
        }
