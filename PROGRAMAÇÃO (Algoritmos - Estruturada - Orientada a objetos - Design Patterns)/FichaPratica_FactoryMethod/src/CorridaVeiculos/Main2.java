package CorridaVeiculos;

import java.util.Scanner;
public class Main2 {


    public static Veiculo criarVeiculo(){


        Scanner input = new Scanner(System.in);

        String tipoVeiculo, marca, modelo;
        int anoFabrico, potencia, cilindrada,indexCombustivel, quantPassageiros;
        TipoCombustivel tipoCombustivel =null;
        double capacidadeCarga, consumo;

        System.out.print("\nInsira o tipo de Veículo com o qual deseja competir (Carro / Mota / Camiao): ");
        tipoVeiculo = input.next();

        System.out.print("\nInsira a marca do Veículo: ");
        marca = input.next();

        System.out.print("\nInsira o modelo do Veículo: ");
        modelo= input.next();

        System.out.print("\nInsira o ano de fabrico do Veículo: ");
        anoFabrico = input.nextInt();

        System.out.print("\nInsira a potência do Veículo: ");
        potencia = input.nextInt();

        System.out.print("\nInsira as cilindradas do Veículo: ");
        cilindrada = input.nextInt();

        System.out.println("\n* Tipo de Combustível *");
        int contador = 1;
        for (TipoCombustivel tipoCombustivelAtual : TipoCombustivel.values()){
            System.out.println(contador++ + ": " + tipoCombustivelAtual);
        }

        System.out.print("\nInsira o número referente ao tipo de combustível do Veículo: ");
        indexCombustivel  = input.nextInt();

        contador = 1;
        for (TipoCombustivel tipoCombustivelAtual : TipoCombustivel.values()){
            if (indexCombustivel == contador) {
                tipoCombustivel = tipoCombustivelAtual;
            }
            contador++;
        }

        System.out.print("\nInsira o consumo do Veículo: ");
        consumo = input.nextDouble();

        if (tipoVeiculo.equals("Camiao")){
            System.out.print("\n\nInsira a capacidade de carga do Camião: ");
            capacidadeCarga = input.nextDouble();
        } else if (tipoVeiculo.equals("Carro")){
            System.out.print("\n\nInsira a quantidade de passageiros do Carro: ");
            quantPassageiros = input.nextInt();
        }
        return null;
    }






    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolhaMenu;
        int distancia = 0;


         //Ciclo para entrar
        do {
            System.out.println("\n\n**************************************************************");
            System.out.println("***************  Bem Vindo a Corrida Maluca!  ****************");
            System.out.println("**************************************************************");

            System.out.println("\n------- Vamos começar!! -------\n");

            System.out.println("1. Criar o veículo no sistema: ");
            System.out.println("2. Calcular o consumo do veículo: ");
            System.out.println("3. Fazer uma corrida Carro 1: ");
            System.out.println("4. Fazer uma corrida Mota 1:  ");
            System.out.println("5. Fazer uma corrida Camiao 1:  ");
            System.out.println("6. Para camião. Calcular custos de viagem de transporte de carga: ");
            System.out.println("7. Para mota. Imprimir a imagem da mota: ");

            System.out.print("\nSelecione a opção desejada: ");
            escolhaMenu = input.nextInt();
            Veiculo veiculo = null;

            switch (escolhaMenu) {

                case 1:
                    System.out.println("\n\n********  1. Criar o veículo no sistema  ********\n");
                    veiculo=criarVeiculo();
                    break;

                case 2:
                    System.out.println("\n\n********  2. Calcular o consumo do veículo  ********\n");
                    // Perguntar user distancia
                    System.out.println(veiculo.calcularConsumo(distancia)+ " L.");
                    break;

                case 3:
                    System.out.println("\n\n********  3. Fazer uma corrida Carro 1  ********\n");
                    break;

                case 4:
                    System.out.println("\n\n********  4. Fazer uma corrida Mota 1  ********\n");
                    break;

                case 5:
                    System.out.println("\n\n********  5. Fazer uma corrida Camiao 1  ********\n");
                    break;

                case 6:
                    System.out.println("\n\n********  6. Para camião. Calcular custos de viagem de transporte de carga  ********\n");

                    break;

                case 7:
                    System.out.println("\n\n********  7. Para mota. Imprimir a imagem da mota  ********\n");
                    break;

                case 0:
                    System.out.println("\nCaro corredor, \nobrigado por fazer parte da Corrida Maluca!!!\nAté a proxima!");
                    break;

                default:
                    System.out.println("\nUpppss!!\nOpção inválida... Tente outra vez!");
            }
        }
        while (escolhaMenu != 0);
    }




}
