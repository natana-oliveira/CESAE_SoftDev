package Ex_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro mercedesA45;
    Carro datsun;
    Carro ferrari;

    @BeforeEach
    void setUp() {
        mercedesA45 = new Carro("Mercedes", "A45", 2023, 420, 2000, TipoCombustivel.GASOLINA, 12);
        datsun = new Carro("Datsun", "1200", 1970, 90, 1200, TipoCombustivel.GASOLINA, 25);
        ferrari = new Carro("Ferrari", "SF90", 2023, 800, 5000, TipoCombustivel.GASOLINA, 18);
    }

    @Test
    void ligar() {
    }

    @Test
    void corrida() {
        assertEquals(mercedesA45, mercedesA45.corrida(datsun));
        assertEquals(ferrari, datsun.corrida(ferrari));
        assertEquals(ferrari, mercedesA45.corrida(ferrari));
    }
    @Test
    void calcularConsumo() {
        assertEquals(144, mercedesA45.calcularConsumo(1200));
        assertEquals(200, datsun.calcularConsumo(800));
        assertEquals(58.5, ferrari.calcularConsumo(325));
    }

}