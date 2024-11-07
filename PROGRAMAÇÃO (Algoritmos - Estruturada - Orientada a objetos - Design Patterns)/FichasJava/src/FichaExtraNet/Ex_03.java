package FichaExtraNet;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        /*
        Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
        pedindo até que o usuário informe um valor válido.

         */

        Scanner input = new Scanner(System.in);

        int nota;

        // Ler numero
        do {
            System.out.print("Insira uma nota (entre 0 e 10): ");
            nota = input.nextInt();

            if (nota <0 || nota> 10){
                System.out.println("Nota inválida! Tente outra vez!");
            }

        } while (nota < 0 || nota > 10); //Nota tem que ser menor que 0 OU maior que 10 ("CONDIÇÃO FALSA") para sair do ciclo

        System.out.println("Você digitou uma nota válida: " + nota);



    }
}
