package Ex_03;

import Ex_02.Logger;

import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {
    private int sessionToken;
    private String lastAccess;

    private static UserSessionManager instance; // Instância única da classe

    // Construtor privado para evitar instâncias diretas
    private UserSessionManager() { //Não recebe parametro por ser random

        Random random = new Random(); // Gera um token de sessão aleatório
        this.sessionToken = random.nextInt();
        this.lastAccess= String.valueOf(LocalDateTime.now());
    }

    // Método estático para obter a instância única

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess() {
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }
}