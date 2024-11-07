package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Declarar variáveis
        int num, contagem = 0;
        System.out.print("Insira um número: ");
        num = input.nextInt();

        while (contagem <= num) {
            System.out.println(contagem);
            contagem = contagem + 1;
        }

        }
    }
