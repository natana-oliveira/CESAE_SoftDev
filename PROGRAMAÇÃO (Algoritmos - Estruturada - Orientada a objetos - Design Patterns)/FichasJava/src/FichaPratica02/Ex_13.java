package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int min, horas;

        // Ler horas
        System.out.println("Introduza o horário no sistema 24h");
        System.out.print("Horas: ");
        horas= input.nextInt();

        System.out.print("Minutos: ");
        min= input.nextInt();

        if (horas<=12) {
            System.out.println(horas + ":" + min + "AM");
        }else{
            horas = horas-12;
            System.out.println(horas + ":" + min + "PM");
        }


    }
}
