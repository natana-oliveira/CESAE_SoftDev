package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_08 {

    /*     Implemente um método vogal( ) que aceita uma String como parâmetro e retorna true se for uma vogal ou
falso caso contrário. Deve tratar devidamente as minúsculas/maiúsculas.
Exemplo de execução:
- Introduza uma letra: A
- Vogal
     */

    /**
     * Método para identificar uma vogal
     * @param letra
     */
    public static void vogal(String letra) {

        letra = letra.toLowerCase();

        switch (letra) {

            case "a", "e", "i", "o", "u":
                System.out.println("VOGAL");
                break;

            case "b", "c", "d", "f", "g", "h", "j", "k",
                    "l", "m", "n", "p", "q", "r",
                    "s", "t", "v", "w", "y", "z":
                System.out.println("CONSOANTE!");
                break;

            default:
                System.out.println("ERRO!\nLetra desconhecida");
        }
    }


        public static void main (String[]args){

            Scanner input = new Scanner(System.in);

            // Variáveis
            String letra;

            System.out.print("Insira uma letra: ");
            letra = input.next();

            vogal(letra);

        }
    }
