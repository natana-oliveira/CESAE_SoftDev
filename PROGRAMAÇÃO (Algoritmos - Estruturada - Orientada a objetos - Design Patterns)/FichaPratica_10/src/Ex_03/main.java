package Ex_03;

import Ex_02.Conta;

public class main {
    public static void main(String[] args) {

        /*  MODO mais extenso de fazer o array alimentação
        String [] alimentacaoDraco = new String [4];
        alimentacaoDraco [0]="fruta";
        alimentacaoDraco [1]="baga";
        alimentacaoDraco [2]="folha";
        alimentacaoDraco [3]="inseto";
         */

        Animal macaco = new Animal("Draco", "Macaco-esquilo", " América do Sul", 1.1, new String[]{"fruta", "baga", "folha", "inseto"});
        Animal baleia = new Animal("Willy", "Orca", "Canadá", 6000, new String[]{"peixe", "lula", "tartaruga", "passaro"});

        macaco.imprimirDetalhes();
        macaco.comer("fruta", 25);
        System.out.println();
        baleia.imprimirDetalhes();
        baleia.comer("passaro", 500);
        System.out.println();
        baleia.comer("francesinha", 350);


    }
}
