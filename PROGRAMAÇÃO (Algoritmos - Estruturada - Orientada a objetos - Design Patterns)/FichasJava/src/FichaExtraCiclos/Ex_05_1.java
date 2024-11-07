package FichaExtraCiclos;

public class Ex_05_1 {
    public static void main(String[] args) {


        int linhas = 4; // Número de linhas a serem impressas (linhas desejado no padrão)


        for (int i = 1; i <= linhas; i++) { //Para i (numero impresso )menor igual a linha, depois o numero aumenta +1
            for (int a = 1; a <= i; a++) { // 2º loop que varia de a de 1 a i. Isso significa que ele percorre o número de vezes igual ao valor de i.
                /*
                Por exemplo, na primeira linha, i é igual a 1, portanto, o segundo loop imprime o número 1 uma vez.
                Na segunda linha, i é igual a 2, então o segundo loop imprime o número 2 duas vezes, e assim por diante.

                Dentro do segundo loop, o programa imprime o valor de i. O número i é o número da linha atual, e é isso que é impresso repetidamente.

                Após imprimir o número i repetidamente de acordo com o valor de a no segundo loop, o programa move para a próxima linha usando
                System.out.println() para que a próxima linha do padrão seja impressa na próxima linha na saída.
                 */
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
