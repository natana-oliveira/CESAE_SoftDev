package FichaExtraCiclos;

public class Ex_05_2 {
    public static void main(String[] args) {


        int linhas = 5; // Número de linhas a serem impressas

        for (int i = 1; i <= linhas; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(i);
            }
            System.out.println();
        }

/*


 int linhas = 5; // Número de linhas a serem impressas
        int espacos = linhas - 1; // Número inicial de espaços em cada linha

        for (int i = 1; i <= linhas; i++) {
            // Imprimir espaços em branco
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            // Imprimir números
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i);
            }

            System.out.println();

            // Atualizar o número de espaços para a próxima linha
            espacos--;
        }
 */



    }
}
