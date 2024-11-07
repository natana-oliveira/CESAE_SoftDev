package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_01 {

    /* Implemente uma função int numeroMaisPequeno( ) que recebe três números inteiros como parâmetro e retorna o
    mais pequeno dos três. */

    /**
     * Método para retornar o menor de três números inteiros
     * @param num1
     * @param num2
     * @param num3
     * @return o menor número
     */
    public static int numeroMaisPequeno(int num1, int num2, int num3){

        int menor = 0;

        if (num1<num2 && num1<num3){
            menor=num1;
        }

        if (num2<num1 && num2<num3){
            menor=num2;
        }

        if (num3<num2 && num3<num1){
            menor=num3;
        }

        return menor;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int num1, num2, num3, menor;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        //Apresentar numero menor

        menor = numeroMaisPequeno(num1, num2, num3);
        System.out.print("Menor: " + menor);

    }
}
