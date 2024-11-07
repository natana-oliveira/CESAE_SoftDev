package Ex_04;

public class main {
    public static void main(String[] args) {

        Imovel casa = new Imovel("Rua Alves P.", 1250, "Porto", tipoImovel.CASA, tipoAcabamento.RESTAURO, 380, 3, 2, 10);
        Imovel apartamento = new Imovel("Rua D. Nuno Alves", 525, "Matosinhos", tipoImovel.APARTAMENTO, tipoAcabamento.NOVA, 146, 2, 3, 0);
        Imovel mansao = new Imovel("Rua Arlindo P.", 58, "Porto", tipoImovel.MANSAO, tipoAcabamento.USADA, 625, 4, 4, 20);

        System.out.println("\n***********  IMÓVEL  ***********\n");
        casa.imprimirDescricao();
        System.out.println();


        // comparar imóveis

        System.out.println("\n**********   COMPARAR IMÓVEIS   **********\n");
        casa.compararImoveis(apartamento);

        System.out.println("\n**********   COMPARAR IMÓVEIS   **********\n");
        apartamento.compararImoveis(casa);

        System.out.println("\n**********   COMPARAR IMÓVEIS   **********\n");
        casa.compararImoveis(mansao);


        // mudar estado do imovel

        apartamento.setAcabamento(tipoAcabamento.USADA);
        apartamento.imprimirDescricao();


    }
}
