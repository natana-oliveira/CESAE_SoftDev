package Ex_04;

import Ex_01.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo1;
    Retangulo retangulo2;
    Retangulo retangulo3;
    Retangulo retangulo4;
    Retangulo retangulo5;
    Retangulo retangulo6;

    @BeforeEach
    void setUp() {
        retangulo1 = new Retangulo(10, 2);
        retangulo2 = new Retangulo(50, 15);
        retangulo3 = new Retangulo(32, 13);
        retangulo4 = new Retangulo(-10, 13);
        retangulo5 = new Retangulo(-15, -15);
        retangulo6 = new Retangulo(0, 0);
    }

    @Test
    void calcularAreaTest() {
        double resultado1 = retangulo1.calcularArea();
        double resultado2 = retangulo2.calcularArea();
        double resultado3 = retangulo3.calcularArea();
        double resultado4 = retangulo4.calcularArea();
        double resultado5 = retangulo5.calcularArea();
        double resultado6 = retangulo6.calcularArea();

        assertEquals(20, resultado1);
        assertEquals(750, resultado2);
        assertEquals(416, resultado3);
        assertEquals(-130, resultado4);
        assertEquals(225, resultado5);
        assertEquals(0, resultado6);
    }

    @Test
    void calcularPerimetroTest() {
        double resultado1 = retangulo1.calcularPerimetro();
        double resultado2 = retangulo2.calcularPerimetro();
        double resultado3 = retangulo3.calcularPerimetro();
        double resultado4 = retangulo4.calcularPerimetro();
        double resultado5 = retangulo5.calcularPerimetro();
        double resultado6 = retangulo6.calcularPerimetro();

        assertEquals(24, resultado1);
        assertEquals(130, resultado2);
        assertEquals(90, resultado3);
        assertEquals(6, resultado4);
        assertEquals(-60, resultado5);
        assertEquals(0, resultado6);

    }
}