package Geometria;

public class Triangulo extends FormaGeometrica{

    private double largura;
    private double altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area;
        area=(largura*altura)/2;

        System.out.println("Área do triângulo: " + area);
    }
}
