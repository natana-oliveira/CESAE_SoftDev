package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int idade;

        // Ler salário
        System.out.print("Introduza a idade: ");
        idade = input.nextInt();


        if (idade>=18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

    }
}

