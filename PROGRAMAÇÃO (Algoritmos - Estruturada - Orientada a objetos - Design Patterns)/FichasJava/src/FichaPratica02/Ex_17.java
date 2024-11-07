package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int saldoMed, credEspecial;

        // Ler numeros
        System.out.print("Insira o seu saldo médio: ");
        saldoMed = input.nextInt();


        if (saldoMed <= 2000) {
            System.out.println("SALDO MÉDIO: " + saldoMed);
            System.out.println("VALOR DE CRÉDITO: Nenhum Crédito");
        }

        if (saldoMed > 2000 && saldoMed <= 4000) {
            System.out.println("SALDO MÉDIO: " + saldoMed);
            System.out.println("VALOR DE CRÉDITO (20%): " + (saldoMed * 0.2));
        }

        if (saldoMed > 4000 && saldoMed <= 6000) {
            System.out.println("SALDO MÉDIO: " + saldoMed);
            System.out.println("VALOR DE CRÉDITO (30%): " + (saldoMed * 0.3));
        }

        if (saldoMed > 6000) {
            System.out.println("SALDO MÉDIO: " + saldoMed);
            System.out.println("VALOR DE CRÉDITO (40%): " + (saldoMed*0.4));
        }


    }
}

