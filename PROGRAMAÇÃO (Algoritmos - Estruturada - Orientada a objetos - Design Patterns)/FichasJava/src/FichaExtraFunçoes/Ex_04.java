package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_04 {

/*
Escreva um método chamado "imprimirTabuada" que recebe um número inteiro como parâmetro e imprime
a tabuada desse número de 1 a 10
 */

    /**
     * Método para imprimir a tabuada de um número
     * @param num
     * @return a tabuada
     */

    public static int imprimirTabuada(int num){

        int resultado=0;

        for (int i=1; i<=10; i++){
            resultado=num*i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
        return resultado;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int num, resultado;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        //Apresentar tabuada
        resultado = imprimirTabuada(num);
    }
}
