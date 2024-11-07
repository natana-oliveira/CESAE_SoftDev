package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano, anoBis;

        System.out.print("Insira um ano: ");
        ano = input.nextInt();

        if (ano%4==0) {
            System.out.println("É bissexto!");
        }else {
            System.out.println("Não é bissexto!");
        }
    }
}
