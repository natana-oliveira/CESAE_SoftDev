package Ex_01;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumo;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
    }

    public void ligar() {  //Metodo ligar

        int idadeCarro = 2023 - anoFabrico;

        if (idadeCarro > 30) { //Idade mais de 30
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) { //Se for a Diesel
                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado!\nVrum-vrum-vrum");
            } else { //Outro combustivel
                System.out.println("Custa a pegar… O carro está ligado!\nVrum-vrum-vrum");
            }
        } else { //Idade 30 anos ou mais recente
            if (potencia >= 250) { // se a potencia for igual ou superior a 250 cavalos
                System.out.println("O carro está ligado!\n VRUUMMMMMM");
            } else {// se a potencia for inferior a 250 cavalos
                System.out.println("O carro está ligado!\nVruummmmmmm");
            }

        }
    }

    public Carro corrida(Carro adversario) {
        if (this.potencia > adversario.potencia) {
            // Ganha o meu carro por potencia
            return this; // Devolve o meu carro (objeto que invocou o método)
        } else {
            if (this.potencia < adversario.potencia) {
                // Ganha o adversario por potencia
                return adversario;
            } else {
                // Empate de potencia
                if (this.cilindrada > adversario.cilindrada) {
                    // Ganha o meu carro por cilindrada
                    return this;
                } else {
                    if (this.cilindrada < adversario.cilindrada) {
                        // Ganha o adversario por cilindrada
                        return adversario;
                    } else {
                        // Empate de cilindrada
                        if (this.anoFabrico > adversario.anoFabrico) {
                            // Ganha o meu carro por idade
                            return this;
                        } else {
                            if (this.anoFabrico < adversario.anoFabrico) {
                                // Ganha o adversario por idade
                                return adversario;
                            }

                        }
                    }

                }
            }
        }
        return null;
    }


// método que receba como parâmetro uma distância (em km), e que calcule o valor consumido em litros do combustível

    public double calcularConsumo(double distancia) {
        double consumoLitro;

        consumoLitro = (this.consumo*distancia)/100;
        System.out.println("Consumo: " + consumoLitro + " litros");
        return consumoLitro;
    }


    public void exibirDetalhes() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println("Ano: " + this.anoFabrico);
        System.out.println("Potencia: " + this.potencia + " cv.");
        System.out.println("Cilindrada: " + this.cilindrada + " cc.");
    }
}
