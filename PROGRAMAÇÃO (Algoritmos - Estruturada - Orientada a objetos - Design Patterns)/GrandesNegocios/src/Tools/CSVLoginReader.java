package Tools;

import Domain.Utilizador;
import Domain.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVLoginReader {
    private String filePath;

    public CSVLoginReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Utilizador> readCSVToRepository() throws FileNotFoundException {

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        ArrayList<Utilizador> arrayUsers = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipoConta = linhaDividida[0];
            String utilizador = linhaDividida[1];
            String password = linhaDividida[2];

            Utilizador utilizadorAtual = new Utilizador(tipoConta,utilizador,password);

            arrayUsers.add(utilizadorAtual);

        }

        return arrayUsers;
    }
}