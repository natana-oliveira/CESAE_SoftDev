package Tools;

import Domain.Propriedade.AcessoriosModa;
import Domain.Propriedade.Imovel;
import Domain.Propriedade.Propriedade;
import Domain.Propriedade.Veiculo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVShoppingReader {
    private String filePath;

    public CSVShoppingReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Reader do Ficheiro de Shopping
     * @return coisasParaComprar (array de coisas para comprar)
     * @throws FileNotFoundException
     */
    public ArrayList<Propriedade> readCSVToRepository() throws FileNotFoundException {

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(new File("Ficheiros/CoisasShopping23.csv"));

        String linha = scanner.nextLine(); // avançar a primeira linha

        ArrayList<Propriedade> coisasParaComprar = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";"); // separar cada linha do arquivo pelo ";"

            String tipo = linhaDividida[0];
            String nomePropriedade = linhaDividida[1];
            double custo = Double.parseDouble(linhaDividida[2]);
            int estatutoPropriedade = Integer.parseInt(linhaDividida[3]);
            String marca = linhaDividida[5];

            Propriedade propriedadeAtual = null;

            switch (tipo) {
                case "Imovel":
                    int capacidadePessoas = Integer.parseInt(linhaDividida[4]);
                    propriedadeAtual = new Imovel(nomePropriedade, custo, estatutoPropriedade, capacidadePessoas);
                    break;

                case "Veiculo":
                    String modelo = linhaDividida[6];
                    propriedadeAtual = new Veiculo(nomePropriedade, custo, estatutoPropriedade, marca, modelo);
                    break;

                case "AcessorioModa":
                    boolean formal = Boolean.parseBoolean(linhaDividida[7]);
                    propriedadeAtual = new AcessoriosModa(nomePropriedade, custo, estatutoPropriedade, marca, formal);
                    break;
            }
            coisasParaComprar.add(propriedadeAtual);
        }
        return coisasParaComprar;
    }

}





