package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {

    /*
    Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) e
crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.
     */


    /**
     *Método que lê um inteiro positivo do utilizador
     * @return Número Inteiro Positivo
     */
    public static int lerInteiroPositivo() {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.print("Insira um inteiro positivo: ");
            num=input.nextInt();
        }while (num<0);

        return num;
}

    /**
     * Método que imprime uma quantidade de astericos recebida como parâmetro
     * @param numeroAstericos
     */
    public static void imprimirAsteriscos(int numeroAstericos) {

        for (int i=0; i<numeroAstericos; i++) {

            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        imprimirAsteriscos(lerInteiroPositivo());


    }


}
