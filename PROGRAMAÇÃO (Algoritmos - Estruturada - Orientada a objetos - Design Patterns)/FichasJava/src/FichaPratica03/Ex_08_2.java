package FichaPratica03;

import java.util.Scanner;

public class Ex_08_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 0, somatorio = 0, contador = 0, media;

        while (num != -1) {
            //Ler números até -1
            System.out.print("Insira um número: ");
            num = input.nextInt();

            //Acumular o número na variável somatório
            somatorio = somatorio + num;

            //Contar +1 aos números introduzidos
            contador = contador + 1;
        }

        //Remover o -1 ao somatório
        somatorio++;
        System.out.println("Somatório: " + somatorio);

        //Remover uma contagem
        contador--;
        System.out.println("Contador: " + contador);

        //Calcular a média
        media = somatorio / contador;
        System.out.println("Média: " + media);
    }
}
