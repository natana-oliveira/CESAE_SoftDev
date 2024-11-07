package FichaExtraFunçoes;

import java.util.Scanner;

public class Ex_05 {
    /*
    Escreva um método chamado "contarPiada" que retorna uma piada com base num inteiro passado como parâmetro.
    Use um array de Strings para armazenar diferentes piadas.
     */

    public static String contarPiada(int piada) {

        //  String[] bibliotecaPiadas = new String[5];
        String[] bibliotecaPiadas = {
                "Que nome se dá a uma ferramenta perdida?\n- Foice!",
                "O que 17 alentejanos fazem em frente ao cinema?\n- À espera que chege mais um porque o filme é para mais de 18.",
                "Qual é a panela que está sempre triste?\n- A panela depressão.",
                "O que acontece se o Pai Natal morrer?\n- Ele não estará mais em trenós.",
                "Por que o Java foi para a escola?\n- Porque queria ser uma classe especial! "
        };

        if (piada >= 0 && piada < bibliotecaPiadas.length) {
            return bibliotecaPiadas[piada];
        } else {
            return "A biblioteca de piadas só tem 5 piadas.";
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int numPiada;

        System.out.print("Introduza um número para ouvir uma piada: ");
        numPiada = input.nextInt();

        //Apresentar piada
        System.out.println(contarPiada(numPiada));
    }
}