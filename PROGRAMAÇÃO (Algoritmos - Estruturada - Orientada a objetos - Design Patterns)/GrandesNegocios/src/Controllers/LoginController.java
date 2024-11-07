package Controllers;

import Domain.Utilizador;
import Repository.UtilizadorRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LoginController {
    private ArrayList<Utilizador> utilizadoresSistema;

    public LoginController() throws FileNotFoundException {
        UtilizadorRepository repository = new UtilizadorRepository("Ficheiros/login_grandesNegocios.csv");
        this.utilizadoresSistema = repository.getUtilizadorsSistema();
    }

    public boolean validarLogin(String tipoUtilizador, String username, String password) {


        for (Utilizador utilizadorAtual : this.utilizadoresSistema) {
            if (username.equals(utilizadorAtual.getUsername()) && password.equals(utilizadorAtual.getPassword()) && tipoUtilizador.equals(utilizadorAtual.getTipoConta())) { // Encontramos o utilizador e a password corresponde.. Para além disso, o tipo de user é o correto
                return true;
            }
        }

        return false;
    }
}