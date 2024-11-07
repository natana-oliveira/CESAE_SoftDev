package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario;

        // Ler salário
        System.out.print("Salário: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            System.out.println("Taxa 20%: " + (salario * 0.2));
        }

        if (salario > 15000) {
            System.out.println("Taxa30%: " + (salario * 0.3));
        }

    }
}
