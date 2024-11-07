package Ex_04;

import Ex_03.Retangulo;
public class main {

    public static void main(String[] args) {

        //Instanciar um circulo
        Circulo circulo_01 = new Circulo(5);

        // Calcular e apresentar a área do circulo
        System.out.println("Área: " + circulo_01.calcularArea());

        // Calcular e apresentar a circunferencia do circulo
        System.out.println("Circunferência: " + circulo_01.calcularCircunferencia());

    }
}
