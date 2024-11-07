package CorridaVeiculos;

public class Camiao extends Veiculo{  //

    private double capacidadeCarga; // em Kg

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
        this.capacidadeCarga = capacidadeCarga;
    }


    // Método viagem que recebe como parâmetro a distância e a carga (em Kg), e avalie se o camião tem capacidade para a carga

    public void viagem(double distancia, double cargaRecebida) {
        double cargaAtual = 0;
        cargaAtual+=cargaRecebida;

        if (cargaAtual>this.capacidadeCarga){ //Carga passa da capacidade
            System.out.println("VIAGEM RECUSADA! A carga excede a capacidade máxima do Camião!");

        }else{ //Carga dentro da capacidade

            //calcular o consumo com base na carga, sabendo que cada 100Kg de carga aumentam 0,1L/100Km ao consumo
            double consumoAdicional = (cargaAtual/100) * 0.1;
            double consumoTotal= calcularConsumo(distancia) + consumoAdicional;

            // calcular o custo da viagem (considere que todos os camiões usam DIESEL)

            double custo = consumoTotal * 1.95; // preço do DIESEL

            System.out.println("VIAGEM APROVADA.");
            System.out.println("Consumo total: " + consumoTotal + " litros");
            System.out.println("Custo da viagem: " + custo + "€");
        }
    }

}
