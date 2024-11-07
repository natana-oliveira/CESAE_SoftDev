package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis

        double saldoInicial, movimento, saldoFinal;

        // Ler valores
        System.out.print("Insira o saldo da conta bancária: ");
        saldoInicial= input.nextDouble();

        System.out.print("Insira o montante a creditar/debitar (montante positivo ou negativo, respetivamente): ");
        movimento= input.nextDouble();

        saldoFinal=saldoInicial+movimento;


        if (saldoFinal >= 0) {
            System.out.println("SALDO FINAL: " + saldoFinal);
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA");
        }

    }
}