package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double lado1, lado2, area, perimetro;

        // Ler lado1
        System.out.print("Insira a dimensão do comprimento: ");
        lado1 = input.nextDouble();

        // Ler lado2
        System.out.print("Insira a dimensão da largura: ");
        lado2 = input.nextDouble();

        // Ler perimetro
        perimetro = 2 * (lado1 + lado2);

        // Apresentar perimetro
        System.out.println("Perímetro: " + perimetro);

        // Ler area
        area = lado1 * lado2;

        // Apresentar area
        System.out.println("Área: " + area);

    }
}
