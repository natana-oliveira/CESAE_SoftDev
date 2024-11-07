package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numAleat = 31, numAposta;

        System.out.print("Adivinhe o número (1 a 100): ");
        numAposta = input.nextInt();

        if (numAposta < 31) {
            System.out.print("Muito baixo.\nAdivinhe o número (1 a 100): ");
            numAposta = input.nextInt();
            if (numAposta < 31) {
                System.out.print("Muito baixo.\nFicaste sem tentativas...");
            }
            if (numAposta > 31) {
                System.out.println("Muito alto.\nFicaste sem tentativas...");
            }
        }

        if (numAposta > 31) {
            System.out.print("Muito alto.\nAdivinhe o número (1 a 100): ");
            numAposta = input.nextInt();
            if (numAposta < 31) {
                System.out.print("Muito baixo.\nFicaste sem tentativas...");
            }
            if (numAposta > 31) {
                System.out.println("Muito alto.\nFicaste sem tentativas...");
            }
        }

        if (numAposta == 31) {
            System.out.println("Boa!Ganhaste o jogo!");
        }

    }
}
