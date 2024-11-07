package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_06 {

    /*
    6. Implemente uma função double somatorio( ) que recebe um número inteiro como parâmetro e retorna o
somatório de todos os seus dígitos.
Exemplo de execução:
- Introduza um número: 361
- Somatório: 10 (3+6+1=10
     */

    public static double somatorio(int num) {

        double somatorio=0;

        while (num!= 0) {
            somatorio += num % 10; // Obtém o último dígito e adiciona ao somatório
            num /= 10; // Remove o último dígito do número
        }

        return somatorio;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int num;
        double somatorio;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        //Apresentar somatorio
        somatorio = somatorio(num);
        System.out.println("Somatório: " + somatorio);

    }


}
