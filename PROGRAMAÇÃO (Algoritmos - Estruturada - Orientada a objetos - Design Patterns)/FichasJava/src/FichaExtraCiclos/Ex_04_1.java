package FichaExtraCiclos;

public class Ex_04_1 {
    public static void main(String[] args) {

        int linhas = 4; // Número de linhas a serem impressas
        int colunas = 10; // Número de colunas a serem impressas

        for (int i = 0; i < linhas; i++) {
            for (int a = 0; a < colunas; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }
