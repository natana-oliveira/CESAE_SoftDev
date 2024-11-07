package Ex_04;

public class Circulo {

    //Definir atributos de instância (circulo)
    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) { //construtor
        this.raio = raio;
        this.pi = pi;
    }

    public double calcularArea() {
        return this.pi * (this.raio * this.raio);
    }

    public double calcularCircunferencia() {
        return 2 * (this.pi * this.raio);
    }
}
