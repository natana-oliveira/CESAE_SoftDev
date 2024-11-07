package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double area, raio, pi = 3.14;

        // Ler raio
        System.out.print("Insira o raio da circunferência: ");
        raio = input.nextDouble();

        // Calcular a area
        area = pi * raio * raio;

        // Apresentar a area
        System.out.println("Área da circunferência: " + area);

    }
}
