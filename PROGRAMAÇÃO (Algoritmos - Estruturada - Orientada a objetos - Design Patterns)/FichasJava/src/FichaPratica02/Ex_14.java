package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b,c;

        // Ler valores
        System.out.print("Insira um valor:");
        a= input.nextInt();
        System.out.print("Insira um valor:");
        b= input.nextInt();
        System.out.print("Insira um valor:");
        c= input.nextInt();

        if (a<b && a<c) { // A < B e C
            if (b < c) { //B < C
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }

            if (b<a && b<c) { // B < a e C
                if (a < c) { //A < C
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            }

        if (c<a && c<b) { // C < a e B
            if (a < b) { //A < B
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }

    }
}
