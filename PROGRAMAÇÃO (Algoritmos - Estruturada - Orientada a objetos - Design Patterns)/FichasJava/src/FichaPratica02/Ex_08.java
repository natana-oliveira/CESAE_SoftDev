package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {



        // Instanciar o Scanner

        Scanner input = new Scanner(System.in);

        // Declarar variáveis

        double nota1, nota2, nota3, mediaFinal;

        // Ler Notas e média

        System.out.print("Nota 1: ");
        nota1= input.nextDouble();

        System.out.print("Nota 2: ");
        nota2= input.nextDouble();

        System.out.print("Nota 3: ");
        nota3= input.nextDouble();

        // Calcular média final

        mediaFinal = (nota1*0.25) + (nota2*0.35) + (nota3*0.4);

        // Apresentar média final
        System.out.println("Média Final: " + mediaFinal);

        if (mediaFinal >= 9.5) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }


    }
}
