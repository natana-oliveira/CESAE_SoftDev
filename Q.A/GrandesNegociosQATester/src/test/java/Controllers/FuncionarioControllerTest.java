package Controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioControllerTest {

    FuncionarioController funcionario;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        funcionario = new FuncionarioController("src/test/resources/minimercadoTest.csv");
    }

    @Test
    void addVenda() throws IOException {

        String filePath = "src/test/resources/minimercadoTest.csv";

        funcionario.addVenda("Alimentacao", "Chocolate belga", 15, 4.25);

        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        String tipoProduto = "";
        String nomeProduto = "";
        int quantidadeProduto = 0;
        double precoProduto = 0;

        String linha = scanner.nextLine();

        while (scanner.hasNextLine()) {

            linha = scanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            tipoProduto = linhaSeparada[0];
            nomeProduto = linhaSeparada[1];
            quantidadeProduto = Integer.parseInt(linhaSeparada[2]);
            precoProduto = Double.parseDouble(linhaSeparada[3]);
        }

        assertEquals("Alimentacao", tipoProduto);
        assertEquals("Chocolate belga", nomeProduto);
        assertEquals(15, quantidadeProduto);
        assertEquals(4.25, precoProduto);
    }

    @Test
    void consultarStockProduto() {
        assertEquals(1180, funcionario.consultarStockProduto("Vassoura"));
        assertEquals(1100, funcionario.consultarStockProduto("Sacos do Lixo"));
        assertEquals(1170, funcionario.consultarStockProduto("Azeite"));
        assertEquals(1150, funcionario.consultarStockProduto("Sabao Azul e Branco"));
    }

    @AfterEach
    void tearDown() throws FileNotFoundException {
        // Limpar o ficheiro
        File fileTest = new File("src/test/resources/minimercadoTest.csv");
        File fileOriginal = new File("src/test/resources/minimercadoTesterOriginal.csv");

        PrintWriter pw = new PrintWriter(fileTest);
        Scanner sc = new Scanner(fileOriginal);

        int count = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            if (count < 134) {
                pw.println(linha);
            } else {
                pw.print(linha);
            }
            count++;
        }
        pw.close();
    }

}