package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor1, valor2, valor3, med, p1 = 0.2, p2 = 0.3, p3= 0.5;

        // Ler valor1
        System.out.print("Insira um número: ");
        valor1= input.nextDouble();

        // Ler valor2
        System.out.print("Insira um número: ");
        valor2 = input.nextDouble();

        // Ler valor3
        System.out.print("Insira um número: ");
        valor3 = input.nextDouble();

        // Calcular a média aritmética
        med = (valor1+valor2+valor3)/3;

       // Calcular a média ponderada
        med = (valor1*p1) + (valor2*p2) + (valor3*p3);

        // Apresentar a média ponderada
        System.out.println("Média Ponderada: " + med);
    }
}
