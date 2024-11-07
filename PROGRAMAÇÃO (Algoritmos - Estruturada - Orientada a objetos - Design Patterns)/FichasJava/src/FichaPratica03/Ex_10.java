package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int limite, incremento, inicial=0;


        System.out.print("Introduza um limite: ");
        limite = input.nextInt();
        System.out.print("Introduza um salto: ");
        incremento = input.nextInt();


        while (inicial<=limite) {
            System.out.println(inicial);
            inicial= inicial+incremento;
                   }

    }
}
