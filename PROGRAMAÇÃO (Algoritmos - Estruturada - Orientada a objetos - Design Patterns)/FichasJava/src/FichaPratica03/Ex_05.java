package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, num2 ;
        System.out.print("Insira um número: ");
        inicio= input.nextInt();
        System.out.print("Insira um número: ");
        num2= input.nextInt();

        if (inicio==num2){
            System.out.println("Os números são iguais");
            }else{

            while (inicio <= num2) {
            System.out.println(inicio);
           inicio++; // inicio= inicio+1
        }

        while (inicio >= num2) {
            System.out.println(inicio);
            inicio= inicio-1;
        }

        }

    }
}
