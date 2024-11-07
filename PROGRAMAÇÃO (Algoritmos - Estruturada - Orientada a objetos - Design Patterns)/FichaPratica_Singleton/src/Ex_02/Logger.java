package Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {

    private String caminhoFicheiro;
    private static Logger instance;    // Instância única da classe

    // Construtor privado para evitar instâncias diretas
    private Logger(String caminhoFicheiro) {
        this.caminhoFicheiro = caminhoFicheiro;
    }

    // Método estático para obter a instância única
    public static Logger getInstance(String caminhoFicheiro){
        if (instance == null){
            instance = new Logger(caminhoFicheiro);
        }
        return instance;
    }

    // Método para gravar uma linha no arquivo de log
    public void log(String message) throws IOException {
        File ficheiroLog = new File (this.caminhoFicheiro);
        FileWriter fw = new FileWriter(ficheiroLog, true);

        LocalDateTime localDateTime = LocalDateTime.now();

        fw.append(localDateTime + ": " + message + "\n");
        fw.close();
    }
}
