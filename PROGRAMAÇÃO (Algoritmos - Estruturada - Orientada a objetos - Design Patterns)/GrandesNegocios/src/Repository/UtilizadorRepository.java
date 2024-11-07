package Repository;

import Domain.Utilizador;
import Tools.CSVLoginReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UtilizadorRepository {

    private ArrayList<Utilizador> utilizadorsSistema;

    public UtilizadorRepository(String path) throws FileNotFoundException {
        CSVLoginReader loginReader = new CSVLoginReader(path);
        this.utilizadorsSistema = loginReader.readCSVToRepository();
    }

    public ArrayList<Utilizador> getUtilizadorsSistema() {
        return utilizadorsSistema;
    }
}