package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {


        /*
        Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (1 posição para
cada mês) e calcular o seu total anual
         */

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double[] comissoes = new double[12];  //Como se declara vetores
        double soma = 0;

        //Adicionar comissões a cada elemento do array
        for (int mes = 0; mes < 12; mes++) { //O mês é o "número da gaveta" (número da coluna)
            System.out.print("Insira um valor de comissão: " + mes);
            comissoes[mes] = input.nextDouble();

            //Calcular o total anual
            soma += comissoes[mes];
        }

        //Apresentar o total anual
        System.out.println("Total Anual de Comissões: " + soma);


    }
}
