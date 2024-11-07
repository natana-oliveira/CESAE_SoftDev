package FichaPratica06;

public class Ex_05 {

/*
a) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.
b) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.
c) Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente.
 */

    /**
     * Método que avalia o maior valor de um array
     *
     * @param vetor
     * @return o maior valor do array
     */
    public static int maiorValorArray(int[] vetor) {

        int maior = vetor[0];

        for (int indice = 1; indice < vetor.length; indice++) {
            if (vetor[indice] > maior) {
                maior = vetor[indice];
            }
        }
        return maior;
    }

    /**
     * Método que avalia o menor valor de um array
     *
     * @param vetor
     * @return o menor valor do array
     */
    public static int menorValorArray(int[] vetor) {
        int menor;
        menor = vetor[0];

        for (int indice = 1; indice < vetor.length; indice++) {
            if (vetor[indice] < menor) {
                menor = vetor[indice];
            }
        }
        return menor;
    }

    /**
     * Método que avalia se o array está crescente
     *
     * @param vetor
     * @return True se crescente || False se decrescente
     */
    public static boolean crescenteArray(int[] vetor) {

        boolean crescente = false;

        for (int indice = 1; indice < vetor.length; indice++) {
            if (vetor[indice] <= vetor[indice - 1]) {
                return false;
            }
        }
        return true;
    }
}



