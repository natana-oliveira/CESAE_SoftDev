package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_07 {
    /*
    Implemente uma função int inverterInteiro( ) que recebe um número inteiro como parâmetro e devolve o
número ao contrário.
Exemplo de execução:
 Introduza um número: 1623  - Inversão: 3261
     */

    /**
     * Método para inverter um número inteiro
     * @param num
     * @ a inversão do número
     */
    public static int inverterInteiro(int num) {

            int numeroInvertido = 0;

            while (num != 0) {
                int digito = num % 10;  // Pega o dígito menos significativo
                numeroInvertido = numeroInvertido * 10 + digito;  // Adiciona o dígito ao número invertido
                num = num / 10;  // Remove o dígito menos significativo
            }

            return numeroInvertido;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int num, inversao;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        //Apresentar inversao
        inversao = inverterInteiro(num);
        System.out.println("Inversão: " + inversao);

    }


}
