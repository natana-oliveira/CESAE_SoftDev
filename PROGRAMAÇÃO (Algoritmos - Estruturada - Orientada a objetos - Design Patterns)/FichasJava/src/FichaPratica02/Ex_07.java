package FichaPratica02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Ler valor 1
        System.out.print("Ler um número: ");
        num = input.nextInt();

        if (num %2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }


    }
}
