package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    /*
    . Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na consola.
     */

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_04.csv"));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }

        fileScanner.close();
    }


}
