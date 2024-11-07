package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_09 {

    /* Implemente um método que dado um número 1-12, retorne uma String com o mês correspondente.
Seguidamente, imprima na consola essa String
     */

    /**
     * Método para retornar o mês correspondente ao número 1-12
     * @param numero
     */
    public static void mes(int numero) {

        switch (numero) {

            case 1:
                System.out.println("JANEIRO");
                break;
            case 2:
                System.out.println("FEVEREIRO");
                break;
            case 3:
                System.out.println("MARÇO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAIO");
                break;
            case 6:
                System.out.println("JUNHO");
                break;
            case 7:
                System.out.println("JULHO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SETEMBRO");
                break;
            case 10:
                System.out.println("OUTUBRO");
                break;
            case 11:
                System.out.println("NOVEMBRO");
                break;
            case 12:
                System.out.println("DEZEMBRO");
                break;

            default:
                System.out.println("ERRO!\nMês desconhecido.");
        }
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int numero;

        System.out.print("Insira um número (correspondente à um mês): ");
        numero = input.nextInt();

        mes(numero);
    }

}
