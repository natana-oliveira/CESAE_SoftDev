package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInserido, ate25 = 0, ate50 = 0, ate75 = 0, ate100 = 0;

        System.out.print("Insira um número: ");
        numInserido = input.nextInt();


        while (numInserido >= 0) {


            if (numInserido <= 25) {
                ate25++; // ate25 = ate25 + 1;
            }

            if (numInserido > 25 && numInserido <= 50) {
                ate50++; // ate50 = ate50 + 1;
            }

            if (numInserido > 50 && numInserido <= 75) {
                ate75++; // ate75 = ate75 + 1;
            }

            if (numInserido > 75 && numInserido <= 100) {
                ate100++; // ate100 = ate100 + 1;
            }

            System.out.print("Insira um número: ");
            numInserido = input.nextInt();
        }

        System.out.println("[00,25]: " + ate25);
        System.out.println("[26,50]: " + ate50);
        System.out.println("[51,75]: " + ate75);
        System.out.println("[76,100]: " + ate100);

    }
}



