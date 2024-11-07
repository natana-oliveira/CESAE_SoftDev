package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.print("Introduza uma letra (apenas minúsculas): ");
        letra = input.next();

        switch (letra) {
            case "a":
                System.out.println("VOGAL!");
                break;
            case "e":
                System.out.println("VOGAL!");
                break;
            case "i":
                System.out.println("VOGAL!");
                break;
            case "o":
                System.out.println("VOGAL!");
                break;
            case "u":
                System.out.println("VOGAL!");
                break;

            case "b", "c", "d", "f", "g", "h", "j", "k",
                    "l", "m", "n", "p", "q", "r",
                    "s", "t", "v", "w", "y", "z":
                System.out.println("CONSOANTE!");
                break;

            default:
                System.out.println("ERRO!");
        }

    }
}

