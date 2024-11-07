package Geometria;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area;

        area=3.14*(raio*raio);
        System.out.println("Área do circulo: "+ area);
    }
}
