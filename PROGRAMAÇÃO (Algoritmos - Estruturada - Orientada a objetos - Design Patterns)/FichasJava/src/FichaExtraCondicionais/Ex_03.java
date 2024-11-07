package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor, precoFinal;

        System.out.print("Introduza o preço: ");
        valor = input.nextDouble();

        if (valor>100) {
            precoFinal= valor-(valor*0.1);
            System.out.println("Preço Final: " + precoFinal + " (10% de desconto)");
        }else {
            System.out.println("Preço Final: " + valor + " (sem desconto)");
        }



    }
}
