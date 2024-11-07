package Ex_01;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }


    @Override
    public double area() {
        return 3.1415*this.raio*this.raio;
    }

    @Override
    public double perimetro() {
        return 2*3.1415*this.raio;
    }
}
