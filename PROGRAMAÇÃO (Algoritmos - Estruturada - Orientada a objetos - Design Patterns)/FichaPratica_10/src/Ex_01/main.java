package Ex_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

      /*  Scanner input = new Scanner(System.in);

        System.out.print("Insira a marca: ");
        String marca = input.next();

        System.out.print("Insira o modelo: ");
        String modelo = input.next();

        System.out.print("Insira o ano: ");
        int ano = input.nextInt();

        System.out.print("Insira a potencia: ");
        int potencia= input.nextInt();

        System.out.print("Insira a cilindrada: ");
        int cilindrada = input.nextInt();

        System.out.print("Insira o Tipo de Combustivel (GASOLINA, DIESEL, GPL): ");
        String escolhaCombustivel = input.next();

        TipoCombustivel tipoCombustivel= null;
        switch (escolhaCombustivel){
            case "GASOLINA":
                tipoCombustivel=TipoCombustivel.GASOLINA;
                break;

            case "DIESEL":
                tipoCombustivel=TipoCombustivel.DIESEL;
                break;

            case "GPL":
                tipoCombustivel=TipoCombustivel.GPL;
                break;
        }

        System.out.print("Insira o consumo (L/100Km): ");
        double consumo = input.nextDouble();

        Carro carroUtilizador = new Carro(marca,modelo,ano,potencia,cilindrada,tipoCombustivel,consumo);
       */

        Carro mercedesA45 = new Carro("Mercedes", "A45", 2023, 420, 2000, TipoCombustivel.GASOLINA, 12);
        Carro datsun = new Carro("Datsun", "1200", 1970, 90, 1200, TipoCombustivel.GASOLINA, 25);
        Carro ferrari = new Carro("Ferrari", "SF90", 2023, 800, 5000, TipoCombustivel.GASOLINA, 18);

        mercedesA45.ligar();
        System.out.println();
        datsun.ligar();
        System.out.println();
        ferrari.ligar();

        System.out.println("\n\n****************************  CORRIDA  ****************************");
        Carro vencedorCorrida1 = mercedesA45.corrida(datsun);
        Carro vencedorCorrida2 = datsun.corrida(ferrari);
        System.out.println("\n*******************************");
        System.out.println("Vencedor Corrida 1");
        vencedorCorrida1.exibirDetalhes();
        System.out.println("\n*******************************");
        System.out.println("Vencedor Corrida 2");
        vencedorCorrida2.exibirDetalhes();
        System.out.println("\n*******************************");
        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);
        System.out.println("Vencedor Final");
        vencedorFinal.exibirDetalhes();


    }
}
