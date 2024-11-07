package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_08_1 {

    /**
     * Método para identificar uma vogal
     * @param letra
     * @return true se for vogal
     */
    public static boolean vogal(String letra) {

        boolean vogal = true;

        letra = letra.toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("VOGAL!");;
        }else {
            return false;
        }
        return vogal;
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
