package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws FileNotFoundException {
        /* Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
quantidade vendida, valor unitario) e calcule o valor total das vendas  */

        //Fazer scanner do arquivo
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_10.csv"));

        String linha = fileScanner.nextLine(); //Grava a linha do cabeçalho

        String tipo_produto, produto;
        double quantidade_vendida = 0, preco_unitario = 0, preçoFinal, totalVendas = 0;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            String[] itensDaLinha = linha.split(",");

                quantidade_vendida = Double.parseDouble(itensDaLinha[2]);
                preco_unitario = Double.parseDouble(itensDaLinha[3]);
                preçoFinal = quantidade_vendida * preco_unitario;
                totalVendas +=preçoFinal;
        }
        
        System.out.println("Total de Vendas: " + totalVendas);
    }
}
