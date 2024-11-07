package CorridaVeiculos;


public class Carro extends Veiculo {

    private int quantPassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, int quantPassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
        this.quantPassageiros = quantPassageiros;
    }

    // Método calcularCusto que com base no tipoCombustivel deve apresentar em € o custo da viagem (pode fazer uso de outros métodos)
    //(GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L).

    public double calcularCusto(double distanciaPercorrida){
        double custo=0;
     if (tipoCombustivel.equals(TipoCombustivel.GASOLINA)){
         custo= 2.10 * (getConsumo()*distanciaPercorrida)/100;
     }
     if (tipoCombustivel.equals(TipoCombustivel.DIESEL)){
         custo=1.95*(getConsumo()*distanciaPercorrida)/100;
     }
     if (tipoCombustivel.equals(TipoCombustivel.GPL)){
         custo=1.15*(getConsumo()*distanciaPercorrida)/100;
     }
     if (tipoCombustivel.equals(TipoCombustivel.ELETRICO)){
         custo=0.12*(getConsumo()*distanciaPercorrida)/100;
     }
        return custo;
    }

}

