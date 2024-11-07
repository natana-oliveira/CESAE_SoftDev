package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantInseridos, numero, numAnterior;

        //Inserir quantidade de números
        System.out.print("Quantos números deseja inserir?: ");
        quantInseridos = input.nextInt();

        //Inserir 1º número
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        //Descontar o número inserido
        quantInseridos--;     //quantInseridos=quantInseridos-1;

        //Comparar número inserido com Anterior
        numAnterior = numero;


        while (quantInseridos > 0) {
            System.out.print("Insira um número: ");
            numero = input.nextInt();
            quantInseridos--;
                        }

        if (numAnterior > numero) {
            System.out.println("NÃO CRESCENTE!");
        }else{
            System.out.println("CRESCENTE!");
        }

    }

}



/*
- Para a sequencia crescente o numero seguinte tem que ser sempre maior.

- O boleano tem resposta de sim ou não


 */


