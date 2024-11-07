package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.imprimirFicheiro;

public class Ex_01 {

    public static void main(String[] args) throws FileNotFoundException {

       /* Scanner in = new Scanner(new File("Ficheiros/exercicio_01.txt"));

        String linha;

        while(in.hasNextLine()) {
            linha=in.nextLine();
            System.out.println(linha);

        }*/

        imprimirFicheiro("Ficheiros/exercicio_01.txt");

    }
}
