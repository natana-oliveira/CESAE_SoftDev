package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    /*
    Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
calcule a soma desses números.
     */

    public static void main(String[] args) throws FileNotFoundException {

     /*   //Trazer o arquivo para cá

        File ficheiro = new File ("Ficheiros/exercicio_05_31.txt");
        Scanner fileScanner = new Scanner(ficheiro);
        */


        //Ler o ficheiro (é exatamente igual a escrita acima só que mais simplificado
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_05_31.txt"));

        //Declarar as variaveis
        int num, soma = 0;

        while (fileScanner.hasNextLine()) {
            num = fileScanner.nextInt();
            soma += num;
        }
            System.out.println("Soma: " + soma);

        fileScanner.close();
        }
    }


