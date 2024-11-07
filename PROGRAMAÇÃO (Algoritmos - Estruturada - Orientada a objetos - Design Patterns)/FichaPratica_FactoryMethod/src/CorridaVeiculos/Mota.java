package CorridaVeiculos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {

    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
    }

    // Método imagem que imprime o conteúdo do ficheiro mota.txt na consola.


    public static void imagem(String caminho) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("src/CorridaVeiculos/Mota.txt"));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }
        fileScanner.close( );
    }


}
