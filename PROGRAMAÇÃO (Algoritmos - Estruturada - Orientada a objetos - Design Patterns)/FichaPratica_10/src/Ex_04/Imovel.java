package Ex_04;

public class Imovel {

    //Definir atributos
    String rua;
    int numPorta;
    String cidade;
    tipoImovel tipologia;
    tipoAcabamento acabamento;
    double area;
    int numQuartos;
    int numBanheiros;
    double areaPiscina;

    //Método construtor
    public Imovel(String rua, int numPorta, String cidade, tipoImovel tipologia, tipoAcabamento acabamento, double area, int numQuartos, int numBanheiros, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipologia = tipologia;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.areaPiscina = areaPiscina;
    }

    //Método para calcular o valor do imóvel
    public double getvalorImovel() {

        double valorImovel = (this.numQuartos * 7500) + (this.numBanheiros * 10500) + (this.areaPiscina * 1000);
        // System.out.println("Valor quarto: " + this.numQuartos * 7500);
        // System.out.println("Valor banheiro: " + this.numBanheiros * 10500);
        // System.out.println("Valor da piscina: "+ this.areaPiscina * 1000);

        switch (tipologia) {
            case APARTAMENTO:
                valorImovel += area * 1000;
                // System.out.println("valor area: "+ (area * 1000));
                break;

            case CASA:
                valorImovel += area * 3000;
                //System.out.println("valor area: "+ (area * 3000));
                break;

            case MANSAO:
                valorImovel += area * 5000;
                //   System.out.println("valor area: "+ area * 5000);
                break;
        }

        double desconto;
        //  System.out.println("Valor imovel sem desconto: "+valorImovel);

        switch (acabamento) {

            case RESTAURO:
                desconto = 0.5 * valorImovel;
                valorImovel -= desconto;
                break;

            case USADA:
                desconto = 0.1 * valorImovel;
                valorImovel -= desconto;
                break;

            case NOVA:
                valorImovel = valorImovel;
                break;

            case NOVACOMALTOACABAMENTO:
                desconto = 1.25 * valorImovel; // A valorização soma 1 por isso é 1.25 e não 0.25
                valorImovel += desconto;
                break;
        }
        System.out.println("Valor do imóvel: " + valorImovel + "EUR");
        return valorImovel;
    }

    //Método imprimirDescricao que imprima as especificações do imóvel.
    public void imprimirDescricao() {
        System.out.println("Tipologia: " + this.tipologia);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Morada: " + this.rua + ", " + this.numPorta + " - " + this.cidade);
        System.out.println("Área: " + this.area + " m2");
        System.out.println("Quartos: " + this.numQuartos + "\t| Casa de Banho: " + this.numBanheiros);
        System.out.println("Piscina: " + this.areaPiscina + " m2\n");
        System.out.println("Preço: " + getvalorImovel() + "EUR");
    }

    //Método para mudar o estado de uma casa
    public void setAcabamento(tipoAcabamento acabamento) {
        this.acabamento = acabamento;
    }


    //Método compararImoveis, que receba outro imóvel como parâmetro e retorne  qual o imóvel mais caro
    public Imovel compararImoveis(Imovel imovelComparado) { //Public Imovel retorna um imovel e não um void ou double

        if (this.getvalorImovel() > imovelComparado.getvalorImovel()) {
            System.out.println("\n*******   Imóvel mais caro   *******");
            imprimirDescricao();
            //  valorImovel();
            return this;
        } else {
            System.out.println("\n*******   Imóvel mais caro   *******");
            imovelComparado.imprimirDescricao();
            imovelComparado.getvalorImovel();
            return imovelComparado;
        }
    }
}
