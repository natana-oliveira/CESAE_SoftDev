package FichaPratica06;

import java.util.Scanner;

public class Ex_03 {

    /*
a) Implemente uma função que determina se um número  é par ou ímpar, a função deve retornar true se par ou false se ímpar.
b) Implemente uma função que determina se um número  é positivo ou negativo, a função deve retornar true se zero ou positivo, ou false se negativo.
c) Implemente uma função que determina se um número  é ou não primo, a função deve retornar true se primo ou false se não primo.
d) Implemente uma função que determina se um número  é perfeito, a função deve retornar true se perfeito ou false se não perfeito.
e) Implemente uma função que determina se um número  é triangular, a função deve retornar true se triangular ou false se não triangular (Um número triangular é um número que pode ser representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5).     */

    /**
     * Método que avalia se um número é ou não impar
     *
     * @param num
     * @return True - se par || False - se impar
     */
    public static boolean par(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um número é positivo ou negativo
     *
     * @param num
     * @return True - se for 0 ou positivo  || False - se negativo
     */
    public static boolean positivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um número é primo
     *
     * @param num
     * @return True - se for primo  || False - se não primo
     */
    public static boolean primo(int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que avalia se um número é perfeito
     *
     * @param num
     * @return True - se for perfeito  || False - se não perfeito
     */
    public static boolean perfeito(int num) {

        int somatorio = 0;

        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                somatorio += divisor;
            }
        }

        if (num == somatorio) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um número é triangular
     *
     * @param num
     * @return True - se for triangular || False - se não for triangular
     */
    public static boolean triangular(int num) {

        int somatorio = 0, contador = 1;

        for (int a = 1; a < num; a++) {
            somatorio += a;
            if (somatorio == num) {
                return true;
            }
        }
        return false;
    }


}


