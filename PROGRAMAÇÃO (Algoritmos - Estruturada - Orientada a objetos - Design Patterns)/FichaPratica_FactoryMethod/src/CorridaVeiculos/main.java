package CorridaVeiculos;

import java.io.FileNotFoundException;

import static CorridaVeiculos.Mota.imagem;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 120, 1600, TipoCombustivel.GASOLINA, 15.0, 5);
        Carro carro2 = new Carro("Smart", "EQ Fortwo", 2019, 61, 698, TipoCombustivel.GASOLINA, 4.7, 2);
        Carro carro3 = new Carro("Mercedes","A45", 2023,420,2000, TipoCombustivel.GASOLINA,15,5);
        Mota mota1 = new Mota("Honda", "CBR500R", 2021, 47, 471, TipoCombustivel.GASOLINA, 25.0);
        Camiao camiao1 = new Camiao("Volvo", "FH16", 2022, 600, 16000, TipoCombustivel.DIESEL, 30, 5000);


        Veiculo vencedor1 = carro1.corrida(carro2);
        System.out.println("***** Vencedor da corrida entre carros *****\n");
        vencedor1.exibirDetalhes();
        System.out.println();

        Veiculo vencedor2 = mota1.corrida(camiao1);
        System.out.println("***** Vencedor da corrida entre mota e camião *****\n");
        vencedor2.exibirDetalhes();
        System.out.println();

        System.out.println("*******************************");
        System.out.println("Custo da viagem: "+ carro3.calcularCusto(50) + "€");
        System.out.println("*******************************");


        System.out.println("*******************************");
        System.out.println("Custo da viagem: "+ carro1.calcularCusto(150) + "€");
        System.out.println("*******************************");


        System.out.println();
        System.out.println("***** Viagens do camião *****\n");
        camiao1.viagem(5000, 3250);
        System.out.println();
        camiao1.viagem(3500, 5250);
        System.out.println();

        imagem("src/CorridaVeiculos/Mota.txt");

    }
}
