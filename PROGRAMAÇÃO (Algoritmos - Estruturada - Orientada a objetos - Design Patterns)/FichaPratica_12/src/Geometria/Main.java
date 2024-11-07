package Geometria;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica hexagono = new FormaGeometrica();

        Retangulo retangulo1= new Retangulo(15,20);
        Triangulo triangulo1=new Triangulo(15,20);
        Circulo circulo1=new Circulo(15);

        System.out.println("****************************************");
        hexagono.calcularArea();
        System.out.println("****************************************");
        retangulo1.calcularArea();
        System.out.println("****************************************");
        triangulo1.calcularArea();
        System.out.println("****************************************");
        circulo1.calcularArea();

    }
}
