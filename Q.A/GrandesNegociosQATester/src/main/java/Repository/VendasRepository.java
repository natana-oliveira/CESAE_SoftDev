package Repository;

import Domain.Venda;
import Tools.CSVVendasReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    private ArrayList<Venda> vendaArray;

    public VendasRepository(String filePath) throws FileNotFoundException {
        CSVVendasReader csvVendasReader = new CSVVendasReader(filePath);
        this.vendaArray = csvVendasReader.readCSVToRepository();
    }

    public ArrayList<Venda> getVendaArray() {
        return vendaArray;
    }
}