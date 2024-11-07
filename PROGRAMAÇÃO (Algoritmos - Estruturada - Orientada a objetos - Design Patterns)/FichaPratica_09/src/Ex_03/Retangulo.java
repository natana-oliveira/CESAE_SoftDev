package Ex_03;

public class Retangulo {

    //Definir atributos de instância (retangulo)
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) { //construtor
        this.largura=largura;
        this.altura=altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro () {
        return (this.largura * 2) + (this.altura * 2 );
    }
}