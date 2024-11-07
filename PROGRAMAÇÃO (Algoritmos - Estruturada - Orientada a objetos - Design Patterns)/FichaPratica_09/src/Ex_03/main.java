package Ex_03;

import Ex_01.Pessoa;

public class main {
    public static void main(String[] args) {

        //Instanciar um retangulo
        Retangulo retangulo_01 = new Retangulo(10, 7);
        Retangulo retangulo_02 = new Retangulo(200,15);

        // Calcular e apresentar a área do retangulo 01
        System.out.println("Área: " + retangulo_01.calcularArea());

        // Calcular e apresentar o perimetro do retangulo 01
        System.out.println("Perímetro: " + retangulo_01.calcularPerimetro());
    }
}
