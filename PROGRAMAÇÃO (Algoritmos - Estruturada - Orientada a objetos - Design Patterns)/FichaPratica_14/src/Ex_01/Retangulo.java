package Ex_01;

public class Retangulo extends FiguraGeometrica{

    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return this.comprimento*this.largura;
    }

    @Override
    public double perimetro() {
        return (this.comprimento*2)+(this.largura*2);
    }
}
