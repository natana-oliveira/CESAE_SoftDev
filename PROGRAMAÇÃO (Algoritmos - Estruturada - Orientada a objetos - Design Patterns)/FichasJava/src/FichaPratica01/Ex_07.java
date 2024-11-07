package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double PProduto1, PProduto2, PProduto3, Discount = 0.1, ValorDisc, PreçoFinal;

        // Ler PProduto1
        System.out.print("Preço do produto 1: ");
        PProduto1= input.nextDouble();

        // Ler PProduto2
        System.out.print("Preço do produto 2: ");
        PProduto2= input.nextDouble();

        // Ler PProduto3
        System.out.print("Preço do produto 3: ");
        PProduto3= input.nextDouble();

        // Calcular o valor do desconto
        ValorDisc = (PProduto1 + PProduto2 + PProduto3) * Discount;

        // Calcular o preço final
        PreçoFinal = (PProduto1 + PProduto2 + PProduto3) - ValorDisc;

        // Apresentar valor a pagar
        System.out.println("Valor a pagar: " + PreçoFinal);


    }
}
