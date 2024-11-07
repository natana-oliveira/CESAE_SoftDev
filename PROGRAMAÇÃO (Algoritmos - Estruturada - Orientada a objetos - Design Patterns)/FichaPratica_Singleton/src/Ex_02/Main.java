package Ex_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance("Ficheiros/logger.txt");
        logger.log("Inicio do Programa");
        logger.log("x: 20");
        logger.log("y: 15");
        logger.log("Objeto “mercedes” da Classe Carro criado com sucesso");
        logger.log("Objeto “ferrari” da Classe Carro criado com sucesso");


        Logger segundoLogger = Logger.getInstance("Ficheiros/segundoLogger.txt");
        segundoLogger.log("Estou a tentar criar outro ficheiro de log...");
        segundoLogger.log("w: 115");
    }
}
