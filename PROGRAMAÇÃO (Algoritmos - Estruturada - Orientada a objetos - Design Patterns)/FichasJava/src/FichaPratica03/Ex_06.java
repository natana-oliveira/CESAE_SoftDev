package FichaPratica03;

public class Ex_06 {
    public static void main(String[] args) {

        // Declarar variáveis
        int numInicial = 1, soma = 0;

        while (numInicial <= 100) {
            System.out.println(numInicial);
             soma+= numInicial; // soma = soma + numInicial;

            numInicial++; // numInicial = numInicial + 1;
        }


        System.out.println("Somatório: " + soma);

    }
}
