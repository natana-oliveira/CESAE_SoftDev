package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso, pesoLua;

        System.out.print("Introduza o peso (em Kg.): ");
        peso = input.nextDouble();

        pesoLua = peso * 0.16;

        if (peso>0) {
            System.out.println("Peso na lua: " + pesoLua + "Kg.");
        }else {
            System.out.println("Peso inválido!!");
        }

    }
}
