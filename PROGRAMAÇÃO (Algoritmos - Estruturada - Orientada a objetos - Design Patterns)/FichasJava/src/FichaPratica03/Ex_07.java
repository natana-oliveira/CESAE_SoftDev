package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int numInserido, numMenor, numMaior;

        System.out.print("Insira um número: ");
        numInserido = input.nextInt();

        numMenor=numInserido-5;
        numMaior=numInserido+5;


        while (numMenor<numInserido) {
            System.out.println(numMenor);
            numMenor++;  // numMenor = numMenor + 1;
        }

        numInserido++;
        System.out.println();

        //Imprimir sucessores

        while (numInserido<=numMaior) {
            System.out.println(numInserido);
            numInserido++;
        }

    }
}
