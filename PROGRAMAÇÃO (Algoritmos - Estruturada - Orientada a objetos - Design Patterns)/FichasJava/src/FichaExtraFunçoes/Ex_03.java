package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_03 {

/*
Escreva um método chamado "calcularAreaRetangulo" que recebe a base e a altura de um retângulo como
parâmetros e retorna a área desse retângulo
 */

    /**
     * Método que calcula a área de um retângulo
     * @param base
     * @param altura
     * @return a area
     */

    public static double calcularAreaRetangulo(double base, double altura){

        double area;

        area = base*altura;

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        double base, altura, area;

        System.out.print("Introduza a base do retângulo: ");
        base = input.nextDouble();

        System.out.print("Introduza a altura do retângulo: ");
        altura = input.nextDouble();

        //Apresentar área

        area = calcularAreaRetangulo(base, altura);
        System.out.print("Área do retângulo: " + area);
    }

}
