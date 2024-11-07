package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatorial, fatDec;

        System.out.print("Escolha um número para calcular o fatorial?:  ");
        fatorial = input.nextInt();

        fatDec = fatorial - 1;

        while (fatDec > 0) { //variável tem que alterar o valor até sair do ciclo

            fatorial *= fatDec; // fatorial = fatorial * fatDec;
            fatDec = fatDec - 1;
        }

        System.out.println("Fatorial = " + fatorial );
    }

}

