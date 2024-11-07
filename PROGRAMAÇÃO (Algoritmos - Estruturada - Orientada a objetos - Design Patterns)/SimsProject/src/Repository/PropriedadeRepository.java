package Repository;

import Domain.Propriedade.Propriedade;
import Tools.CSVShoppingReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PropriedadeRepository {
    private ArrayList<Propriedade> arrayPropriedades;

    public PropriedadeRepository(String filePath) throws FileNotFoundException {
        CSVShoppingReader csvShoppingReader = new CSVShoppingReader(filePath);
        this.arrayPropriedades = csvShoppingReader.readCSVToRepository();
    }

    public ArrayList<Propriedade> getArrayPropriedades() {
        return arrayPropriedades;
    }
}
