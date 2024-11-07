package Geometria;

public class Retangulo extends FormaGeometrica{

    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {
        double area;
        area=largura*comprimento;
        System.out.println("Área do retângulo: " + area);
    }
}
